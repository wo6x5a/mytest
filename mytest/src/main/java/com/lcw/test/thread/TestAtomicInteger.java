package com.lcw.test.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class TestAtomicInteger {
	/**
	 * 来看AtomicInteger提供的接口。
	 * 
	 * //获取当前的值
	 * 
	 * public final int get()
	 * 
	 * //取当前的值，并设置新的值
	 * 
	 * public final int getAndSet(int newValue)
	 * 
	 * //获取当前的值，并自增
	 * 
	 * public final int getAndIncrement()
	 * 
	 * //获取当前的值，并自减
	 * 
	 * public final int getAndDecrement()
	 * 
	 * //获取当前的值，并加上预期的值
	 * 
	 * public final int getAndAdd(int delta)
	 * 
	 * 
	 * @author YangBaoBao
	 *
	 */

	public static void main(String[] args) {
		AtomicInteger ai = new AtomicInteger(0);
		int i1 = ai.get();
		v(i1);
		int i2 = ai.getAndSet(5);
		v(i2);
		int i3 = ai.get();
		v(i3);
		int i4 = ai.getAndIncrement();
		v(i4);
		v(ai.get());

	}

	static void v(int i) {
		System.out.println("i : " + i);
	}
}
