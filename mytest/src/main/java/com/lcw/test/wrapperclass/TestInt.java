package com.lcw.test.wrapperclass;

import org.apache.commons.lang3.StringUtils;

public class TestInt {
    public static void main(String[] args) {
        Integer i = 2147483647;
        String end = "9";
        String s = "123456788";
        if (StringUtils.length(s) < 9 || !StringUtils.endsWith(s, end)) {
            System.out.println(s + end);
        }
    }
}
