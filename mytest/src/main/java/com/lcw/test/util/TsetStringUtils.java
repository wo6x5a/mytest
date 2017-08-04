package com.lcw.test.util;

import java.util.Date;
import org.apache.commons.lang.ObjectUtils;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.SystemUtils;
import org.apache.commons.lang.time.DateUtils;

public class TsetStringUtils {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "abc";
		String s5 = " abc ";
		String s6 = " a b c ";
		System.out.println(StringUtils.trim(s1));
		System.out.println(StringUtils.trim(s2));
		System.out.println(StringUtils.trim(s3));
		System.out.println(StringUtils.trim(s4));
		System.out.println(StringUtils.trim(s5));
		System.out.println(StringUtils.trim(s6));
		System.out.println(StringUtils.replace(s6, " ", ""));
		System.out.println("---------------------------");
		System.out.println(StringUtils.strip(s1));
		System.out.println(StringUtils.strip(s2));
		System.out.println(StringUtils.strip(s3));
		System.out.println(StringUtils.strip(s4));
		System.out.println(StringUtils.strip(s5));
		System.out.println(StringUtils.strip(s6));
		System.out.println("---------------------------");
		System.out.println(StringUtils.equalsIgnoreCase("abC1", "ABC1"));
		System.out.println("---------------------------");
		System.out.println(StringUtils.indexOf("12345678", "1", 2));
		System.out.println("---------------------------");
		Object obj1 = null;
		System.out.println(ObjectUtils.toString(obj1));
		System.out.println("---------------------------");
		System.out.println(SystemUtils.JAVA_HOME);
		System.out.println("---------------------------");
		Date date1 = new Date();
		System.out.println(date1);
		System.out.println(DateUtils.addDays(date1, 2));
		System.out.println(DateUtils.round(date1, 1));
		
		System.out.println(StringUtils.substringAfter("http://172.16.31.196:9093/pic/article/1472792991571.png", "http://172.16.31.196:9093"));
        String [] strs = StringUtils.substringsBetween(null, "http://172.16.31.196:9093", ".png");
        for(String str : strs){
            System.out.println(str);
         }
	}
}
