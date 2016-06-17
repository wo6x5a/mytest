package com.lcw.test.other;

import java.util.Random;

public class Test004 {

	public static void main(String[] args) {
			Random random = new Random();
			StringBuilder buf = new StringBuilder();
			for(int i =0;i<6;i++){
				int code = random.nextInt(9);
				buf.append(code);
				System.out.println(code);
			}
			System.out.println(buf.toString());
	}
}
