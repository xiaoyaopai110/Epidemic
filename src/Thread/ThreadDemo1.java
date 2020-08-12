package Thread;
public class ThreadDemo1 {

    public static void main(String[] args){
        // demo1
       /*NewThreadRun run = new NewThreadRun();
//       run.run();  // 方法调用
       Thread t1 = new Thread(run);
       t1.start();     //  分支线程开始运行
       for(int i=0;i<100;i++){    // 主线程运行
            System.out.println("main 开始跑："+i);
        }*/
        // demo2
        NewThreadRun run = new NewThreadRun();
        Thread t1 = new Thread(run);
        Thread t2 = new Thread(run);
        t1.start();
        t2.start();
    }
}
