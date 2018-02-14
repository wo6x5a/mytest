package com.lcw.test.other;

import java.util.HashMap;
import java.util.Set;

import com.google.common.collect.Sets;

public class Test013 {

    public static void main(String[] args) {
        HashMap<String, Integer> a = new HashMap<String, Integer>();
        a.put("a1", 1);
        a.put("a2", 2);
        a.put("a3", 3);
//        a.put("a3", null);
//        System.out.println(a.get("a1").hashCode());
//        System.out.println(a.get("a2").hashCode());
//        System.out.println(a.get("a3").hashCode());
//        System.out.println(a.get("a1").equals(a.get("a2")));
//        System.out.println(a.get("a1"));
//        System.out.println(a.get("a2"));
//        int ai=a.get("a4");
//        System.out.println(ai);

        Set<Long> sets = Sets.newConcurrentHashSet();

        sets.add(1L);
        sets.add(2L);
        sets.add(3L);
        System.out.println(sets.contains(5L));

        int n = 8;

        if (n < 1) {
            System.out.println("<1");
        } else if (n < 3) {
            System.out.println("1-3");
        } else if (n > 5 & n < 7) {
            System.out.println("5-7");
        } else if (n > 7 & n < 9) {
            System.out.println("7-9");
        }


    }

}
