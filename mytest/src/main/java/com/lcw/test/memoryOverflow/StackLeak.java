package com.lcw.test.memoryOverflow;

/**
 * 栈溢出
 * Exception in thread "main" java.lang.StackOverflowError
 * @author chenwulou
 */
public class StackLeak {
	public static void main(String[] args) {
		method();
	}

	public static void method() {
		method();
	}
}
