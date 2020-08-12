package ThreadDeep1;

/*
*  并发编程的三个特性 ，可见性，原子性 ，有序性
*  该程序演示并发编程的 原子性
*  在 increase 方法前，加上关键字 synchronized ，则保证其操作的原子性
* */
public class SynchronizedDemo1 {
    public static volatile int num = 0;

    public static  void increase(){
//    public static synchronized void increase(){
        for(int i=1;i<=10000;i++){
            num++;
        }
    }
    public static void main(String[] args) throws Exception{
        Thread[] threads = new Thread[3] ; // 存放十个线程的数组
        for(int i=0;i<threads.length;i++){
            threads[i]= new Thread(new Runnable() {
                @Override
                public void run() {
                    increase();
                }
            });
            threads[i].start();
        }
        Thread.sleep(1000);
        // 打印出的结果，每次是不相同的。具有随机性 ，在 increase 方法前，
        // 加上关键字 synchronized，则保证其结果的准确性和一致性
        System.out.println(num);
    }
}
