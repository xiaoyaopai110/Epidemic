package Lambda;
public class LambdaXtest4 {
    public static void main(String[] args) {
//        1、     匿名内部类 稍微复杂的写法
//        Runnable run = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hellow branch : "+Thread.currentThread());
//            }
//        };
//        new Thread(run).start();
//         2、稍微复杂的写法
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("hellow branch : "+Thread.currentThread());
            }
        }).start();

//      3、  最简单的写法
//        new Thread(()-> System.out.println("hellow branch: "+Thread.currentThread())).start();
        System.out.println("hellow main: "+Thread.currentThread());

    }
}
