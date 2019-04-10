package com.hlic.utils;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class BeanUtils {
	private static Pattern linePattern = Pattern.compile("_(\\w)"); 
	/**
     * @Title: keyNameToHump 
     * @Description: 把带下划线的key转换成驼峰 
     * @param @param preData
     * @param @return    设定文件 
     * @return JSONArray    返回类型 
     * @throws 
     */
    public static JSONArray keyNameToHump(JSONArray preData){
    	JSONArray formatSave = new JSONArray();
    	@SuppressWarnings("unchecked")
		Iterator<Object> it = preData.iterator();
		while (it.hasNext()) {
			JSONObject obj = (JSONObject) it.next();
			JSONObject inObj = new JSONObject();
			@SuppressWarnings("unchecked")
			Map<String, Object> map = obj;
			for (Entry<String, Object> entry : map.entrySet()) {
				String keyName = entry.getKey();
				keyName = lineToHump(keyName);
				inObj.put(keyName, entry.getValue());
			}
			formatSave.add(inObj);
		}
		return formatSave;
    }
    /**下划线转驼峰*/  
    public static String lineToHump(String str){  
        str = str.toLowerCase();  
        Matcher matcher = linePattern.matcher(str);  
        StringBuffer sb = new StringBuffer();  
        while(matcher.find()){  
            matcher.appendReplacement(sb, matcher.group(1).toUpperCase());  
        }  
        matcher.appendTail(sb);  
        return sb.toString();  
    }
    
    /**
	 * 驼峰转下划线
	 * @param str
	 * @return
	 */
	public static StringBuffer underline(StringBuffer str) {
		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(str);
		StringBuffer sb = new StringBuffer(str);
		if(matcher.find()) {
			sb = new StringBuffer();
			//将当前匹配子串替换为指定字符串，并且将替换后的子串以及其之前到上次匹配子串之后的字符串段添加到一个StringBuffer对象里。
			//正则之前的字符和被替换的字符
			matcher.appendReplacement(sb,"_"+matcher.group(0).toLowerCase());
			//把之后的也添加到StringBuffer对象里
			matcher.appendTail(sb);			
		}else {
			return sb;
		}	
		return underline(sb);
	}
}
