package com.lcw.test.other;

public class TestSwitchCase {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		String str = null;
		switch (str) {
		case "a":
			System.out.println("a");
			break;
		default:
			System.out.println("null");
			break;
		}
	}
}
