package com.smart.focus.ceoapi.service.SoapService.SoapApiClass;

import org.springframework.ws.transport.http.HttpUrlConnectionMessageSender;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.util.Base64;
import java.util.Base64.Encoder;

public class CredentialSender extends HttpUrlConnectionMessageSender {
    private String credentialUser = "";
    private String credentialPw = "";

    public CredentialSender(String user, String pw) {
        credentialUser = user;
        credentialPw = pw;
    }

    @Override
    public void prepareConnection(HttpURLConnection connection) throws IOException {
        Encoder encoder = Base64.getEncoder();

        String userpassword = credentialUser + ":" + credentialPw;
        byte[] encodedBytes = encoder.encode(userpassword.getBytes());
        connection.setRequestProperty("Authorization", "Basic " + new String(encodedBytes));
        super.prepareConnection(connection);
    }

}
