package com.smart.focus.ceoapi.common.ThreadPool;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

import com.smart.focus.ceoapi.common.ClientSocket;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;

public class QrCodePrintRunnable implements Runnable {
    SpProcServiceImpl service = null;
    String printName = null;
    ClientSocket sock = new ClientSocket();
    String beforeIp = "";

    public QrCodePrintRunnable(SpProcServiceImpl service, String printName) {
        this.service = service;
        this.printName = printName;
        Log.Trace("PrintName = %s", printName);
    }

    @Override
    public void run() {
        Log.Debug("QrCodePrintRunnable 프린터명=%s", printName);
        String sql = String.format("SELECT * FROM %s.프린팅대기 WHERE 완료 < 장수 AND 프린터명='%s' ORDER BY 지역,프린터명,CreateTime",
                ConstDef.DATA_BASE, printName);
        List<Map<String, Object>> array = service.runSqlSelect(sql);

        if (array.size() == 0)
            return;
        byte[] zpl = null;
        for (int i = 0; i < array.size(); i++) {
            String zplCommand = (String) array.get(i).get("zpl");
            if (zplCommand != null) {
                try {
                    zpl = zplCommand.getBytes("euc-kr");
                } catch (UnsupportedEncodingException e) {
                    Log.Error(e.getMessage());
                }
            } else {
                zpl = this.makeZpl(array.get(i).get("QR_CODE").toString(), array.get(i).get("문자").toString(),
                        array.get(i).get("문자2").toString(), array.get(i).get("항목").toString(),
                        array.get(i).get("항목2").toString());
            }
            // send zpl to printer
            if (!beforeIp.equals(array.get(i).get("프린터주소").toString())) {
                if (sock.isConnected()) {
                    sock.close();
                }
                sock.connect(array.get(i).get("프린터주소").toString(),
                        Short.parseShort(array.get(i).get("포워딩포트").toString()));
                if (sock.isConnected()) {
                    this.beforeIp = array.get(i).get("프린터주소").toString();
                }
                Log.Debug("ip=%s", array.get(i).get("프린터주소").toString());
            }
            if (sock.isConnected()) {
                int qty = Integer.parseInt(array.get(i).get("장수").toString())
                        - Integer.parseInt(array.get(i).get("완료").toString());
                int retryCount = 0;
                for (int j = 0; j < qty; j++) {
                    try {
                        sock.send("~HS");
                        sock.receive();
                        sock.send(zpl);
                        Thread.sleep(500);
                        // sock.send(zpl);
                        // Thread.sleep(500);
                    } catch (IOException | InterruptedException e) {
                        this.sock.close();
                        Log.Error(e.getMessage());
                        retryCount++;
                        if (retryCount > 3) {
                            return;
                        } else {
                            j = j-1;
                        }
                    }
                }
                sql = String.format("UPDATE %s.프린팅대기 SET 완료=완료+1 WHERE SEQ_ID=%s", ConstDef.DATA_BASE,
                        array.get(i).get("SEQ_ID").toString());
                service.directCallSql(sql);
            } else {
                Log.Error("printer not connected");
                break;
            }
        }
        this.sock.close();
    }

    private byte[] makeZpl(String qrCode, String text, String text2, String title, String title2) {
        byte[] euckr = null;

        // String result =
        // String.format("^XA~TA000~JSN^LT0^MNW^MTT^PON^PMN^LH0,0^JMA^PR7,7~SD24^JUS^LRN^CI0^XZ"+
        String result = String.format("^XA~TA000~JSN^LT0^MNW^MTT^PON^PMN^LH0,0^JMA^PR7,7~SD24^JUS^LRN^CI0^XZ" +
                "^XA" +
                "^MMT" +
                "^PW559" +
                "^LL0559" +
                "^LS0" +
                "^FO53,36^GB490,498,8^FS" +
                "^FO56,96^GB485,0,8^FS" +
                "^FO56,157^GB485,0,8^FS" +
                "^SEE:UHANGUL.DAT^FS" +
                "^CW1,E:corefont.TTF^CI26^FS" +
                "^FT68,79^A1N,27,36^FD%s^FS" +
                "^FT68,141^A1N,27,36^FD%s^FS" +
                "^FO160,44^GB0,54,8^FS" +
                "^FO160,103^GB0,54,8^FS" +
                "^FT160,510^BQN,2,10" +
                "^FH\\^FDLA,%s^FS" +
                "^FT168,79^A1N,27,36^FD%s^FS" +
                "^FT168,141^A1N,27,36^FD%s^FS " +
                "^PQ1,0,1,Y^XZ", title, title2, qrCode, text, text2);

        /*
         * String result = String.format(
         * "^XA~TA000~JSN^LT0^MNW^MTT^PON^PMN^LH0,0^JMA^PR7,7~SD24^JUS^LRN^CI0^XZ"+
         * "^XA"+
         * "^MMT"+
         * "^PW559"+
         * "^LL0559"+
         * "^LS0"+
         * "^SEE:UHANGUL.DAT^FS"+
         * "^CW1,E:corefont.TTF^CI26^FS"+
         * "^FT100,115^A1N,37,36^FD%s^FS"+
         * "^FT161,480^BQN,2,10"+
         * "^FH\\^FDLA,%s^FS"+
         * "^PQ1,0,1,Y^XZ",text, qrCode);
         */
        /*
         * String result =
         * "^XA"+
         * "^BY2,2.0^FS"+
         * "^SEE:UHANGUL.DAT^FS"+
         * "^CW1,E:corefont.TTF^CI26^FS"+
         * "^FO50,50^A0,40,40^FDCOREFORCE.CO.KR^FS"+
         * "^FO50,100^A0,40,40^FD02-867-7430^FS"+
         * "^FO50,150^B3N,N,50,Y^FD1234567890^FS"+
         * "^FO50,250^A1N,30,30^FD corefont^FS"+
         * "^FO10,300^A1N,30,30^FD안녕하세요^FS"+
         * "^PQ1,1,1,Y^FS"+
         * "^XZ";
         */

        try {
            euckr = result.getBytes("euc-kr");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return euckr;
    }
}
