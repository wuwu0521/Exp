package com.w.frame;

import net.sf.json.JSONArray;

import org.json.JSONException;
import org.json.JSONObject;



public class JSONPaser {
	public static void main(String[] args) {
		String str = "[{\"name\":\"big\",\"age\":\"12\"},{\"name\":\"kk\",\"age\":\"13\"]";
		JSONArray jsonArr = JSONArray.fromObject(str);
		Object[] obj=jsonArr.toArray(); 
		for(int i=0;i<jsonArr.size();i++){
			JSONObject a;
			try {
				a = new JSONObject(obj[i].toString());
			} catch (JSONException e) {
				// TODO Auto-generated catch block
//				e.printStackTrace();
				System.out.println("223"+e.getStackTrace());
			}
		}
	}
}
