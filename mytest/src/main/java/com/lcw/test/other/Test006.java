package com.lcw.test.other;


public class Test006 {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			switch (i) {
			case 1:
				System.out.println("1");
				continue;
			case 2:
				System.out.println("2");
				continue;
			case 3:
				System.out.println("3");
				continue;
			case 4:
				System.out.println("4");
				continue;
			case 5:
				System.out.println("5");
				break;
			default:
				continue;
			}
			System.out.println("ddddd");

		}
	}
}