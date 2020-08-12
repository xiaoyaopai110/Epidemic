package Thread2;

import static java.lang.Thread.*;

/**
 * 该类是用来存放 窝头的筐 该筐是公共资源。
 */
public class SyncStack {
    int index = 0;                // 用来标记存放了几个窝头
    WoTou[] arrWT = new WoTou[6]; // 存放窝头的数组
    public synchronized void push(WoTou wt) { // 线程获取当前对象的对象锁 ，如下代码是同步执行
        System.out.println(" 生产者线程： "+Thread.currentThread().getName());
        while (index == arrWT.length) {  // 用while 做判断 ，即被打断后，先判读，再继续执行。
            try {
                System.out.println(" 窝窝头满了 ");
                System.out.println(" 生产者线程： "+Thread.currentThread().getName()+" 开始等待 ");
                this.wait();  // 当执行wait()方法时候，会释放当前的锁，然后让出CPU，进入等待状态。
                               // 别的线程执行this.notifyall()命令时，会唤醒该线程，然后 try 块中代码继续执行。
            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notify();
        arrWT[index] = wt;
        System.out.println("生产: " + arrWT[index]);
        index++;
    }

    public synchronized WoTou pop() {
        System.out.println("消费者线程 ："+Thread.currentThread().getName());
        while (index == 0) {
            try {
                System.out.println("消费者线程 ："+Thread.currentThread().getName()+" 开始等待");
                this.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.notifyAll();
        index--;
        System.out.println("消费 :" + arrWT[index]);
        return arrWT[index];
    }
}
