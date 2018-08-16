package com.lcw.test.thread;

import org.apache.commons.lang3.RandomUtils;

/**
 * @author: chenwu.lcw
 * @date: 2018/3/14
 */
public class TestThreadClient {
    public static void main(String[] args) {
        TestThreadClient testThreadClient = new TestThreadClient();
        //for(int i = 0; i<100 ; i++){
        //    testThreadClient.test();
        //}
        //testThreadClient.test1(1);
    }

    public void test() {
        InvokeUtils.getInstance().asyncCall(new Runnable() {
            @Override
            public void run() {
                System.out.println("其他任务1");
                int j = 0;
                for (int i = 0; i < 10; i++) {
                    System.out.println("其他任务" + i);
                    j= RandomUtils.nextInt(5,10);
                    System.out.println(j);
                }

                if (j < 8) {

                    InvokeUtils.getInstance().asyncCall(new Runnable() {
                        @Override
                        public void run() {
                            System.out.println(Thread.currentThread().getName() + "正在执行");
                            InvokeUtils.sleep(3000);
                            test();
                        }
                    });
                }
            }

        });

    }


    public void test1(final int i){
        System.out.println(Thread.currentThread().getName() + "---"+i);
        test1(i+1);

    }
}