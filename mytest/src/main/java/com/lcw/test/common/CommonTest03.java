package com.lcw.test.common;

public class CommonTest03 {

    public CommonTest03() {
        CommonTest03 c3 = new CommonTest03();
        c3.add(1, 2);
    }

    public static void main(String[] args) {
//        CommonTest03.add1(1, 2);
        String a = "110";
        Long b = 1100l;
        Long c = 1100l;
        System.out.println(c.equals(b));
        
    }

    private void add(int i, int j) {
        System.out.println(i + j);
    }

    private static void add1(int i, int j) {
        System.out.println(i + j);
    }
}
