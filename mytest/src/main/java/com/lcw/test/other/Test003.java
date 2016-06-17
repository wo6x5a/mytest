package com.lcw.test.other;

import java.math.BigDecimal;

public class Test003 {

	public static void main(String[] args) {
		Long unit = new BigDecimal("100.01").divide(new BigDecimal("3"), 0).longValue();
		System.out.println(unit);
	}
}


