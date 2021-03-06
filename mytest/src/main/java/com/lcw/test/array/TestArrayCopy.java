package com.lcw.test.array;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.time.DateUtils;

public class TestArrayCopy {
	public static void main(String[] args) throws ParseException {
		List<String> dtos = new ArrayList<String>();
		List<String> dtos1 = new ArrayList<String>();
		List<String> list = new ArrayList<String>();
		for(int i = 0;i<100;i++){
			list.add("1");
			list.add("2");
			list.add("3");
		}
		System.out.println(list);
		System.out.println(dtos);
		long a = System.currentTimeMillis();
		dtos.addAll(list);
		long b = System.currentTimeMillis();
		for(String str : list){
			dtos1.add(str);
		}
		long c = System.currentTimeMillis();

		System.out.println(dtos);

		System.out.println(b-a);
		System.out.println(c-b);

		StringBuilder s = new StringBuilder();
		s.append("012345678;");
		s.replace(s.length()-1,s.length(),"");
		System.out.println(s);

		System.out.println(DateUtils.parseDate("20170912", "yyyyMMdd"));


	}
}
