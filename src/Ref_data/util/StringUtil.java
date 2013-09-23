package com.vianet.bento.util;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class StringUtil{
	public static String join(String[] stringArray, String delimiter){
		String str = "";
		int size = stringArray.length;
		for(int x = 0; x < size; x++){
			if(stringArray[x] != null){
				str += stringArray[x] + delimiter;
			}
		}
		return str.substring(0, str.length() - delimiter.length());
	}
	public static String joinKeyValue(String key, Object value){
		String keyValue = "";
		if(key != null && value != null){
			keyValue = key + "=" + value.toString();
		}
		return keyValue;
	}	
	public static boolean isDefined(String str){
		return (str != null && str != "");
	}
	public static String limitLength(String string, int limit, String delimiter){
		if(isDefined(string) && string.length()>limit){
			string=string.substring(0,limit);
			if(isDefined(delimiter)){
				int delimiterPos = string.lastIndexOf(delimiter);
				if(delimiterPos > 0){
					string=string.substring(0,delimiterPos);
				}
			}
		}
		return string;			
	}
	public static boolean hasQueryParam(String url){
		return url.indexOf("?") != -1; 
	}
	public static String hashMapToKeyValueStr(HashMap<String,String> map, String delimiter){
		String[] strArr = new String[map.size()];
		int counter = 0;
		String keyValueStr = "";
		Iterator<Entry<String, String>> i = map.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry<String, String> entry = (Map.Entry<String, String>)i.next();
			String key = (String)entry.getKey();
			String value = (String)entry.getValue();
			if(isDefined(value)){
				strArr[counter++] = key+"="+value;
			}
		}
		if(strArr.length > 0){
			keyValueStr = join(strArr, "&");
		}
		return keyValueStr;
	}
}
