package Thread;

public class NewThreadRun implements Runnable{
    private static  int num = 0 ;
    @Override
   /* public void run() {
        for(int i=0;i<1000;i++){
            System.out.println(Thread.currentThread().getName()  + "开始跑："+i);
        }
    }*/
    public void run() {
      this.add();
    }

//    synchronized 关键字，表示的是获取当前对象的锁，方法中的代码是原子操作。
//    把 synchronized 关键字去掉，体会执行结果不是期望的结果
    public /*synchronized*/ void add(){
//        synchronized(this){  表示获取当前对象的锁
            num++;
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + "*********" + num);
//        }
    }
}
