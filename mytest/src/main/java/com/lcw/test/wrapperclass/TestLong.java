package com.lcw.test.wrapperclass;

public class TestLong {
	public static void main(String[] args) {
		long prodNum = 1L;
		long prodNum1 = 1L;
		prodNum = prodNum++;
		System.out.println(prodNum);
		System.out.println(++prodNum1);
	}
}
