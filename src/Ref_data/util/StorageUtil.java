package com.vianet.bento.util;

import java.util.Set;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class StorageUtil{
	private static StorageUtil storageInstance = null;
	private static final String SHARED_PREF_NAME = "com.vianet.bento.util.StorageUtil";
	private SharedPreferences sharedPref;

	private StorageUtil(Context c){
		sharedPref = c.getSharedPreferences(SHARED_PREF_NAME, Context.MODE_PRIVATE);
	}
	
	public static StorageUtil getInstance(Context ctxt){
		if(storageInstance == null){
			storageInstance = new StorageUtil(ctxt);
		}
		return storageInstance;
	}
	
	public void setString(String key, String value){
		Editor edit = sharedPref.edit();
		edit.putString(key, value);
		edit.commit();
	}
	
	public String getString(String key){
		return sharedPref.getString(key, null);
	}
	
	public void setBoolean(String key, Boolean value){
		Editor edit = sharedPref.edit();
		edit.putBoolean(key, value);
		edit.commit();
	}
	
	public Boolean getBoolean(String key){
		return sharedPref.getBoolean(key, false);
	}
	
	public void setInt(String key, int value){
		Editor edit = sharedPref.edit();
		edit.putInt(key, value);
		edit.commit();
	}
	
	public int getInt(String key){
		return sharedPref.getInt(key, 0);
	}
	
	public void setFloat(String key, Float value){
		Editor edit = sharedPref.edit();
		edit.putFloat(key, value);
		edit.commit();
	}
	
	public Float getFloat(String key){
		return sharedPref.getFloat(key, 0.0f);
	}
	
	public void setLong(String key, Long value){
		Editor edit = sharedPref.edit();
		edit.putLong(key, value);
		edit.commit();
	}
	
	public Long getLong(String key){
		return sharedPref.getLong(key, 0);
	}
	
	public void setStringSet(String key, Set<String> values){
		Editor edit = sharedPref.edit();
		edit.putStringSet(key, values);
		edit.commit();
	}
	
	public Set<String> getStringSet(String key){
		return sharedPref.getStringSet(key, null);
	}
}
