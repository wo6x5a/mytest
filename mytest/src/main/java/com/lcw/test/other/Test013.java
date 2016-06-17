package com.lcw.test.other;

import java.util.HashMap;

public class Test013 {
	public static void main(String[] args) {
		HashMap<String, String> a = new HashMap<String, String>();
		a.put("a1", "a1");
		a.put("a2", "a1");
		a.put("a3", "a3");
		System.out.println(a.get("a1").hashCode());
		System.out.println(a.get("a2").hashCode());
		System.out.println(a.get("a3").hashCode());
		System.out.println(a.get("a1").equals(a.get("a2")));
		System.out.println(a.get("a1"));
		System.out.println(a.get("a2"));
	}

}
