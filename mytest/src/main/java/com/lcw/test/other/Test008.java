package com.lcw.test.other;

import java.math.BigDecimal;

public class Test008 {
	private final static int i = 1;

	public static void main(String[] args) {
		BigDecimal b = new BigDecimal("1.31515615");
		BigDecimal c = new BigDecimal("1");
		BigDecimal d = c.divide(BigDecimal.TEN, 8, BigDecimal.ROUND_DOWN);
		System.out.println(d);
		final int j = Test008.i;
		System.out.println(j+1);
		System.out.println(b);
		System.out.println(b.setScale(2,BigDecimal.ROUND_DOWN));
	}
}
