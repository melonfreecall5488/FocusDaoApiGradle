package com.smart.focus.ceoapi.common;

import java.util.Map;

import org.json.simple.JSONObject;

public class Json {
  public static String getString(JSONObject obj, String key, String defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    return obj.get(key).toString();
  }

  public static Integer getInteger(JSONObject obj, String key, Integer defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Integer.parseInt(val);
  }

  public static Float getFloat(JSONObject obj, String key, Float defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Float.parseFloat(val);
  }

  public static Double getDouble(JSONObject obj, String key, Double defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Double.parseDouble(val);
  }

  public static Boolean getBoolean(JSONObject obj, String key, Boolean defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Boolean.parseBoolean(val);
  }

  public static String getString(Map<String, Object> obj, String key, String defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    return obj.get(key).toString();
  }

  public static Integer getInteger(Map<String, Object> obj, String key, Integer defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Integer.parseInt(val);
  }

  public static Float getFloat(Map<String, Object> obj, String key, Float defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Float.parseFloat(val);
  }

  public static Double getDouble(Map<String, Object> obj, String key, Double defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Double.parseDouble(val);
  }

  public static Boolean getBoolean(Map<String, Object> obj, String key, Boolean defaultVal) {
    if (obj.get(key) == null)
      return defaultVal;

    String val = obj.get(key).toString();
    return Boolean.parseBoolean(val);
  }
}
