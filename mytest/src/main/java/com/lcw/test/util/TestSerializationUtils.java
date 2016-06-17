package com.lcw.test.util;

import org.apache.commons.lang.SerializationUtils;

import com.lcw.test.user.User;

public class TestSerializationUtils {
	public static void main(String[] args) {
		User user = new User();
		user.setAge(1);
		user.setMobile("123");
		user.setName("aa");
		User u = (User)SerializationUtils.clone(user);
		u.setAge(2);
		System.out.println(u.getAge());
		System.out.println(user.getAge());
	}
}
