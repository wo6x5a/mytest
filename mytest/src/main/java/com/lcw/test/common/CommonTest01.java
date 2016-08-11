package com.lcw.test.common;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import com.lcw.test.user.User;

public class CommonTest01 {

	public static void main(String[] args) {
		User user = new User();
		user.setAge(11);
		user.setMobile("13212321232");
		user.setName("6x5");
		CommonTest01.test1(user);
		System.out.println(CommonTest01.getFieldMap(user).toString());
		System.out.println(CommonTest01.class.getSimpleName());
	}
	
	public static void test1(Object obj){
		System.out.println();
	}

	public static Method getGetter(Class<?> clazz, Field field) {
		String filedName = field.getName();
		String firstLetter = filedName.substring(0, 1).toUpperCase();
		String getMethodName = "get" + firstLetter + filedName.substring(1);
		Method getMethod = null;
		try {
			getMethod = clazz.getDeclaredMethod(getMethodName);
		} catch (Exception e) {
		}
		return getMethod;
	}

	public static Method getSetter(Class<?> clazz, Field field) {
		Class<?> fieldType = field.getType();
		String filedName = field.getName();
		String firstLetter = filedName.substring(0, 1).toUpperCase();
		String setMethodName = "set" + firstLetter + filedName.substring(1);
		Method setMethod = null;
		try {
			setMethod = clazz.getDeclaredMethod(setMethodName, fieldType);
		} catch (Exception e) {
		}
		return setMethod;
	}

	public static Map<String, String> getFieldMap(Object o) {
		Class<?> clazz = o.getClass();
		Field[] fields = clazz.getDeclaredFields();
		Map<String, String> fieldMap = new HashMap<>();
		for (Field field : fields) {
			String fieldName = field.getName().toUpperCase();
			Method getMethod = CommonTest01.getGetter(clazz, field);
			String fieldValue = null;
			try {
				fieldValue = getMethod.invoke(o).toString();
			} catch (Exception e) {
			}
			if (null != fieldValue)
				fieldMap.put(fieldName, fieldValue);
		}
		return fieldMap;
	}
}
