package ThreadDeep1;
/*  https://www.bilibili.com/video/BV1RE411q7Yd?p=4
*   并发编程的三个特性 ，可见性，原子性 ，有序性
*   该程序演示并发编程的 可见性
*   在变量前面加上 volatile ，可以达到 线程间 变量可见的效果。原理参考 java_volatile.png
* */
public class VolatileDemo1 {
//    private static    boolean start = true;  // 用该代码，无法达到可见性的目标
    private static  volatile  boolean start = true; // 用该代码，可达到可见性的目标。volatile 借助总线缓存一致协议来实现。

    public static void main(String[] args) throws Exception {
//      启动第一个线程 线程,根据 start 判断，如果为 true ,则一直执行
//
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (start){ // 将 变量 start 加载到该线程的工作内存 。
                }
                System.out.println(" 运行完成 ！");
            }
        }).start();

        Thread.sleep(1000);

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("准备关闭第一个线程");
                start = false;
                System.out.println("第一个线程关闭完成 ");
            }
        }).start();
    }
}
