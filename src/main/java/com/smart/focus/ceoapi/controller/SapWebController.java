package com.smart.focus.ceoapi.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.JsonObject;
import com.smart.focus.ceoapi.Interceptor.PreAuth;
import com.smart.focus.ceoapi.common.BadRequestException;
import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.ConstDef;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.PacketResult;
import com.smart.focus.ceoapi.service.SpProcServiceImpl;
import com.smart.focus.ceoapi.service.SoapService.SoapService;
import com.smart.focus.ceoapi.service.SoapService.SoapApiClass.ByDRestApi;

@RestController
@CrossOrigin(allowCredentials = "true", originPatterns = "*")
@RequestMapping("/restApi")
public class SapWebController {
	@Autowired
	private SoapService soapService;

	@RequestMapping(value = "/saptest", method = { RequestMethod.GET, RequestMethod.POST })
	public String test(HttpServletRequest request, HttpServletResponse response,
			@RequestParam(value = "data", required = true, defaultValue = "0") String data) {
		Log.Debug("test Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());

		JSONArray result = new JSONArray();
		/*
		 * JSONArray result = soapService.reqInputList();
		 * 
		 * for (int i = 0; i < result.size(); i++) {
		 * Log.Debug("입고품번:%s 수량: %s",
		 * (String)((JSONObject)result.get(i)).get("sourceLogisticsAreaId"),
		 * (String)((JSONObject)result.get(i)).get("identifiedStockId"));
		 * }
		 * 
		 * JSONArray result2 = soapService.reqOutputList();
		 * for (int i = 0; i < result2.size(); i++) {
		 * Log.Debug("출고품번:%s 수량: %s",
		 * ((JSONObject)result2.get(i)).get("siteLogisticsLotMaterialInputUuid").
		 * toString(), ((JSONObject)result2.get(i)).get("openQuantity").toString());
		 * }
		 * JSONArray result = soapService.reqMaterial();
		 * JSONArray resulta = soapService.reqMaterial();
		 * JSONArray result = soapService.reqSupplier();
		 * JSONArray result = soapService.reqCustomer();
		 * JSONArray result = soapService.reqProductOrder();
		 */
		// soapService.sendToSapInputResult();
		// soapService.reqInputList();
		// soapService.reqProductOrder();
		// soapService.sendToSapProductResult();
		// soapService.sendToSapOutputResult();
		// 동종재고 생성
		// soapService.stockCheck();
		// 동종재고 조회
		// soapService.selectStock();
		// soapService.sendToSapInputResult();

		return result.toJSONString();
	}

	// pop data sap 전송
	@PreAuth
	@RequestMapping(value = "/updatePurchaseInput", method = { RequestMethod.GET, RequestMethod.POST })
	public String updatePurchaseInput(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("상품/자재 입고 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapInputResult();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updatePurchaseReturn", method = { RequestMethod.GET, RequestMethod.POST })
	public String updatePurshaseReturn(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("불량반품(입고반송) 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapOutputResult();
		return null;
	}

	// 사용하지 않음
	@PreAuth
	@RequestMapping(value = "/updateProductInput", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateProductInput(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("완제품 입고 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapProductResult();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updatePostPacking", method = { RequestMethod.GET, RequestMethod.POST })
	public String updatePostPackingCBO(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("택배 출하 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapPostPackingListCBO();
		return null;
	}
	
	@PreAuth
	@RequestMapping(value = "/updateOthersPacking", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateOthersPacking(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("기타 출하 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapOthersOutByPickingOrder();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updateGoodsMovement", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateGoodsMovement(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("매장 이동 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendGoodsMovement();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updateOrderSetUnsetPicking/{typeIf}", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateOrderSetUnsetPicking(HttpServletRequest request, HttpServletResponse response,
			@PathVariable Integer typeIf) {
		Log.Debug("세트 상품(구성/해체) Picking 내역 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());
		soapService.sapSendSetUnsetPicking(typeIf);
		return null;
	}
	
	@PreAuth
	@RequestMapping(value = "/updateOrderSetUnsetInput/{typeIf}", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateOrderSetUnsetInput(HttpServletRequest request, HttpServletResponse response,
			@PathVariable Integer typeIf) {
		Log.Debug("세트 상품(구성/해체) Picking 내역 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());
		soapService.sapSendSetUnsetInput(typeIf);
		return null;
	}

	// 사용하지 않음
	@PreAuth
	@RequestMapping(value = "/updateStorePicking", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateStorePickingCBO(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("매장 출하 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		// to do 창고이동 API 호출해야됨 !
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updateCustomerTakeBack", method = { RequestMethod.GET, RequestMethod.POST })
	public String updatePriductReturn(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("판매품반송(고객반송) 입고 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapOutputReturnResult();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updateSapOthersInOut", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateSapOthersInOut(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("기타입출고 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		soapService.sendToSapOthersInOut();
		return null;
	}

	@PreAuth
	@RequestMapping(value = "/updateSapInOutList", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateSapInOutList(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("updateSapInOutList  업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request),
				request.getSession().getId());
		soapService.reqInputList();
		soapService.reqMaterialV2();
		// soapService.reqSupplier();
		// soapService.reqCustomer();
		return "SUCCESS";
	}

	@PreAuth
	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/updateItemList", method = { RequestMethod.GET, RequestMethod.POST })
	public String updateItemList(HttpServletRequest request, HttpServletResponse response) {
		Log.Debug("item list 업데이트 Client=%s Session Id= %s", CommonLib.getRemoteIp(request), request.getSession().getId());
		JSONObject jsonObj = new JSONObject();
		try {
			soapService.reqMaterialV2();
		} catch (Exception e) {
			Log.Error(this.getClass(), e.getMessage());
			jsonObj.put("result", PacketResult.SAP_EXCEPTION);
			return jsonObj.toJSONString();
		}
		jsonObj.put("result", PacketResult.SUCCESS);
		Log.Debug(jsonObj.toJSONString());

		return jsonObj.toJSONString();
	}
	
	@PreAuth
	@RequestMapping(value = "/refreshSapResult", method = { RequestMethod.GET, RequestMethod.POST })
	public String refreshSapResult(HttpServletRequest request, HttpServletResponse response,
			@RequestBody String data) {
		Log.Debug(data);

		JSONParser parser = new JSONParser();
		JSONObject param = null;
		try {
			param = (JSONObject) parser.parse(data);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		switch (param.get("operationType").toString()) {
			case "자재입고":
				soapService.sendToSapInputResult();
				soapService.sendToSapOutputResult();
				break;
			case "고객반품":
				soapService.sendToSapOutputReturnResult();
				break;
			case "택배배송":
			case "일반배송":
			case "매장배송":
				soapService.sendToSapPostPackingListCBO();
				break;
		}
		return null;
	}
}
