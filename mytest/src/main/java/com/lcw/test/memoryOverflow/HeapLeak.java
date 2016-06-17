package com.lcw.test.memoryOverflow;

import java.util.ArrayList;

/**
 * 堆溢出 
 * 
 * Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
 * 
 * @author chenwulou
 *
 */
public class HeapLeak {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		while (true) {
			list.add(new HeapLeak.method());
		}
	}

	static class method {
	}
}
