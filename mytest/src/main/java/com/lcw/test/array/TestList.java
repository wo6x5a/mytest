package com.lcw.test.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.lcw.test.user.User;

public class TestList {
	public static void main(String[] args) {
		List<User> users = new ArrayList<User>();
		// System.out.println(users);
		// System.out.println(users.toArray());
		// System.out.println( users.toArray() == null);
		// System.out.println(users.toArray().length);
		// System.out.println(users.size());
		List<String> listStr = Arrays.asList();
		// System.out.println(listStr.isEmpty());
		for (String str : listStr) {
			System.out.println(str);
		}
		for (int i = 0; i < 5; i++) {
			User user  = new User();
			user.setAge(i);
			users.add(user);
		}
		System.out.println(users);
	}
}
