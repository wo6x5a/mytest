package com.lcw.test.map;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TestHashMap {
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		Map<String,String> m2 = new Hashtable<>();
		m.put("1", "1");
		m.put("2", "2");
		m.put("3", "3");
		m.put("4", "4");
		m.put("5", "5");
		m.put("6", "6");
//		m.put(null, "1");
//		m.put("2",null);
//		m2.put(null, "1");
		BigInteger in = new BigInteger("1");
		ConcurrentHashMap<String, String> m3 = new ConcurrentHashMap<>(); 
		m3.put("3", "3");
//		System.out.println(in);
//		m.get("1");
		String [] staff=new String[100];
		staff[1] = "1";
//		System.out.println(staff[0]);
		for(String s : m.values()){
			System.out.println(s);
//			System.out.println(s.hashCode());
		}
//		System.out.println(m);
//		System.out.println(m.get("3").hashCode());
		
//		System.out.println(m.get("1"));
//		System.out.println(m);
		
	}

}
