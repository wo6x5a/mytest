package com.lcw.test.Integer;

public class IntegerTset {
    public static void main(String[] args) {
        System.out.println("<-128~127以内的Integer值，Integer x = value;的方式赋值！>");
        Integer i = 127;
        Integer j = 127;
        System.out.println("i=" + i + ",j =" + j);
        System.out.println("i == j：" + (i == j) + "<--比较-->i.equals(j):" + i.equals(j));
        System.out.println("<-128~127以外的Integer值，Integer x = value;的方式赋值！>");
        Integer m = 128;
        Integer n = 128;
        System.out.println("m=" + m + ",n =" + n);
        System.out.println("m == n：" + (m == n) + "<--比较-->m.equals(n):" + m.equals(n));
        System.out.println();
        System.out.println("<任意Integer值，Integer x = new Integer(value);的方式赋值！>");
        Integer x = new Integer(299);
        Integer y = new Integer(299);
        System.out.println("x=" + x + ",y =" + y);
        System.out.println("x == y：" + (x == y) + "<--比较-->x.equals(y):" + x.equals(y));
    }
}
