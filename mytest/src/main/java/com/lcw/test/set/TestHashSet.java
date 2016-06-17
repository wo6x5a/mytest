package com.lcw.test.set;

import java.util.HashSet;
import java.util.Set;

public class TestHashSet {
	public static void main(String[] args) {
		Set<Integer> set = new HashSet<Integer>();
		set.add(1);
		set.add(1);
		set.add(2);
		set.add(2);
		System.out.println(System.currentTimeMillis());
//		for(int i = 0;i<100000000;i++){
//			set.add(i);
//		}
		System.out.println(System.currentTimeMillis());
		System.out.println(set.size());
		
	}

}
