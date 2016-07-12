package com.lcw.test.other;

import java.util.ArrayList;
import java.util.List;

public class Test002 {
	public static void main(String[] args) {
//		int i = (101 ^ 101);
//		System.out.println(i);
//		Date newDate = new Date();
//		System.out.println(newDate);
//		// 1438242246411
		StringBuilder resp = new StringBuilder("");
		List<String> list = new ArrayList<>();
		resp.append(1);
		resp.append(",");
		resp.append(2);
		resp.append(",");
		resp.append(3);
		resp.append(",");
		resp.append(4);
		resp.append(",");
		resp.delete(resp.length() - 1, resp.length());
		System.out.println(resp);
	}
}
