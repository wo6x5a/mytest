package com.lcw.test.wrapperclass;

import java.math.BigDecimal;

public class TestBigDecimal {
	public static void main(String[] args) {
		Object obj = new Object();
//		BigDecimal b1 = new BigDecimal("0.0");
//		System.out.println(BigDecimal.ZERO.equals(b1));
//		System.out.println(String.valueOf(obj));
		
		BigDecimal b1 = BigDecimal.ZERO;
		BigDecimal b2 = BigDecimal.TEN;
		System.out.println(b1.compareTo(b2));
	}
}
