package com.smart.focus.ceoapi.domain;

import java.util.ArrayList;
import java.util.Map;

@SuppressWarnings("rawtypes")
public class MailDomain {
	@SuppressWarnings("unchecked")
	public  MailDomain()
	{
		attachedFile = new ArrayList();
		ccAddress = null;
		toAddress = null;
		bccAddress = null;
	}
	public String title;
	public String fromAddress;
	public String toAddress;
	public String ccAddress;
	public String bccAddress;
	public ArrayList<Map<String,Object>> attachedFile;
	public String content;
}
