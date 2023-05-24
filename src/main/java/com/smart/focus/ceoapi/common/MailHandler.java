package com.smart.focus.ceoapi.common;

import java.io.File;
import java.io.IOException;

import javax.mail.Address;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeUtility;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class MailHandler {
	private JavaMailSender sender;
    private MimeMessage message;
    private MimeMessageHelper messageHelper;

    // 생성자
    public MailHandler(JavaMailSender jSender, boolean isMulti) throws
            MessagingException {
        this.sender = jSender;
        System.setProperty("mail.mime.splitlongparameters", "false");
        message = jSender.createMimeMessage();     
        if(isMulti)
        {
        	message.setRecipients(Message.RecipientType.BCC, new Address[]{});
        }
        messageHelper = new MimeMessageHelper(message, true, "UTF-8");
    }

    // 보내는 사람 이메일
    public void setFrom(String fromAddress) throws MessagingException {
        messageHelper.setFrom(fromAddress);
    }

    // 받는 사람 이메일
    public void setTo(String email) throws MessagingException {
        messageHelper.setTo(email);
    }
    public void setTo(String[] email) throws MessagingException {
        messageHelper.setTo(email);
    }
    
    // 참 이메일
    public void setCc(String cc) throws MessagingException {
        messageHelper.setCc(cc);
    }
    public void setCc(String[] cc) throws MessagingException {
        messageHelper.setCc(cc);
    }
 // 참 이메일
    public void setBcc(String cc) throws MessagingException {
        messageHelper.setBcc(cc);
    }
    public void setBcc(String[] cc) throws MessagingException {
        messageHelper.setBcc(cc);
    }

    // 제목
    public void setSubject(String subject) throws MessagingException {
        messageHelper.setSubject(subject);
    }

    // 메일 내용
    public void setText(String text, boolean useHtml) throws MessagingException {
        messageHelper.setText(text, useHtml);
    }

    // 첨부 파일
    public void setAttach(String displayFileName, File fsr) throws MessagingException, IOException {
        messageHelper.addAttachment( MimeUtility.encodeText(displayFileName, "UTF-8", "B"), fsr);
    }

    // 이미지 삽입
    public void setInline(String contentId, String pathToInline) throws MessagingException, IOException {
        File file = new ClassPathResource(pathToInline).getFile();
        FileSystemResource fsr = new FileSystemResource(file);

        messageHelper.addInline(contentId, fsr);
    }

    // 발송
    public String send() throws Exception {
        try {
            sender.send(message);
        }catch(Exception e) {
            e.printStackTrace();
            throw new Exception( e.getMessage() );
        }
        
        return null;
    }
}
