package Thread;
public class ThreadDemo3 {
  /*
  *  模拟死锁
  * */
    public static void main(String[] args){
        int flag1 = 1;
        int flag2 = 2;
        MyRunnable run1 = new MyRunnable(flag1);
        MyRunnable run2 = new MyRunnable(flag2);

        Thread t1 = new Thread(run1);
        Thread t2 = new Thread(run2);
        t1.start();
        t2.start();
    }
}
