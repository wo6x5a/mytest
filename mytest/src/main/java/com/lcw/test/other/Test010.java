package com.lcw.test.other;

import java.math.BigDecimal;

public class Test010 {

	public static String trim(String str) {
		if (str.indexOf(".") != -1 && str.charAt(str.length() - 1) == '0') {
			return trim(str.substring(0, str.length() - 1));
		} else {
			return str.charAt(str.length() - 1) == '.' ? str.substring(0, str.length() - 1) : str;
		}
	}

	public static void main(String[] args) {
		BigDecimal bi = new BigDecimal("01.1000");
		System.out.println(bi);
		System.out.println(Test010.trim(bi.toString()));
	}

}
