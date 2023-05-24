package com.smart.focus.ceoapi.crontab;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;

import com.smart.focus.ceoapi.common.ClientSocket;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.service.SoapService.SoapService;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@SuppressWarnings({ "unchecked" })
public class Crontab {

	private String mHostName = null;
	private ClientSocket sock = new ClientSocket();

	@Autowired
	private SoapService soapService;
	@Autowired
	private SpProcServiceImpl storeProcService;

	public boolean isRealServer() {
		if (this.mHostName == null) {
			try {
				InetAddress addr = InetAddress.getLocalHost();
				mHostName = addr.getHostName();
				Log.Trace("HostName =  %s", this.mHostName);
			} catch (UnknownHostException e) {
				Log.Error(e.getMessage());
			}
		}

		return false; //this.mHostName.equals(ConstDef.SERVICE_HOST_NAME);
	}

	@Scheduled(cron = "00 30 8,12 * * *")
	public void refreshSapMasterData() {
		if (!isRealServer())
			return;
		Log.Trace("Cron Start refreshSapMasterData");
		// soapService.reqCustomer();
		// soapService.reqSupplier();
		// soapService.reqProductOrder();
		// soapService.reqInputList();
		// soapService.reqMaterialV2();
		String delDate = CommonLib.calTime(-12, "yyyy-MM-dd HH:mm", "HH");
		Log.Debug("프린트 대기 삭제 time = %s", delDate);
		String sql = String.format("DELETE FROM %s.프린팅대기 WHERE CreateTime<'%s';", ConstDef.DATA_BASE, delDate);
		storeProcService.directCallSql(sql);
	}

	@Scheduled(cron = "00 00 19 * * *")
	public void updateToSap() {
		if (!isRealServer())
			return;
		Log.Trace("Cron Start updateToSap");
		// TO DO 상용SOAP URL 설정후 remark 삭제 적용
		// soapService.sendToSapInputResult();
		// soapService.sendToSapOutputResult();
		// soapService.sendToSapPostPackingListCBO();
		// soapService.sendGoodsMovement();
		// soapService.sapSendSetUnsetPicking(ConstDef.SET_PICKING);
		// soapService.sapSendSetUnsetInput(ConstDef.SET_INPUT);
		// soapService.sapSendSetUnsetPicking(ConstDef.UNSET_PICKING);
		// soapService.sapSendSetUnsetInput(ConstDef.UNSET_INPUT);
		// soapService.sendToSapOthersInOut();
		// soapService.sendToSapOutputReturnResult();

	}

	@Scheduled(cron = "00 00 0,12 * * *")
	public void pingToZplPrint() {
		if (!isRealServer())
			return;
		String sql = String.format("select * from %s.프린터설정", ConstDef.DATA_BASE);
		List<Map<String, Object>> array = storeProcService.runSqlSelect(sql);
		for (int i = 0; i < array.size(); i++) {
			sock.connect(array.get(i).get("프린터주소").toString(),
					Short.parseShort(array.get(i).get("포워딩포트").toString()));
			if (sock.isConnected()) {
				try {
					sock.send("~HS");
					// Log.Trace("%s", sock.receive());
					Log.Trace("ZPL printer ping Success ip=%s",
							array.get(i).get("프린터주소").toString());
				} catch (IOException e) {
					this.sock.close();
					Log.Error("ip=%s 프린터 응답없음", array.get(i).get("프린터주소").toString());
				}
				this.sock.close();
			}
		}
	}

	@Scheduled(cron = "00 00 00 1 * *")
	public void alterQrcodeNo() {
		if (!isRealServer())
			return;
		Log.Trace("Cron Start alterQrcodeNo");

		JSONObject sendParam = new JSONObject();
		JSONObject param = new JSONObject();
		JSONArray psArray = new JSONArray();
		sendParam.put("proc", "spAlterQrCodeSerialNo");
		sendParam.put("db", ConstDef.DATA_BASE);
		psArray.add(param);
		sendParam.put("ps", psArray);
		storeProcService.update(sendParam);
	}
}
