package com.lcw.test.array;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.google.common.base.Splitter;
import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.RandomUtils;
import org.apache.commons.lang3.StringUtils;

public class TestArray {

    public static void main(String[] args) {

        BigDecimal b = new BigDecimal(10050.5).divide(new BigDecimal(100),2,2);
        String[] s = new String[] {"1","2","3"};
        System.out.println(ArrayUtils.toString(s));
        double d = 10010/100;
        System.out.println(b.toString());
        System.out.println(d);
        System.out.println(3%10);


        int[] a = new int[10];
//		System.out.println(a[2]);
        List<String> lis = new ArrayList<>();
        lis.add("11");
        lis.add("22");
        lis.add("33");
        lis.add("44");

        System.out.println(lis.toArray());
        System.out.println(lis.toString());
        System.out.println(RandomUtils.nextInt(70,90)/100f);

//        System.out.println(lisStr.substring(1, lisStr.length()-1));
//        System.out.println(lis.toString());


        String str1 = "1,2 ,3,4 ,5";
        str1 = StringUtils.replace(null, " ", "");
        if (Splitter.on(",").splitToList(str1).contains(2+"")) {
            System.out.println(str1);
        }


        }
        //
        //System.out.println((double)3/(double)2);
        //
        //for (String s : lis) {
        //    if (StringUtils.equals("22", s)) {
        //        continue;
        //    }
        //    System.out.println(s);
        //}
        //System.out.println(!(false && true));
        //System.out.println(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss:SSS"));    }
}
