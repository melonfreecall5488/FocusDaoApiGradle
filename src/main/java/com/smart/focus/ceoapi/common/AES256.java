package com.smart.focus.ceoapi.common;

import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.util.Random;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

import org.apache.tomcat.util.codec.binary.Base64;

public class AES256 {
	static String[] chars = "a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,1,2,3,4,5,6,7,8,9,0,A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,Z"
			.split(",");

	public static String getAesKey() {
		StringBuffer buffer = new StringBuffer();
		Random random = new Random();

		for (int i = 0; i < 22; i++) {
			buffer.append(chars[random.nextInt(chars.length)]);
		}
		return buffer.toString();
	}

	public static String getEncodeString(String text, String key, String iv) throws NoSuchAlgorithmException,
			GeneralSecurityException, UnsupportedEncodingException {
		// Log.Debug(key);
		Key keySpec = getAesKey(key);
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes("UTF-8")));
		byte[] encrypted = c.doFinal(text.getBytes("UTF-8"));
		String enStr = new String(Base64.encodeBase64(encrypted));
		return enStr;

	}

	public static String getEncodeString(byte[] text, String key, String iv) throws NoSuchAlgorithmException,
			GeneralSecurityException, UnsupportedEncodingException {
		// Log.Debug(key);
		Key keySpec = getAesKey(key);
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.ENCRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes("UTF-8")));
		byte[] encrypted = c.doFinal(text);
		String enStr = new String(Base64.encodeBase64(encrypted));
		return enStr;

	}

	public static String getDecodeString(String text, String key, String iv) throws NoSuchAlgorithmException,
			GeneralSecurityException, UnsupportedEncodingException {
		SecretKey keySpec = getAesKey(key);
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes("UTF-8")));
		byte[] byteStr = Base64.decodeBase64(text.getBytes("UTF-8"));
		return new String(c.doFinal(byteStr), "UTF-8");
	}

	public static String getDecodeString(byte[] text, String key, String iv) throws NoSuchAlgorithmException,
			GeneralSecurityException, UnsupportedEncodingException {
		SecretKey keySpec = getAesKey(key);
		Cipher c = Cipher.getInstance("AES/CBC/PKCS5Padding");
		c.init(Cipher.DECRYPT_MODE, keySpec, new IvParameterSpec(iv.getBytes("UTF-8")));
		byte[] byteStr = Base64.decodeBase64(text);
		return new String(c.doFinal(byteStr), "UTF-8");
	}

	public static SecretKey getAesKey(String key) {
		byte[] b = key.getBytes();
		SecretKey keySpec = new SecretKeySpec(b, "AES");
		return keySpec;
	}

}
