package com.lcw.test.thread;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import javax.annotation.PostConstruct;

/**
 * @author: chenwu.lcw
 * @date: 2018/4/3
 */
public class ThreadExecutorUtils {

    private static ThreadExecutorUtils self;

    public static ThreadExecutorUtils getInstance() {
        if (self == null) {
            synchronized (ThreadExecutorUtils.class) {
                if (self == null) {
                    self = new ThreadExecutorUtils();
                }
            }
        }
        return self;
    }

    public ThreadPoolExecutor parallelOperExecutor = new ThreadPoolExecutor(10,
        30, 5L, TimeUnit.SECONDS, new LinkedBlockingDeque<Runnable>(10),
        new MyThreadFactory("pool1"), new ThreadPoolExecutor.CallerRunsPolicy()) {
        @Override
        public void afterExecute(Runnable r, Throwable t) {
            MyThreadFactory factory = (MyThreadFactory) this.getThreadFactory();
            if (this.getQueue().size() == 0) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("线程池监控数据").append("【").append(factory.getNamePrefix()).append("】").append("\n");
            sb.append("taskCount =  ").append(this.getTaskCount()).append("\n");
            sb.append("completedTaskCount =  ").append(this.getCompletedTaskCount()).append("\n");
            sb.append("activeCount =  ").append(this.getActiveCount()).append("\n");
            sb.append("poolSize = ").append(this.getPoolSize()).append("\n");
            sb.append("largestPoolSize =  ").append(this.getLargestPoolSize()).append("\n");
            sb.append("corePoolSize =  ").append(this.getCorePoolSize()).append("\n");
            sb.append("maximumPoolSize =  ").append(this.getMaximumPoolSize()).append("\n");
            sb.append("queue.size =  ").append(this.getQueue().size());
            sb.append("\n**********************\n\n");
        }
    };

    Map<String, ThreadPoolExecutor> poolExecutorMap = new HashMap();

    @PostConstruct
    public void init() {

        poolExecutorMap.put("pool1", parallelOperExecutor);
    }

    public String showThreadPoolStat() {
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, ThreadPoolExecutor> entry : poolExecutorMap.entrySet()) {
            ThreadPoolExecutor poolExecutor = entry.getValue();
            sb.append(entry.getKey()).append("线程池监控数据:\n");
            sb.append("taskCount =  ").append(poolExecutor.getTaskCount()).append("\n");
            sb.append("completedTaskCount =  ").append(poolExecutor.getCompletedTaskCount()).append("\n");
            sb.append("activeCount =  ").append(poolExecutor.getActiveCount()).append("\n");
            sb.append("poolSize = ").append(poolExecutor.getPoolSize()).append("\n");
            sb.append("largestPoolSize =  ").append(poolExecutor.getLargestPoolSize()).append("\n");
            sb.append("corePoolSize =  ").append(poolExecutor.getCorePoolSize()).append("\n");
            sb.append("maximumPoolSize =  ").append(poolExecutor.getMaximumPoolSize()).append("\n");
            sb.append("queue.size =  ").append(poolExecutor.getQueue().size());
            sb.append("\n**********************\n\n");
        }
        return sb.toString();
    }

    private static class MyThreadFactory implements ThreadFactory {
        final ThreadGroup group;
        final AtomicInteger threadNumber = new AtomicInteger(1);
        final String namePrefix;

        public MyThreadFactory(String name) {
            SecurityManager s = System.getSecurityManager();
            group = (s != null) ? s.getThreadGroup() : Thread.currentThread().getThreadGroup();
            namePrefix = "mypools-" + name + "-";
        }

        public String getNamePrefix() {
            return namePrefix;
        }

        @Override
        public Thread newThread(final Runnable r) {
            Thread t = new Thread(group, r, namePrefix + threadNumber.getAndIncrement() + "#", 0);

            if (t.isDaemon()){
                t.setDaemon(false);}
            if (t.getPriority() != Thread.NORM_PRIORITY){
                t.setPriority(Thread.NORM_PRIORITY);
            }

            return t;
        }
    }
}
