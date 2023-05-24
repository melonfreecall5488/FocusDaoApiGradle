package com.smart.focus.ceoapi.common;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.RSAPublicKeySpec;
import java.util.Base64;

import javax.crypto.Cipher;

public class RSA {

   private String publicKeyModulus = "";
   private String publicKeyExponent = "";
   private PrivateKey privateKey = null;

   public static RSA getEncKey() {

      KeyPairGenerator generator;
      try {
         generator = KeyPairGenerator.getInstance("RSA");
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
         return null;
      } // RSA?�� ?��?��?��?��?�� ?��?��
      generator.initialize(1536); // ?�� ?��?���?

      KeyPair keyPair = generator.genKeyPair();

      KeyFactory keyFactory;
      try {
         keyFactory = KeyFactory.getInstance("RSA");
      } catch (NoSuchAlgorithmException e) {
         e.printStackTrace();
         return null;
      }

      PublicKey publicKey = keyPair.getPublic(); // 공개?��
      PrivateKey privateKey = keyPair.getPrivate(); // 개인?��

      RSAPublicKeySpec publicSpec;
      try {
         publicSpec = (RSAPublicKeySpec) keyFactory.getKeySpec(publicKey, RSAPublicKeySpec.class);
      } catch (InvalidKeySpecException e) {
         e.printStackTrace();
         return null;
      }
      String publicKeyModulus = publicSpec.getModulus().toString(16);
      String publicKeyExponent = publicSpec.getPublicExponent().toString(16);

      RSA rsa = new RSA();
      rsa.setPrivateKey(privateKey);
      rsa.setPublicKeyExponent(publicKeyExponent);
      rsa.setPublicKeyModulus(publicKeyModulus);

      return rsa;
   }

   public static boolean dec(PrivateKey privateKey, String encString) throws Exception {
      boolean result = false;

      if (privateKey == null) {
         throw new RuntimeException("?��?��?�� 비�??�� ?��보�?? 찾을 ?�� ?��?��?��?��.");
      }
      try {
         decryptRsa(privateKey, encString);
         result = true;
      } catch (Exception e) {
         e.printStackTrace();
         result = false;
      }

      return result;
   }

   public static String decryptRsa(PrivateKey privateKey, String securedValue) throws Exception {
      // System.out.println("will decrypt : " + securedValue);
      Cipher cipher = Cipher.getInstance("RSA");
      byte[] encryptedBytes = hexToByteArray(securedValue);
      cipher.init(Cipher.DECRYPT_MODE, privateKey);
      byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
      String decryptedValue = new String(decryptedBytes, "utf-8"); // 문자 ?��코딩 주의.
      return decryptedValue;
   }

   public static String decryptRsaBase64(PrivateKey privateKey, String securedValue) throws Exception {
      // System.out.println("will decrypt : " + securedValue);
      Cipher cipher = Cipher.getInstance("RSA");
      byte[] encryptedBytes = Base64.getDecoder().decode(securedValue);
      // byte[] encryptedBytes = hexToByteArray(hh);
      cipher.init(Cipher.DECRYPT_MODE, privateKey);
      byte[] decryptedBytes = cipher.doFinal(encryptedBytes);
      String decryptedValue = new String(decryptedBytes, "utf-8");
      return decryptedValue;
   }

   public static String encryptRsa(String publicKeyModule, String publicExponent, String data) {
      String result = null;
      BigInteger modulus = new BigInteger(publicKeyModule, 16);
      BigInteger exponent = new BigInteger(publicExponent, 16);
      RSAPublicKeySpec pubks = new RSAPublicKeySpec(modulus, exponent);
      byte[] cipherText = null;

      try {
         KeyFactory keyFactory = KeyFactory.getInstance("RSA");

         PublicKey publicKey = keyFactory.generatePublic(pubks);
         Cipher cipher = Cipher.getInstance("RSA");
         cipher.init(Cipher.ENCRYPT_MODE, publicKey);
         cipherText = cipher.doFinal(data.getBytes());
         // result = Base64.getEncoder().encodeToString(cipherText);
         result = new java.math.BigInteger(cipherText).toString(16);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;

   }

   public static String encryptRsaBase64(String publicKeyModule, String publicExponent, String data) {
      String result = null;
      BigInteger modulus = new BigInteger(publicKeyModule, 16);
      BigInteger exponent = new BigInteger(publicExponent, 16);
      RSAPublicKeySpec pubks = new RSAPublicKeySpec(modulus, exponent);
      byte[] cipherText = null;

      try {
         KeyFactory keyFactory = KeyFactory.getInstance("RSA");

         PublicKey publicKey = keyFactory.generatePublic(pubks);
         Cipher cipher = Cipher.getInstance("RSA");
         cipher.init(Cipher.ENCRYPT_MODE, publicKey);
         cipherText = cipher.doFinal(data.getBytes());
         result = Base64.getEncoder().encodeToString(cipherText);
         // result = new java.math.BigInteger(cipherText).toString(16);

      } catch (Exception e) {
         e.printStackTrace();
      }
      return result;

   }

   public static byte[] hexToByteArray(String hex) {
      if (hex == null || hex.length() % 2 != 0) {
         return new byte[] {};
      }

      byte[] bytes = new byte[hex.length() / 2];
      for (int i = 0; i < hex.length(); i += 2) {
         byte value = (byte) Integer.parseInt(hex.substring(i, i + 2), 16);
         bytes[(int) Math.floor(i / 2)] = value;
      }
      return bytes;
   }

   public String getPublicKeyModulus() {
      return publicKeyModulus;
   }

   public void setPublicKeyModulus(String publicKeyModulus) {
      this.publicKeyModulus = publicKeyModulus;
   }

   public String getPublicKeyExponent() {
      return publicKeyExponent;
   }

   public void setPublicKeyExponent(String publicKeyExponent) {
      this.publicKeyExponent = publicKeyExponent;
   }

   public PrivateKey getPrivateKey() {
      return privateKey;
   }

   public void setPrivateKey(PrivateKey privateKey) {
      this.privateKey = privateKey;
   }

}
