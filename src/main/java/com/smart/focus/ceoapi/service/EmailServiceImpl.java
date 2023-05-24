package com.smart.focus.ceoapi.service;

import java.io.File;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.smart.focus.ceoapi.common.CommonLib;
import com.smart.focus.ceoapi.common.Log;
import com.smart.focus.ceoapi.common.MailHandler;
import com.smart.focus.ceoapi.domain.MailDomain;


@Service
public class EmailServiceImpl {
	
	public String mailSend(MailDomain mailDto, JavaMailSender sender, boolean isMulti) throws Exception 
	{
	    try 
	    {
	    	MailHandler mailHandler = new MailHandler(sender, isMulti);	   
	        
	        // 받는 사람
	    	String to="";
	    	if(mailDto.toAddress != null)
	    	{
	    		String[] split = mailDto.toAddress.split("/");
	    		if(split.length > 1)
	    		{
			    	for(int i=0; i < split.length; i++)
			    	{
			    		if(CommonLib.isValidEmail(split[i].trim()) )
		    				to += split[i].trim()+"/";
			    	}
			    	to =  to.substring(0,to.length()-1);
		    		mailHandler.setTo(to.split("/"));
	    		}else {
	    			mailHandler.setTo(mailDto.toAddress.trim());
	    		}
	    	}
	    	
	    	// 참조
	    	String cc = "";
	    	if(mailDto.ccAddress != null)
	    	{
	    		String[] ccSplit = mailDto.ccAddress.split("/");
	    		if(ccSplit.length > 1)
	    		{
		    		for(int i=0; i < ccSplit.length; i++)
			    	{
		    			if(CommonLib.isValidEmail(ccSplit[i].trim()) )
		    				cc += ccSplit[i].trim()+"/";
			    	}
		    		cc =  cc.substring(0,cc.length()-1);
		    		mailHandler.setCc(cc.split("/"));
	    		} else {
	    			mailHandler.setCc(mailDto.ccAddress.trim());
	    		}
	    	}
	    	// 참조
	    	String bcc = "";
	    	if(mailDto.bccAddress != null)
	    	{
	    		String[] bccSplit = mailDto.bccAddress.split("/");
	    		if(bccSplit.length > 1)
	    		{
		    		for(int i=0; i < bccSplit.length; i++)
			    	{
		    			if(CommonLib.isValidEmail(bccSplit[i].trim()) )
		    				bcc += bccSplit[i].trim()+"/";
			    	}
		    		bcc =  bcc.substring(0,bcc.length()-1);
		    		mailHandler.setBcc(bcc.split("/"));   
	    		}else {
	    			mailHandler.setCc(mailDto.bccAddress.trim());
	    		}
	    	}
	    	
	        // 보내는 사람
	    	mailHandler.setFrom(mailDto.fromAddress);
	        // 제목
	    	mailHandler.setSubject(mailDto.title);
	        // HTML Layout
	    	mailHandler.setText(mailDto.content, true);

	        // 첨부 파일
	    	for(int i=0; i < mailDto.attachedFile.size(); i++)
	    	{
	    		mailHandler.setAttach(mailDto.attachedFile.get(i).get("fileName").toString(), (File)mailDto.attachedFile.get(i).get("path"));
	    	}
	
	        mailHandler.send();
	    }
	    catch(Exception e){
	        Log.Error(e.getMessage());
	        throw new Exception(e.getMessage());
	    }
	    return null;
	}
	
}
