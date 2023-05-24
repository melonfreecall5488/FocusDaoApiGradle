package com.smart.focus.ceoapi.common;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

public class ClientSocket {

    Socket mSocket = null;

    public void connect(String ipAddress, short port) {
        Log.Debug("print ip =%s port=%d", ipAddress, port);
        try {
            mSocket = new Socket();
            // 로컬:9999 포트에 서버에 접속한다.
            InetSocketAddress ipep = new InetSocketAddress(ipAddress, port);
            // 접속
            mSocket.connect(ipep, 2000);
        } catch (Throwable e) {
            Log.Error(e.getMessage());
        }

    }

    public void send(String sendText) throws IOException {
        if (isConnected()) {
            OutputStream os = mSocket.getOutputStream();
            os.write(sendText.getBytes());
        }
    }

    public void send(byte[] sendText) throws IOException {
        if (isConnected()) {
            OutputStream os = mSocket.getOutputStream();
            os.write(sendText);
        }
    }

    public String receive() throws IOException {
        if (isConnected()) {
            mSocket.setSoTimeout(1000);
            InputStream os = mSocket.getInputStream();
            byte[] b = new byte[1024];
            int len = os.read(b);
            Log.Debug("read byte = %d", len);
            return new String(b);
        }
        return null;
    }

    public void close() {
        try {
            if (isConnected())
                this.mSocket.close();
        } catch (IOException e) {
            Log.Error(e.getMessage());
        }
    }

    public boolean isConnected() {
        if (this.mSocket == null) {
            return false;
        }
        return this.mSocket.isConnected();
    }

}
