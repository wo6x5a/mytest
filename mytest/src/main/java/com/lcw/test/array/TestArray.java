package com.lcw.test.array;

import java.util.ArrayList;
import java.util.List;

public class TestArray {

	public static void main(String[] args) {
		int[] a = new int[10];
		System.out.println(a[2]);
		List<String> lis = new ArrayList<>();
		lis.add("11");
        lis.add("22");
        lis.add("33");
        lis.add("44");
        String lisStr = lis.toString();
        System.out.println(lisStr.substring(1, lisStr.length()-1));
        System.out.println(lis.toString());
	}
}
