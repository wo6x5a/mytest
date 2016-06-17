package com.lcw.designpatterns.singleton;

/**
 * 单例模式(懒汉模式)
 * 
 * @author chenwulou
 *
 */
public class TestSingleton2 {
	private TestSingleton2() {
	}

	private static TestSingleton2 instance = null;

	public static TestSingleton2 getInstance() {
		if (null == instance) {
			synchronized (TestSingleton2.class) {
				if (null == instance) {
					instance = new TestSingleton2();
				}
			}
		}
		return instance;
	}

	/*public static synchronized TestSingleton2 getInstance() {
		if (null == instance) {
			instance = new TestSingleton2();
		}
		return instance;
	}*/

}
