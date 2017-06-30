package com.lcw.test.other;

import java.util.Calendar;
import java.util.Date;

public class Test014 {

  public static final Date testCr(Date fullDate) {
    Calendar cal = Calendar.getInstance();
    cal.setTime(fullDate);
    cal.set(11, 0);
    cal.set(12, 0);
    cal.set(13, 0);
    cal.set(14, 0);
    return cal.getTime();
  }

  public static void main(String[] args) {
    Date date = new Date();
    System.out.println(date);
    System.out.println(Test014.testCr(date));
  }
}
