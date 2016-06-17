package com.lcw.test.thread;

public class TestThread002 {

	private volatile static int value = 1;

	public static int getNext() {
//		try {
//			Thread.sleep(20);
//		} catch (InterruptedException e) {
//
//		}
		System.out.println("---" + value);
		return value++;
	}

	public static void main(String[] args) {
		for (int i = 0; i < 2; i++) {
			new Thread(new Runnable() {
				@Override
				public void run() {
					TestThread002.getNext();
				}
			}).start();
		}
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {

		}
		System.out.println(value);
	}

}
