package com.lcw.test.util;

import java.util.Date;
import java.util.UUID;

public class TestUUID {
    public static void main(String[] args) {
        UUID uuid = UUID.randomUUID();
        System.out.println(uuid);
        System.out.println(new Date().getTime());
        boolean bool = true;
        bool = bool && false;
        System.out.println(bool);

    }
}
