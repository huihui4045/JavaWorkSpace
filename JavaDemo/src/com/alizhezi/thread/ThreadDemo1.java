package com.alizhezi.thread;

/**
 * Created by gavin on 2017/11/28.
 */
public class ThreadDemo1 extends Thread{
    public volatile boolean isExit=false;
    public static void main(String[] args) {
        ThreadDemo1  threadFlag=new ThreadDemo1();
        threadFlag.start();
        System.out.println("当前线程："+Thread.currentThread().getId());
        try {
            Thread.sleep(3000);
            threadFlag.isExit=true;
            threadFlag.join();
            System.out.println("线程退出");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void run() {

        int i=0;
        while (!isExit){
            System.out.println("执行的次数："+(i++));
            try {
                Thread.sleep(1000);
                System.out.println("当前线程："+Thread.currentThread().getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}


