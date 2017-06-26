package com.lcw.test.util.timer;

import java.util.TimerTask;

public class MyTask extends TimerTask {
    private int id;
    public MyTask(int id){
        this.id = id;
    }
    
    @Override
    public void run() {
        System.out.println("线程" + id + ":  正在 执行。。");
        // System.gc();
    }
}
