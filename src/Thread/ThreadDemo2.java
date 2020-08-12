package Thread;

import jdk.nashorn.internal.runtime.ECMAException;

public class ThreadDemo2 implements Runnable {
    int res= 100;


    public synchronized  void m1() throws Exception{
        System.out.println("m1 start run");
        res = 1000;
        Thread.sleep(5000);
        System.out.println("res = "+res);
        System.out.println("m1 run  end ");
    }

    public synchronized void m2() throws Exception{
        System.out.println("m2 start run:");
        Thread.sleep(2000);
        res = 2000;
        System.out.println("m2  run end ");
    }

    @Override
    public void run() {
        try{
            m1();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args)throws Exception{
        ThreadDemo2 i = new  ThreadDemo2();
        Thread tt = new Thread(i);
        tt.start();
        i.m2();
        Thread.sleep(1000);
        System.out.println(i.res);
    }
}
