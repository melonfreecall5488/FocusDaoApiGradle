package com.smart.focus.ceoapi.controller;

import com.smart.focus.ceoapi.common.Log;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class StompController {

	@MessageMapping("/packingBarcodeScan")
	@SendTo("/topic/packingInspection")
	public String greeting(String message) throws Exception {
		Log.Debug("machineFaultReg STOMP Messge");
		return message;
	}
}
