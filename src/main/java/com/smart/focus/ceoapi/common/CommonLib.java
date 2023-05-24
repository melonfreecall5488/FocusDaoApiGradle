package com.smart.focus.ceoapi.common;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.HttpURLConnection;
import java.net.URL;
import java.security.MessageDigest;
import java.security.cert.X509Certificate;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSession;
import javax.net.ssl.X509TrustManager;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import org.json.simple.JSONObject;
import org.springframework.web.multipart.MultipartHttpServletRequest;
@SuppressWarnings({ "unchecked", "rawtypes" })
public class CommonLib {
	static Long gLimit = null;

	public static List<Map<String, Object>> sortList(List<Map<String, Object>> list, String key) {

		int size = list.size();

		for (int i = 0; i < size - 1; i++) {
			for (int j = i + 1; j < size; j++) {
				String tmp = list.get(i).get(key).toString();
				String next = list.get(j).get(key).toString();
				if (tmp.compareTo(next) > 0) {
					Map<String, Object> swap1 = list.get(i);
					Map<String, Object> swap2 = list.get(j);

					list.remove(i);
					list.add(i, swap2);
					list.remove(j);
					list.add(j, swap1);
				}
			}

		}
		return list;
	}

	public static void CreateRsaKey(HttpServletRequest request) {

		RSA rsa = RSA.getEncKey();
		// PrivateKey pk= rsa.getPrivateKey();
		// PKCS8EncodedKeySpec pkcs8EncodedKeySpec=new
		// PKCS8EncodedKeySpec(pk.getEncoded());

		// byte[] temp = pkcs8EncodedKeySpec.getEncoded();
		// String base = Base64.getEncoder().encodeToString(temp);
		// Log.Debug("pk=%s",base);

		request.getSession().setAttribute("publicKeyModulus", rsa.getPublicKeyModulus());
		request.getSession().setAttribute("publicKeyExponent", rsa.getPublicKeyExponent());
		request.getSession().setAttribute("__rsaPrivateKey__", rsa.getPrivateKey());
	}

	public static void SetLoginCookies(String set_flag, String encId, HttpServletResponse response,
			HttpServletRequest request, int keep_hour) {
		if (set_flag.equals("1"))// login ��?吏��슜 ?��좏궎�깮�꽦
		{
			Cookie cookie = new Cookie("LOGIN_SAVE", encId);

			cookie.setMaxAge(keep_hour * 60 * 60);

			response.addCookie(cookie);
			Log.Debug("SetLoginCookies = " + encId);

		} else {
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (int i = 0; i < cookies.length; i++) {
					if (cookies[i].getName().equals("LOGIN_SAVE")) {
						cookies[i].setMaxAge(0);
						response.addCookie(cookies[i]);
						Log.Debug("RemoveLoginCookies = ");
					}

				}
			}
		}
	}
	/*
	 * public static boolean sendMail(HttpServletRequest request,JavaMailSenderImpl
	 * mailSender,String subject,String from, String to,String body)
	 * {
	 * ServletContext context = request.getServletContext();
	 * String g_path = context.getRealPath("/mailTemp.jsp");
	 * Log.Debug(g_path);
	 * String header = getMailConent("/home/shnet/mailTempHeader.jsp");
	 * String bottom = getMailConent("/home/shnet/mailTempBottom.jsp");
	 * String content = body.replace("\n", "<br>");
	 * try
	 * {
	 * MimeMessage message = mailSender.createMimeMessage();
	 * MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
	 * "UTF-8");
	 * 
	 * messageHelper.setFrom(from);
	 * messageHelper.setTo(to);
	 * messageHelper.setSubject(subject);
	 * messageHelper.setText(header+content+bottom,true );
	 * 
	 * 
	 * mailSender.send(message);
	 * } catch(Exception e){
	 * Log.Error("Send Mail Fail-------");
	 * Log.Error(e.getMessage());
	 * return false;
	 * }
	 * 
	 * return true;
	 * }
	 * public static boolean sendMail(HttpServletRequest request,JavaMailSenderImpl
	 * mailSender,String subject,String from, String to,String head,String
	 * body,String footer)
	 * {
	 * //ServletContext context = request.getServletContext();
	 * //String g_path = context.getRealPath("/mailTemp.jsp");
	 * //Log.Debug(g_path);
	 * String[] lines = body.split("\n");
	 * int row = lines.length;
	 * for(int i=row;i<20;i++)
	 * {
	 * body += "\n";
	 * }
	 * String content = head+body.replace("\n", "<br>")+footer;
	 * try
	 * {
	 * MimeMessage message = mailSender.createMimeMessage();
	 * MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
	 * "UTF-8");
	 * 
	 * messageHelper.setFrom(from);
	 * messageHelper.setTo(to);
	 * messageHelper.setSubject(subject);
	 * messageHelper.setText(content,true );
	 * mailSender.send(message);
	 * } catch(Exception e){
	 * Log.Error("Send Mail Fail-------");
	 * Log.Error(e.getMessage());
	 * return false;
	 * }
	 * 
	 * return true;
	 * }
	 * public static String getMailConent(String file)
	 * {
	 * String content="";
	 * //String g_path="/home/shnet/mailTempHeader.jsp";
	 * try {
	 * ////////////////////////////////////////////////////////////////
	 * BufferedReader in = new BufferedReader(new FileReader(file));
	 * String s="";
	 * 
	 * 
	 * while ((s = in.readLine()) != null) {
	 * content += s;
	 * Log.Debug(s);
	 * }
	 * in.close();
	 * ////////////////////////////////////////////////////////////////
	 * } catch (IOException e) {
	 * Log.Error(e.getMessage());
	 * return "fail";
	 * }
	 * 
	 * return content;
	 * }
	 * public static void sendMail(JavaMailSenderImpl mailSender,String
	 * subject,String from, String to,String body)
	 * {
	 * try
	 * {
	 * MimeMessage message = mailSender.createMimeMessage();
	 * MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
	 * "UTF-8");
	 * 
	 * messageHelper.setFrom(from);
	 * messageHelper.setTo(to);
	 * messageHelper.setSubject(subject);
	 * messageHelper.setText(body );
	 * 
	 * 
	 * mailSender.send(message);
	 * } catch(Exception e){
	 * Log.Error(e.getMessage());
	 * }
	 * }
	 * 
	 * public static void sendMailTest(JavaMailSenderImpl mailSender)
	 * {
	 * try
	 * {
	 * MimeMessage message = mailSender.createMimeMessage();
	 * MimeMessageHelper messageHelper = new MimeMessageHelper(message, true,
	 * "UTF-8");
	 * 
	 * messageHelper.setFrom("alarm@gli.ping");
	 * messageHelper.setTo("shkim@shnet.co.kr");
	 * messageHelper.setSubject("Alarm");
	 * messageHelper.setText("test" );
	 * 
	 * 
	 * mailSender.send(message);
	 * } catch(Exception e){
	 * Log.Error(e.getMessage());
	 * }
	 * }
	 */

	public static String authSmsNo(int length) {
		String numStr = "1";
		String plusNumStr = "1";

		for (int i = 0; i < length; i++) {
			numStr += "0";

			if (i != length - 1) {
				plusNumStr += "0";
			}
		}

		Random random = new Random();
		int result = random.nextInt(Integer.parseInt(numStr)) + Integer.parseInt(plusNumStr);

		if (result > Integer.parseInt(numStr)) {
			result = result - Integer.parseInt(plusNumStr);
		}

		return Integer.toString(result);

	}

	public static boolean chkLogin(HttpServletRequest request, String key) {
		String id = (String) request.getSession().getAttribute(key);
		if (id == null || id.equals("NULL"))
			return false;
		return true;
	}

	public static String calYear(int addYear) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		cal.add(Calendar.YEAR, addYear);

		SimpleDateFormat fm = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		strDate = fm.format(cal.getTime());
		return strDate;
	}

	public static String calYear(int addYear, String dateFormat) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		cal.add(Calendar.YEAR, addYear);

		SimpleDateFormat fm = new SimpleDateFormat(
				dateFormat);
		strDate = fm.format(cal.getTime());
		return strDate;
	}

	public static String calDate(int addDate) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		cal.add(Calendar.DAY_OF_YEAR, addDate);

		SimpleDateFormat fm = new SimpleDateFormat(
				"yyyy-MM-dd HH:mm:ss");
		strDate = fm.format(cal.getTime());
		return strDate;

	}

	public static String calDay(int addDate) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		cal.add(Calendar.DAY_OF_YEAR, addDate);

		SimpleDateFormat fm = new SimpleDateFormat(
				"yyyy-MM-dd");
		strDate = fm.format(cal.getTime());
		return strDate;

	}

	public static String calTime(int addTime, String srcFormat, String type) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		if (type.equals("HH"))
			cal.add(Calendar.HOUR, addTime);
		else if (type.equals("mm"))
			cal.add(Calendar.MINUTE, addTime);
		else if (type.equals("ss"))
			cal.add(Calendar.SECOND, addTime);

		SimpleDateFormat fm = new SimpleDateFormat(
				srcFormat);
		strDate = fm.format(cal.getTime());
		return strDate;

	}

	public static String calDateFromString(String srcDate, String srcFormat, int addDate, String format) {
		String result = "";

		try {
			Date date = new SimpleDateFormat(srcFormat).parse(srcDate);
			Calendar cal = new GregorianCalendar(Locale.KOREA);
			cal.setTime(date);

			cal.add(Calendar.DAY_OF_YEAR, addDate);

			SimpleDateFormat fm = new SimpleDateFormat(
					format);
			result = fm.format(cal.getTime());
		} catch (ParseException e) {

			e.printStackTrace();
		}

		return result;
	}

	public static String calDate(int addDate, String format) {
		String strDate = "";

		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());

		cal.add(Calendar.DAY_OF_YEAR, addDate); // ?��루�?? ?��?��?��.

		SimpleDateFormat fm = new SimpleDateFormat(
				format);
		strDate = fm.format(cal.getTime());

		return strDate;

	}

	public static String timestampToFormat(String time) {
		long timeStamp = 0;

		try {
			timeStamp = Long.parseLong(time);
		} catch (Exception ex) {
			return time;
		}
		if (gLimit == null) {

			// gLimit = Long.parseLong("1348671000000"); //2007-6-14 1500000000000
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
				gLimit = date.getTime();
			} catch (ParseException e) {

				e.printStackTrace();
			}
			Log.Debug(timestampToFormat(gLimit, "yyyy-MM-dd"));
		}
		if (timeStamp < gLimit) {
			return time;
		}

		return timestampToFormat(timeStamp, "yyyy-MM-dd HH:mm:ss");

	}

	public static String timestampToFormat(Object time) {
		if (gLimit == null) {

			// gLimit = Long.parseLong("1348671000000"); //2007-6-14 1500000000000
			Date date = null;
			try {
				date = new SimpleDateFormat("yyyy-MM-dd").parse("2000-01-01");
				gLimit = date.getTime();
			} catch (ParseException e) {
				e.printStackTrace();
			}
			Log.Debug(timestampToFormat(gLimit, "yyyy-MM-dd"));
		}
		if (time instanceof Integer) {
			int timeStamp = (Integer) time;
			if (timeStamp > gLimit)
				return timestampToFormat(timeStamp, "yyyy-MM-dd HH:mm:ss");
			else
				time.toString();
		} else if (time instanceof Long) {
			long timeStamp = (Long) time;
			if (timeStamp > gLimit)
				return timestampToFormat(timeStamp, "yyyy-MM-dd HH:mm:ss");
			else
				time.toString();
		}

		return time.toString();

	}

	public static String timestampToFormat(long time, String format) {

		Calendar cal = Calendar.getInstance();
		cal.setTimeInMillis(time);
		// here's how to get the minutes
		// and here's how to get the String representation
		String timeString = new SimpleDateFormat(format).format(cal.getTime());

		return timeString;
	}

	public static Timestamp calTimeStamp(int addSecond) {
		Calendar cal = new GregorianCalendar(Locale.ROOT);
		cal.setTime(new Date());
		cal.add(Calendar.SECOND, addSecond);

		Timestamp later = new Timestamp(cal.getTime().getTime());

		return later;
	}

	public static Map<String, String> parsingParam(String query, String tocken) {
		String[] params = query.split(tocken);
		Map<String, String> map = new HashMap<String, String>();
		for (int i = 0; i < params.length; i++) {
			String[] name = params[i].split("=");
			if (name.length > 1)
				map.put(name[0], name[1]);
		}
		return map;
	}

	public static String sh256Encode(String base) {

		StringBuffer hexString = new StringBuffer();

		try {

			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] hash = digest.digest(base.getBytes("UTF-8"));

			for (int i = 0; i < hash.length; i++) {
				String hex = Integer.toHexString(0xff & hash[i]);
				if (hex.length() == 1)
					hexString.append('0');
				hexString.append(hex);
			}

			// 출력
			System.out.println(hexString.toString());

		} catch (Exception ex) {
			return null;
		}

		return hexString.toString();

	}

	public static String trimLeftZero(String num) {
		int end = 0;
		byte[] temp = num.getBytes();

		for (int i = 0; i < temp.length - 1; i++) {
			if (temp[i] == '0') {
				end++;
			} else
				break;
		}

		return num.substring(end, num.length());
	}

	public static int findIndex(List<Map<String, Object>> source, String key, String value) {
		int result = -1;
		for (int i = 0; i < source.size(); i++) {
			if (source.get(i).get(key).toString().equals(value)) {
				return i;
			}
		}
		return result;
	}

	public static int findIndex(List<Map<String, Object>> source, String key, int value) {
		int result = -1;
		for (int i = 0; i < source.size(); i++) {
			if ((Integer) source.get(i).get(key) == value) {
				return i;
			}
		}
		return result;
	}

	public static String httpsConnection(String site, String param, String type, String token) {

		String result = "";

		SSLContext sslctx;
		try {
			sslctx = SSLContext.getInstance("SSL");

			sslctx.init(null, new X509TrustManager[] { new MyTrustManager() }, null);
			HttpsURLConnection.setDefaultSSLSocketFactory(sslctx.getSocketFactory());
			// URL url = new
			// URL("https://cmstest.donutbook.co.kr/b2ccoupon/b2cservice.aspx");
			if (type.equals("GET") && param != null && param.length() > 0) {
				site += "?" + param;
			}
			URL url = new URL(site);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			if (token != null) {
				con.setRequestProperty("Authorization", "Bearer " + token);
			}
			con.setHostnameVerifier(new HostnameVerifier() {
				@Override
				public boolean verify(String s, SSLSession sslSession) {
					return true;
				}
			});
			con.setRequestProperty("Content-Type", "application/JSON");
			con.setRequestProperty("Content-Length", Integer.toString(param.length()));

			con.setRequestMethod(type);
			if (type.equals("POST")) {
				con.setDoOutput(true);
				PrintStream ps = new PrintStream(con.getOutputStream());
				// ps.println("ACTION=CI102_ISSUECPN_WITHPAY&COOPER_ID=landcare00&COOPER_PW=landcare00!@&SITE_ID=10000104&NO_REQ=675&CALL_CTN=01026970442&SENDER=kkkkk&SENDER_ID=kkkkk&ISSUE_COUNT=1&RCV_CTN=01026970442&RECEIVER=01026970442&SEND_MSG=test&VALID_START=20130321&VALID_END=20130420&COOPER_ORDER=1308354385000&PAY_ID=20130321&BOOKING_NO=20130321&SITE_URL=akkebi.co.kr");
				if (param != null && param.length() > 0)
					ps.print(param);

				ps.close();
			}
			// con.connect();
			if (con.getResponseCode() == HttpsURLConnection.HTTP_OK) {
				saveCookie(con);
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String line;
				while ((line = br.readLine()) != null) {
					// System.out.println(result);
					result += line;
				}
				br.close();
			}

			con.disconnect();
		} catch (Exception e) {

			Log.Error(e.getMessage());
			return null;
		}
		return result;

	}

	public static String httpsConnectionOld(String site, String param, String type, String token) {

		String result = "";

		SSLContext sslctx;
		try {
			// TrustManager[] trustAllCerts = new TrustManager[] {
			// new X509TrustManager() {
			// public java.security.cert.X509Certificate[] getAcceptedIssuers() {
			// return null;
			// }

			// public void checkClientTrusted(X509Certificate[] certs, String authType) {
			// }

			// public void checkServerTrusted(X509Certificate[] certs, String authType) {
			// }

			// }
			// };
			sslctx = SSLContext.getInstance("SSL");
			sslctx.init(null, new X509TrustManager[] { new MyTrustManager() }, null);
			HttpsURLConnection.setDefaultSSLSocketFactory(sslctx.getSocketFactory());
			HostnameVerifier allHostsValid = new HostnameVerifier() {
				public boolean verify(String hostname, SSLSession session) {
					return true;
				}
			};
			HttpsURLConnection.setDefaultHostnameVerifier(allHostsValid);

			// sslctx.init(null, new X509TrustManager[] { new MyTrustManager()}, null);
			// HttpsURLConnection.setDefaultSSLSocketFactory(sslctx.getSocketFactory());
			// URL url = new
			// URL("https://cmstest.donutbook.co.kr/b2ccoupon/b2cservice.aspx");
			if (type.equals("GET") && param != null && param.length() > 0) {
				site += "?" + param;
			}
			URL url = new URL(site);
			HttpsURLConnection con = (HttpsURLConnection) url.openConnection();
			if (token != null) {
				con.setRequestProperty("Authorization", "Bearer " + token);
			}
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			// con.setSSLSocketFactory(sslctx.getSocketFactory());
			/*
			 * con.setHostnameVerifier(new HostnameVerifier() {
			 * 
			 * @Override
			 * public boolean verify(String s, SSLSession sslSession) {
			 * return true;
			 * }
			 * });
			 */

			con.setRequestMethod(type);
			if (type.equals("POST")) {
				con.setDoOutput(true);
				PrintStream ps = new PrintStream(con.getOutputStream());
				// ps.println("ACTION=CI102_ISSUECPN_WITHPAY&COOPER_ID=landcare00&COOPER_PW=landcare00!@&SITE_ID=10000104&NO_REQ=675&CALL_CTN=01026970442&SENDER=kkkkk&SENDER_ID=kkkkk&ISSUE_COUNT=1&RCV_CTN=01026970442&RECEIVER=01026970442&SEND_MSG=test&VALID_START=20130321&VALID_END=20130420&COOPER_ORDER=1308354385000&PAY_ID=20130321&BOOKING_NO=20130321&SITE_URL=akkebi.co.kr");
				if (param != null && param.length() > 0)
					ps.print(param);

				ps.close();
			}

			if (con.getResponseCode() == HttpsURLConnection.HTTP_OK) {
				saveCookie(con);
				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String line;
				while ((line = br.readLine()) != null) {
					// System.out.println(result);
					result += line;
				}
				br.close();
			}

			con.disconnect();
		} catch (Exception e) {

			Log.Error(e.getMessage());
			return null;
		}
		return result;

	}

	public static String g_Session = "";

	public static String httpConnection(String site, String param, String type, String token) {

		String result = "";

		URL url;
		try {
			if (type.equals("GET") && param != null && param.length() > 0) {
				site += "?" + param;
			}
			url = new URL(site);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
			if (token != null) {
				con.setRequestProperty("Authorization", "Bearer " + token);
			}
			if (g_Session.equals("") == false)
				con.setRequestProperty("Cookie", g_Session);

			con.setRequestMethod(type);
			if (type.equals("POST")) {
				con.setDoOutput(true);
				con.setDoInput(true);
				// PrintStream ps = new PrintStream(con.getOutputStream());
				OutputStream wr = con.getOutputStream();
				// ps.println("ACTION=CI102_ISSUECPN_WITHPAY&COOPER_ID=landcare00&COOPER_PW=landcare00!@&SITE_ID=10000104&NO_REQ=675&CALL_CTN=01026970442&SENDER=kkkkk&SENDER_ID=kkkkk&ISSUE_COUNT=1&RCV_CTN=01026970442&RECEIVER=01026970442&SEND_MSG=test&VALID_START=20130321&VALID_END=20130420&COOPER_ORDER=1308354385000&PAY_ID=20130321&BOOKING_NO=20130321&SITE_URL=akkebi.co.kr");
				wr.write(param.getBytes("UTF-8"));
				wr.close();
			}
			int code = con.getResponseCode();
			if (code == HttpURLConnection.HTTP_OK) {
				saveCookie(con);

				BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String line;
				while ((line = br.readLine()) != null) {
					// System.out.println(result);
					result += line;
				}
				br.close();
			}

			con.disconnect();
		} catch (Exception e) {

			Log.Error(e.getMessage());
			return null;
		}
		return result;

	}

	public static boolean saveCookie(HttpURLConnection conn) {
		Map<String, List<String>> imap = conn.getHeaderFields();
		if (imap.containsKey("Set-Cookie")) {
			String temp = "";
			List<String> lString = imap.get("Set-Cookie");
			for (int i = 0; i < lString.size(); i++) {
				temp += lString.get(i);
			}
			if (temp.indexOf(g_Session) >= 0 && temp.length() > 0) {
				if (temp.equals(g_Session)) {
					Log.Debug("Before Session equel=" + g_Session);
				} else {
					g_Session = temp;
					Log.Debug(g_Session);
				}
			} else {
				Log.Debug("Before Session Not equel=" + temp);
			}

			return true;
		}
		return false;
	}

	public static String getToday(String format) {
		Date today = new Date();
		SimpleDateFormat form = new SimpleDateFormat(format);
		return (form.format(today));
	}

	public static String getToday() {
		Date today = new Date();
		SimpleDateFormat form = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return (form.format(today));
	}

	public static String getDateDay(String date, String dateForamt) {
		String day = "";
		SimpleDateFormat dateFormat = new SimpleDateFormat(dateForamt);
		Date nDate = null;
		try {
			nDate = dateFormat.parse(date);
		} catch (ParseException e) {
			Log.Error(e.getMessage());
			return null;
		}
		Calendar cal = Calendar.getInstance();
		cal.setTime(nDate);
		int dayNum = cal.get(Calendar.DAY_OF_WEEK);
		switch (dayNum) {
			case 1:
				day = "일";
				break;
			case 2:
				day = "월";
				break;
			case 3:
				day = "화";
				break;
			case 4:
				day = "수";
				break;
			case 5:
				day = "목";
				break;
			case 6:
				day = "금";
				break;
			case 7:
				day = "토";
				break;

		}
		return day;
	}

	public static Long getMiliSecond() {
		return new Date().getTime();

	}

	public static String addDate(int add, int field, String format) {
		Calendar cal = new GregorianCalendar(Locale.KOREA);
		cal.setTime(new Date());
		switch (field) {
			case 0:
				cal.add(Calendar.YEAR, add); // 1년을 더한다.
				break;
			case 1:
				cal.add(Calendar.MONTH, add); // 한달을 더한다.
				break;
			case 2:
				cal.add(Calendar.DAY_OF_YEAR, add); // 하루를 더한다.
				break;
			case 3:
				cal.add(Calendar.HOUR, add); // 시간을 더한다
				break;
		}

		SimpleDateFormat fm = new SimpleDateFormat(format);
		return fm.format(cal.getTime());
	}

	public static List<Map<String, Object>> underToCamel(List<Map<String, Object>> source) {
		List<Map<String, Object>> target = new ArrayList<Map<String, Object>>();

		for (Map<String, Object> v : source) {
			Map<String, Object> map = new HashMap<String, Object>();
			for (Map.Entry<String, Object> entry : v.entrySet()) {

				String[] key = entry.getKey().toLowerCase().split("_");
				String newKey = key[0];
				for (int i = 1; i < key.length; i++) {
					newKey += key[i].substring(0, 1).toUpperCase() + key[i].substring(1);
				}
				Object value = entry.getValue();
				map.put(newKey, value);
			}
			target.add(map);
		}
		return target;

	}
	public static JSONObject underToCamelFromJson(JSONObject inParam) {
		JSONObject result = new JSONObject();
		Iterator it = inParam.keySet().iterator();
		while (it.hasNext()) {
			String orgKey = it.next().toString();
			String[] key = orgKey.toLowerCase().split("_");
			String newKey = key[0];
			for (int i = 1; i < key.length; i++) {
				newKey += key[i].substring(0, 1).toUpperCase() + key[i].substring(1);
			}
			result.put(newKey, inParam.get(orgKey));
		}
		return result;
	}

	public static String camelCaseToUnderscore(String camel) {
		String regex = "([a-z])([A-Z]+)";
		String replacement = "$1_$2";
		String result = camel.replaceAll(regex, replacement).toUpperCase();

		regex = "([A-Z])([0-9]+)";
		result = result.replaceAll(regex, replacement).toUpperCase();
		return result;

	}

	public static String getWebRootPath(MultipartHttpServletRequest request) {
		String g_path = request.getSession().getServletContext().getRealPath("/");
		int index = g_path.indexOf("pcrmapi");
		if (index < 0)
			index = g_path.indexOf("ROOT");
		String rootPath = g_path.substring(0, index - 1);
		Log.Debug("g_path=%s", rootPath);
		return rootPath;

	}

	public static List<String> parsingCsvFormet(String line) {
		List<String> result = new ArrayList<String>();

		String[] split = line.split(",");
		for (int j = 0; j < split.length; j++) {
			String temp = "";
			if (split[j].startsWith("\"")) {
				temp = split[j++] + ",";
				for (; j < split.length; j++) {
					if (split[j].endsWith("\"")) {
						temp += split[j];
						break;
					} else {
						temp += split[j] + ",";
					}
				}
			} else
				temp = split[j];
			result.add(temp.replace("\"", ""));

		}
		return result;
	}

	public static String getRemoteIp(HttpServletRequest request) {

		String ip = request.getHeader("X-Forwarded-For");

		if (ip == null) {
			ip = request.getHeader("Proxy-Client-IP");
		}
		if (ip == null) {
			ip = request.getHeader("WL-Proxy-Client-IP"); // 웹로직
		}
		if (ip == null) {
			ip = request.getHeader("HTTP_CLIENT_IP");
		}
		if (ip == null) {
			ip = request.getHeader("HTTP_X_FORWARDED_FOR");
		}
		if (ip == null) {
			ip = request.getRemoteAddr();
		}
		if (ip.equals("0:0:0:0:0:0:0:1"))
			ip = "127.0.0.1";
		return ip;

	}

	public static void voCopy(Object source, Object dest)// source:from dest:to
	{
		Method[] m = source.getClass().getDeclaredMethods();
		Method[] d = dest.getClass().getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			Object value = null;
			String getName = null;
			String setMethod = null;
			if ((getName = m[i].getName()).substring(0, 3).equals("get")) {
				setMethod = "set" + getName.substring(3, getName.length());

				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			} else if ((getName = m[i].getName()).indexOf("is") >= 0) {
				setMethod = "set" + getName.substring(2, getName.length());

				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			} else if ((getName = m[i].getName()).indexOf("is") >= 0) {
				setMethod = "set" + getName.substring(2, getName.length());

				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			}
		}

	}

	public static void voCopy(Class<?> type, JsonElement sourceJson, Object dest) {
		Gson gson = getGsonTimestamp();
		Object source = gson.fromJson(sourceJson, type);
		Method[] m = source.getClass().getDeclaredMethods();
		Method[] d = dest.getClass().getDeclaredMethods();
		for (int i = 0; i < m.length; i++) {
			Object value = null;
			String getName = null;
			String setMethod = null;

			if ((getName = m[i].getName()).substring(0, 3).equals("get")) {
				setMethod = "set" + getName.substring(3, getName.length());
				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			} else if ((getName = m[i].getName()).indexOf("is") >= 0) {
				setMethod = "set" + getName.substring(2, getName.length());

				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			} else if ((getName = m[i].getName()).indexOf("is") >= 0) {
				setMethod = "set" + getName.substring(2, getName.length());

				try {
					value = m[i].invoke(source);
					for (int j = 0; j < d.length; j++) {
						if (d[j].getName().indexOf(setMethod) >= 0) {
							if (value != null) {
								d[j].invoke(dest, value);
							}
							break;
						}
					}
				} catch (IllegalAccessException e) {

					Log.Error(e.getMessage());
				} catch (IllegalArgumentException e) {

					Log.Error(e.getMessage());
				} catch (InvocationTargetException e) {

					Log.Error(e.getMessage());
				}
			}
		}

	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Map convertObjectToMap(Object obj) {
		Map map = new HashMap();
		Field[] fields = obj.getClass().getDeclaredFields();
		for (int i = 0; i < fields.length; i++) {
			fields[i].setAccessible(true);
			try {
				map.put(fields[i].getName(), fields[i].get(obj));
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return map;
	}

	public static Gson getGsonTimestamp() {
		return (new GsonBuilder()
				.registerTypeAdapter(Timestamp.class, UnixEpochDateTypeAdapter.getUnixEpochDateTypeAdapter().nullSafe())
				.serializeNulls()
				.create());
	}

	public static String underLineToCamel(String key) {
		String result = "";

		String[] split = key.split("_");
		if (split.length == 1)
			return key;

		for (int i = 0; i < split.length; i++) {
			if (i == 0) {
				result += split[i].toLowerCase();
			} else {
				result += split[i].substring(0, 1).toUpperCase() + split[i].substring(1, split[i].length()).toLowerCase();
			}
		}

		return result;
	}

	public static String camelToUnderLine(String name) {
		final StringBuilder buf = new StringBuilder(name.replace('.', '_'));
		for (int i = 1; i < buf.length() - 1; i++) {
			if (Character.isLowerCase(buf.charAt(i - 1)) &&
					Character.isUpperCase(buf.charAt(i)) &&
					Character.isLowerCase(buf.charAt(i + 1))) {
				buf.insert(i++, '_');
			}
		}
		return buf.toString().toUpperCase(Locale.ROOT);
	}

	public static void intToByteArrayCopy(int value, byte[] source, int offset) {
		byte[] byteArray = new byte[4];
		byteArray[0] = (byte) (value >> 24);
		byteArray[1] = (byte) (value >> 16);
		byteArray[2] = (byte) (value >> 8);
		byteArray[3] = (byte) (value);

		for (int i = 0; i < 4; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void intToByteArrayCopyLittle(int value, byte[] source, int offset) {
		byte[] byteArray = new byte[4];
		value = value & 0xffffffff;

		byteArray[3] = (byte) ((value) >> 24);
		byteArray[2] = (byte) (value >> 16);
		byteArray[1] = (byte) (value >> 8);
		byteArray[0] = (byte) (value);

		for (int i = 0; i < 4; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void intToCharArrayCopy(int value, char[] source, int offset) {
		char[] byteArray = new char[4];
		byteArray[0] = (char) (value >> 24);
		byteArray[1] = (char) (value >> 16);
		byteArray[2] = (char) (value >> 8);
		byteArray[3] = (char) (value);

		for (int i = 0; i < 4; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void intToCharArrayCopyLittle(int value, char[] source, int offset) {
		char[] byteArray = new char[4];
		value = value & 0xffffffff;

		byteArray[3] = (char) ((value) >> 24);
		byteArray[2] = (char) (value >> 16);
		byteArray[1] = (char) (value >> 8);
		byteArray[0] = (char) (value);

		for (int i = 0; i < 4; i++) {
			source[offset + i] = byteArray[i];
		}
		byte[] a = new byte[4];
		a[0] = (byte) byteArray[0];
		a[1] = (byte) byteArray[1];
		a[2] = (byte) byteArray[2];
		a[3] = (byte) byteArray[3];
	}

	public static int byteArrayToInt(char bytes[]) {
		return ((((int) bytes[0] & 0xff) << 24) |
				(((int) bytes[1] & 0xff) << 16) |
				(((int) bytes[2] & 0xff) << 8) |
				(((int) bytes[3] & 0xff)));
	}

	public static int byteArrayToIntLittle(char bytes[]) {
		return ((((int) bytes[3] & 0xff) << 24) |
				(((int) bytes[2] & 0xff) << 16) |
				(((int) bytes[1] & 0xff) << 8) |
				(((int) bytes[0] & 0xff)));
	}

	public static void shortToByteArrayCopy(int value, byte[] source, int offset) {
		byte[] byteArray = new byte[2];
		byteArray[0] = (byte) (value >> 8);
		byteArray[1] = (byte) (value);
		for (int i = 0; i < 2; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void shortToByteArrayCopyLittle(int value, byte[] source, int offset) {
		byte[] byteArray = new byte[4];
		byteArray[1] = (byte) (value >> 8);
		byteArray[0] = (byte) (value);
		for (int i = 0; i < 2; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void shortToCharArrayCopy(int value, char[] source, int offset) {
		char[] byteArray = new char[2];
		byteArray[0] = (char) (value >> 8);
		byteArray[1] = (char) (value);
		for (int i = 0; i < 2; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static void shortToCharArrayCopyLittle(int value, char[] source, int offset) {
		char[] byteArray = new char[4];
		byteArray[1] = (char) (value >> 8);
		byteArray[0] = (char) (value);
		for (int i = 0; i < 2; i++) {
			source[offset + i] = byteArray[i];
		}
	}

	public static short byteArrayToShort(char bytes[]) {
		return (short) ((((short) bytes[0] & 0xff) << 8) |
				(((short) bytes[1] & 0xff)));
	}

	public static short byteArrayToShortLittle(char bytes[]) {
		return (short) ((((short) bytes[1] & 0xff) << 8) |
				(((short) bytes[0] & 0xff)));
	}

	public static String replaceAllBetweenBrace(String text, String replacement) {
		String result = text;
		int from, to;
		while (true) {
			from = result.indexOf("(");
			to = result.indexOf(")");
			if (from >= 0 && to >= 0) {
				result = result.replace(result.substring(from, to + 1), replacement);
			} else
				break;
		}
		while (true) {
			from = result.indexOf("[");
			to = result.indexOf("]");
			if (from >= 0 && to >= 0) {
				result = result.replace(result.substring(from, to + 1), replacement);
			} else
				break;
		}
		while (true) {
			from = result.indexOf("{");
			to = result.indexOf("}");
			if (from >= 0 && to >= 0) {
				result = result.replace(result.substring(from, to + 1), replacement);
			} else
				break;
		}
		return result;
	}

	public static String replaceAllElseHangul(String text, String replacement) {
		String result = "";
		result = text.replaceAll("\\w", replacement);
		result = result.replaceAll(" ", replacement);
		result = result.replaceAll("[.]", replacement);
		result = result.replaceAll("=", replacement);
		result = result.replaceAll("-", replacement);
		result = result.replaceAll(":", replacement);
		result = result.replaceAll(";", replacement);
		result = result.replaceAll("[*/@#$%^&!~+,]", replacement);
		result = result.replaceAll("[+]", replacement);
		result = result.replaceAll("[\\(\\)\\[\\]\\{\\}]", replacement);
		result = result.replaceAll("→", replacement);
		result = result.replaceAll("/", replacement);

		return result;
	}

	public static String replaceText(String driverName, List<Map<String, Object>> mReplaceText) {
		String result = driverName;
		if (mReplaceText != null) {
			for (int i = 0; i < mReplaceText.size(); i++) {
				String r = mReplaceText.get(i).get("text").toString();
				result = result.replace(r, "");
			}
		}
		return result;
	}

	public static String replaceTextElseNumeric(String text, String replacement) {
		String result = text;
		if (text.indexOf("-") == 0) {
			result = "-" + result.replaceAll("[^0-9]", "");
		} else {
			result = result.replaceAll("[^0-9]", "");
		}

		return result;
	}

	public static String patternSubstring(String regs, String data) {
		if (data == null)
			return null;
		Pattern pattern = Pattern.compile(regs);
		Matcher matcher = pattern.matcher(data);
		if (matcher.find()) {
			return matcher.group();
		}

		return null;
	}

	public static String isValidateTime(String time) {
		if (time == null)
			return null;

		if (time.length() != 5) {
			Log.Error("Time Format Wrong = %s", time);
			return null;
		}
		String[] split = time.split("[:]");
		if (split.length != 2) {
			Log.Error("Time Format Wrong = %s", time);
			return null;
		}
		int hour = Integer.parseInt(split[0]);
		if (hour >= 24) {
			time = String.format("%02d:%s", hour - 24, split[1]);
		}
		return time;
	}

	public static boolean isValidEmail(String email) {
		boolean err = false;
		if (email == null)
			return false;
		if (email.indexOf("@") > 0)
			return true;

		return err;
	}

	public static String hyphenYMD(String value) {
		if (value == null || value.length() != 8) {
			return null;
		}
		String result = null;
		result = String.format("%s-%s-%s", value.substring(0, 4), value.substring(4, 6), value.substring(6, 8));

		return result;
	}
	public static String hyphenTelNo(String value) {
		if (value == null) {
			return null;
		}
		if (value.subSequence(0, 2).equals("02")) {
			if (value.length() == 9) {
				return String.format("%s-%s-%s", value.substring(0, 2), value.substring(2, 5), value.substring(5, 9));
			} else if (value.length() > 9) {
				return String.format("%s-%s-%s", value.substring(0, 2), value.substring(2, 6),
						value.substring(6, value.length()));
			} else {
				return value;
			}
		} else if (value.substring(0, 1).equals("1") || value.substring(0, 1).equals("2")) {
			return String.format("%s-%s", value.substring(0, 4), value.substring(4, value.length()));
		} else {
			if (value.length() == 10) {
				return String.format("%s-%s-%s", value.substring(0, 3), value.substring(3, 6), value.substring(6, 10));
			} else if (value.length() > 10) {
				return String.format("%s-%s-%s", value.substring(0, 3), value.substring(3, 7),
						value.substring(7, value.length()));
			} else {
				return value;
			}
		}
	}
}

final class UnixEpochDateTypeAdapter
		extends TypeAdapter<Timestamp> {

	private static final TypeAdapter<Timestamp> unixEpochDateTypeAdapter = new UnixEpochDateTypeAdapter();

	private UnixEpochDateTypeAdapter() {
	}

	static TypeAdapter<Timestamp> getUnixEpochDateTypeAdapter() {
		return unixEpochDateTypeAdapter;
	}

	@Override
	public Timestamp read(final JsonReader in)
			throws IOException {
		// this is where the conversion is performed
		return new Timestamp(in.nextLong());
	}

	@Override
	public void write(final JsonWriter out, final Timestamp value)
			throws IOException {
		// write back if necessary or throw UnsupportedOperationException
		out.value(CommonLib.timestampToFormat(value.getTime(),"yyyy-MM-dd HH:mm:ss"));
		// out.value(value.getTime());
	}

}

class MyTrustManager implements X509TrustManager {
	public void checkClientTrusted(X509Certificate[] chain, String authType) {
	}

	public void checkServerTrusted(X509Certificate[] chain, String authType) {
	}

	public X509Certificate[] getAcceptedIssuers() {
		return new X509Certificate[0];
	}

}
