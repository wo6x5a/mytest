package com.lcw.test.array;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArrays {
	public static void main(String[] args) {
		int i = 0x7fffffff;
		List<String> list = Arrays.asList("1", "2");
		System.out.println(list);
		System.out.println(i);
		Iterator it = list.iterator();
		// System.out.println(it);
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			String str = (String) iter.next();
			System.out.println(str);
		}

		List<Long> longList = Arrays.asList(1l,2l,3l,4l,5l);
		BigDecimal subsAmt = BigDecimal.ONE;
		BigDecimal util = BigDecimal.ONE;
		for (Long po : longList) {
			util = BigDecimal.valueOf(po);
			subsAmt = subsAmt.add(BigDecimal.ONE.multiply(util));
		}
		System.out.println(subsAmt);
	}
}
