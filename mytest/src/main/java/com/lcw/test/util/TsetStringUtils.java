package com.lcw.test.util;

import org.apache.commons.lang3.StringUtils;

public class TsetStringUtils {
	public static void main(String[] args) {
		String s1 = null;
		String s2 = "";
		String s3 = " ";
		String s4 = "abc";
		String s5 = " abc ";
		String s6 = " a b c ";
        //System.out.println(StringUtils.trim(s1));
        //System.out.println(StringUtils.trim(s2));
        //System.out.println(StringUtils.trim(s3));
        //System.out.println(StringUtils.trim(s4));
        //System.out.println(StringUtils.trim(s5));
        //System.out.println(StringUtils.trim(s6));
        //System.out.println(StringUtils.replace(s6, " ", ""));
        //System.out.println("---------------------------");
        //System.out.println(StringUtils.strip(s1));
        //System.out.println(StringUtils.strip(s2));
        //System.out.println(StringUtils.strip(s3));
        //System.out.println(StringUtils.strip(s4));
        //System.out.println(StringUtils.strip(s5));
        //System.out.println(StringUtils.strip(s6));
        //System.out.println("---------------------------");
        //System.out.println(StringUtils.equalsIgnoreCase("abC1", "ABC1"));
        //System.out.println("---------------------------");
        //System.out.println(StringUtils.indexOf("12345678", "1", 2));
        //System.out.println("---------------------------");
        //Object obj1 = null;
        //System.out.println(ObjectUtils.toString(obj1));
        //System.out.println("---------------------------");
        //System.out.println(SystemUtils.JAVA_HOME);
        //System.out.println("---------------------------");
        //Date date1 = new Date();
        //System.out.println(date1);
        //System.out.println(DateUtils.addDays(date1, 2));
        //System.out.println(DateUtils.round(date1, 1));
        //
        //System.out.println(StringUtils.substringAfter("http://172.16.31.196:9093/pic/article/1472792991571.png", "http://172.16.31.196:9093"));
        //String [] strs = StringUtils.substringsBetween(null, "http://172.16.31.196:9093", ".png");
        //for(String str : strs){
        //    System.out.println(str);
        // }

		//String a = "[{\"key\":\"port\",\"value\":\"20\",\"explain\":\"\"},{\"key\":\"name\",\"value\":\"海天\",\"explain\":\"\"},{\"key\":\"name\",\"value\":\"海天\",\"explain\":\"名称\"}]";
		//String a2 = "[{\"key\":\"port\",\"value\":\"20\",\"explain\":\"\"}]";
		//String b = "[{\"key\":\"port\",\"value\":\"20\"},{\"key\":\"name\",\"value\":\"海天\"},{\"key\":\"name\",\"value\":\"海天\"}]";
		//String c = "[{\"key\":\"port\",\"value\":\"20\"}]";
		//// {"port":20;}
        //
		//String a1 = "[{\"key\":\"port\",\"value\":\"20\",\"explain\":\"端口号\"},{\"key\":\"name\",\"value\":\"海天\",\"explain\":\"名称\"}]";
        //
		//String big = "{\"bigImage\":\"oss://verify-img:0a238d63-725f-4d39-a56d-6869e8cc0f51.jpg\"}";

		//System.out.println(a.replaceAll(",\"explain\":\".+\"}", "}"));
		//System.out.println(StringUtils.replaceAll(a,",\"explain\":\".+\"}", "}"));
		//System.out.println( replaceStr(b));
		//System.out.println( replaceStr(c));
		//System.out.println( replaceStr2(a2));
		//System.out.println( replaceStr2(a));
        //System.out.println(DateUtils.addDays(new Date(),1));
		//System.out.println(DateUtils.addDays(new Date(),-1).before(new Date()));
		//System.out.println( replaceStr2(c));
		//System.out.println( replcaeStr3(big));
	}

	private static String replaceStr(String conf){
		conf = StringUtils.replace(conf,"[{\"key\":", "{");
		conf = StringUtils.replace(conf,"},{\"key\":", ",");
		conf = StringUtils.replace(conf,",\"value\"", "");
		conf = StringUtils.replace(conf,"]", "");
		return conf;
	}

	private static String replaceStr2(String conf){
		conf = StringUtils.replace(conf,"[{\"key\":", "{");
		conf = StringUtils.replaceAll(conf,",\"explain\":\".{0,20}\"},\\{\"key\":", ",");
		conf = StringUtils.replaceAll(conf,",\"explain\":\".{0,20}\"}]", "}");
		conf = StringUtils.replace(conf,"},{\"key\":", ",");
		conf = StringUtils.replace(conf,",\"value\"", "");
		conf = StringUtils.replace(conf,"]", "");
		return conf;
	}

	private static String replcaeStr3(String conf){

		String faceImage = StringUtils.replace(conf,"{\"bigImage\":\"", "");
		faceImage = StringUtils.replace(faceImage,"\"}", "");
		return faceImage;
	}

}
