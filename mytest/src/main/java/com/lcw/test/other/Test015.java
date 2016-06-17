package com.lcw.test.other;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Test015 {
	private static final BigDecimal hundred = BigDecimal.valueOf(100);
	private static final BigDecimal thousand = BigDecimal.valueOf(1000);

	public static BigDecimal formatPercent(BigDecimal value) {
		double val = value.multiply(thousand).doubleValue();
		if (val % 10 == 0) {
			return value.multiply(hundred).setScale(0, RoundingMode.DOWN);
		}
		val = value.multiply(BigDecimal.valueOf(10000)).doubleValue();
		if (val % 10 == 0) {
			return value.multiply(hundred).setScale(1, RoundingMode.DOWN);
		}
		val = value.multiply(BigDecimal.valueOf(100000)).doubleValue();
		if (val % 10 == 0) {
			return value.multiply(hundred).setScale(2, RoundingMode.DOWN);
		}
		val = value.multiply(BigDecimal.valueOf(1000000)).doubleValue();
		if (val % 10 == 0) {
			return value.multiply(hundred).setScale(3, RoundingMode.DOWN);
		}
		val = value.multiply(BigDecimal.valueOf(10000000)).doubleValue();
		if (val % 10 == 0) {
			return value.multiply(hundred).setScale(4, RoundingMode.DOWN);
		} else {
			return value.multiply(hundred).setScale(4, RoundingMode.DOWN);
		}
	}
	public static void main(String[] args) {
		System.out.println(formatPercent(new BigDecimal("0.3")));
		
	}
}
