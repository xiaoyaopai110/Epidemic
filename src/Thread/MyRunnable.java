package Thread;

import java.sql.SQLOutput;
/*
* 该类是用来模拟死锁。
* */
public class MyRunnable  implements Runnable {

    public int flag = 1;
    static Object o1 = new Object();
    static Object o2 = new Object();
    public  MyRunnable(int flag) {
        this.flag = flag;
    };
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"的"+"flag:"+flag);
        if(flag==1){//  判断，如果flag =1 ，则先获取 o1的锁，再获取 o2的锁
            synchronized(o1){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized(o2){
                    System.out.println("1");
                }
            }

        }else if(flag==2){ //  判断，如果flag = 2 ，则先获取 o2的锁，再获取o1的锁
            synchronized(o2){
                try{
                    Thread.sleep(1000);
                }catch (Exception e){
                    e.printStackTrace();
                }
                synchronized(o1){
                    System.out.println("2");
                }
            }
        }
    }
}
