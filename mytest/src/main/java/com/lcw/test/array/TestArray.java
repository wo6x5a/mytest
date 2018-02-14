package com.lcw.test.array;

import java.math.BigDecimal;

public class TestArray {

    public static void main(String[] args) {


        //OrderAutoCheckinDO orderAutoCheckinDO = new OrderAutoCheckinDO();
        //orderAutoCheckinDO.setRoomNumber("909");
        //orderAutoCheckinDO.setBuildingNum("9");
        //orderAutoCheckinDO.setCardType("门卡");
        //orderAutoCheckinDO.setFloor(null);
        //orderAutoCheckinDO.setInvalidTime(new Date());
        //orderAutoCheckinDO.setValidTime(new Date());
        //orderAutoCheckinDO.setLockNum(null);
        //orderAutoCheckinDO.setMakeCard(true);
        //System.out.println(JSON.toJSONString(orderAutoCheckinDO));

        BigDecimal b = new BigDecimal(10050.5).divide(new BigDecimal(100),2,2);

        double d = 10010/100;
        System.out.println(b.toString());
        System.out.println(d);
        System.out.println(3%10);

/**
 *
        int[] a = new int[10];
//		System.out.println(a[2]);
        List<String> lis = new ArrayList<>();
        lis.add("11");
        lis.add("22");
        lis.add("33");
        lis.add("44");

        System.out.println(lis.toArray());
        String lisStr = lis.toString();
//        System.out.println(lisStr.substring(1, lisStr.length()-1));
//        System.out.println(lis.toString());

        String[] s1 = StringUtils.split("3:2", ":");

        System.out.println((double)3/(double)2);

        for (String s : lis) {
            if (StringUtils.equals("22", s)) {
                continue;
            }
            System.out.println(s);
        }
 **/
    }
}
