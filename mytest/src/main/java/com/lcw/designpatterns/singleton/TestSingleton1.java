package com.lcw.designpatterns.singleton;

/**
 * 单例模式(饿汉模式)
 * 
 * @author chenwulou
 *
 */
public class TestSingleton1 {
	private final static TestSingleton1 INSTANCE = new TestSingleton1();

	private TestSingleton1() {
	}

	public static TestSingleton1 getInstance() {
    return INSTANCE;
  }
}
