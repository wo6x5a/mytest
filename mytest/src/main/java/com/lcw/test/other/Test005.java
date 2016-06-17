package com.lcw.test.other;

public class Test005 {

	public static void main(String[] args) {
		int i = 2;
		int j = 3;
		switch (i) {
		case 1:
			break;
		case 2:
			if (3 == j) {
				System.out.println("3");
			}
			if (1 == j) {
				System.out.println("1");
			}
			break;
		case 3:
			break;
		default:
			break;
		}
	}
}
