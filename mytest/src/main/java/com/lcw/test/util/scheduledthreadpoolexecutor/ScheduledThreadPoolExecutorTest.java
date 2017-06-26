package com.lcw.test.util.scheduledthreadpoolexecutor;

import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ScheduledThreadPoolExecutorTest {
    public static void main(String[] args) {
        // 获得实例，并且设置它的容量为5个
        ScheduledThreadPoolExecutor sExecutor = new ScheduledThreadPoolExecutor(5);
        MyTask task = new MyTask();
        // 隔2秒后开始执行任务，并且在上一次任务开始后隔一秒再执行一次
        sExecutor.scheduleWithFixedDelay(task, 0, 1, TimeUnit.SECONDS);
        // 隔6秒后执行一次，但只会执行一次
        // sExecutor.schedule(task, 6, TimeUnit.SECONDS);
        /**
         * 和Timer类似，也可以直接在任务的run()方法中调用调度方法停止 这个方法会平滑的关闭调度器，等待所有任务结束
         */
        // sExecutor.shutdown();
    }

    static class MyTask implements Runnable {
        @Override
        public void run() {
            System.out.println("当前执行的线程" + Thread.currentThread().getName());
        }
    }
}
