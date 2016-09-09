package com.lcw.test.common;

public class CommonTest02 {

	public static void main(String[] args) {
		String s1 = "你好硕大的阿萨德爱的撒";
		String s2 = "好";
		String s3 = "好";
		String s4 = "你好硕大的阿萨德爱的撒";
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(System.currentTimeMillis());
		StringBuilder sb = new StringBuilder("1,2,3,");
		System.out.println(sb.delete(sb.length() - 1, sb.length()));
	}
}
