package com.hlic.base.process.utils;

import com.hlic.utils.HttpRequest;
import com.hlic.utils.MD5;

public class QueryExpress {
	//查询
	public static void main(String[] args) throws Exception {
		String param ="{\"com\":\"yuantong\",\"num\":\"123456789\",\"from\":\"\",\"to\":\"\"}";
		String customer ="A4BE956B230EF2B853CAF99D20F6799F";
		String key = "GzwbbjbO6954";
		String sign = new MD5().getMD5ofStr(param+key+customer);
		//String content = "customer="+customer+"&param="+param+"&sign="+sign;
	    String content = "customer="+customer+"&param="+param+"&sign="+sign;	
		String resp;
		try {
			resp = new HttpRequest().sendPost("https://poll.kuaidi100.com/poll/query.do", content);
			System.out.println(resp);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
