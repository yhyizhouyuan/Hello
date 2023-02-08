package com.galaxy.thread_;

/**
 * <p>TODO</p>
 *
 * @author Hance
 * @version V1.0.0
 * @date 2023/2/7 9:29
 */
public class Test01 {
    public static void main(String[] args) {
        Runnable thread = () -> System.out.println("hello,world");
        MyThread myThread = new MyThread();
        MyThread myThread1 = new MyThread();
        myThread.start();
        myThread1.start();
    }
}


class MyThread extends  Thread{
    private  int ticket = 5;
    @Override
    public void run() {
        while (true) {
            System.out.println("正在售票，"+ticket--);
            if (ticket < 0){
                break;
            }
        }
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("hello,myRunnable");
    }
}