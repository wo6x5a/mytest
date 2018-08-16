package com.lcw.test.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @author: chenwu.lcw
 * @date: 2018/3/14
 */
public class InvokeUtils {

    private static InvokeUtils self;

    Executor threadPool = new ThreadPoolExecutor(Runtime.getRuntime().availableProcessors(),
        Runtime.getRuntime().availableProcessors() > 4 ? Runtime.getRuntime().availableProcessors()*2 : 6,
        1, TimeUnit.MINUTES, new ArrayBlockingQueue<Runnable>(20));

    private InvokeUtils() {

    }

    public void asyncCall(Runnable runnable) {
        threadPool.execute(runnable);
    }

    public static InvokeUtils getInstance() {
        if (self == null) {
            synchronized (InvokeUtils.class) {
                if (self == null) {
                    self = new InvokeUtils();
                }
            }
        }
        return self;
    }

    public static void sleep(long ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
