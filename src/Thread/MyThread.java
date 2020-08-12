package Thread;

public class MyThread extends Thread {

    public void run(){
        for(int i=1;i<=50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
        }
    }

    public static void main(String[] args) {
        for(int i=0;i<50;i++){
            System.out.println(Thread.currentThread().getName()+":"+i);
            if (i == 10) {
                new MyThread().start();
                new MyThread().start();
            }
        }
    }
}
