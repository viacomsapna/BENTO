package com.vianet.bento.util;

import java.io.IOException;
import java.util.HashMap;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import android.os.AsyncTask;

public class BeaconUtil{
	
	private String getUrl(HashMap<String, Object> data){
		String url = "";
		if(data.containsKey("url")){
			url = (String)data.get("url");
			String queryParam = "";
			HashMap<String, String> params = new HashMap<String, String>();
			int maxLength = 0;
			String rndKey = "";
			if(data.containsKey("params")){
				params = (HashMap<String, String>)data.get("params");
				queryParam = StringUtil.hashMapToKeyValueStr(params, "&");
				url += (StringUtil.hasQueryParam(url) ? "&" : "?") + queryParam;
			}
			if(data.containsKey("maxLength")){
				maxLength = (Integer)data.get("maxLength");
			}
			if(data.containsKey("rndKey")){
				rndKey = (String)data.get("rndKey") + "=" + NumberUtil.random(10000000);
				if(maxLength > 0){
					maxLength -= rndKey.length();
				}
			}
			url = StringUtil.limitLength(url, maxLength, "&");
			if(StringUtil.isDefined(rndKey)){
				url += (StringUtil.hasQueryParam(url) ? "&" : "?") + rndKey;
			}
		}
		return url;
	}

	public void send(HashMap<String, Object> data){		
		new makeRequest().execute(getUrl(data));//getUrl(data)
	}
		
	private class makeRequest extends AsyncTask <String, Void, Void>{
		
		@Override
        protected Void doInBackground(String... urls) 
        {
			if(urls.length > 0){
				String url = urls[0];
	
	            HttpClient httpClient = new DefaultHttpClient();
	            HttpGet request = new HttpGet(url);
	            
	            try {
	                httpClient.execute(request);
	            } catch (ClientProtocolException e) {
	                // TODO Auto-generated catch block	                
	            } catch (IOException e) {
	                // TODO Auto-generated catch block	                
	            }
            }
			return null;
        }
		
	}
}