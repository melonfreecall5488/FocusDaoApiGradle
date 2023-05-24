package com.smart.focus.ceoapi.common;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")
public class SysConfig {

    static JSONObject sysConfig = new JSONObject();

    public static void initConfig() {
        Path pathFile = null;
        pathFile = Paths.get(ConstDef.PARAM_FILE_PATH);
        if (System.getProperty("os.name").toLowerCase().contains("win")) {
            pathFile = Paths.get(ConstDef.PARAM_FILE_PATH_WIN);
        }
        Charset cs = StandardCharsets.UTF_8;
        List<String> list = new ArrayList<String>();
        try {
            list = Files.readAllLines(pathFile, cs);
        } catch (IOException e) {
            Log.Error("Sys config file open error = %s", e.getLocalizedMessage());
            return;
        }
        for (String readLine : list) {
            Log.Trace(readLine);
            String[] split = readLine.split("=");
            if (split.length == 2) {
                sysConfig.put(split[0].trim().toUpperCase(), split[1].trim());
            } else {
                Log.Error("Param read error = %s or last line", readLine);
            }
        }
        // Log.Trace(param.toJSONString());
    }

    public static String getPropertie(String key, String defaultValue) {
        String result = (String) sysConfig.get(key);
        if (result == null) {
            return defaultValue;
        }
        return result;
    }

}
