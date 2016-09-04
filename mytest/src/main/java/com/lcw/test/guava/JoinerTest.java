package com.lcw.test.guava;

import com.google.common.base.Joiner;

public class JoinerTest {
	public static void main(String[] args) {
		System.out.println(Joiner.on(' ').join(1, 2, 3));
	}
}
