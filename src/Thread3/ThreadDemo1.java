package Thread3;

public class ThreadDemo1 {
    volatile
    boolean running = true;
    void m(){
        int i = 1;
        System.out.println("start");
        while(running){
            System.out.println("counter:"+i);
            i++;
            try{
                Thread.sleep(1000);
            }
            catch (Exception e){
                e.printStackTrace();
            }
        }
        System.out.println("end ");
    }

    void  shutdown(){
        running = false;
    }
    public static void main(String[] args){
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
         new Thread(threadDemo1::m).start();
        try {
        Thread.sleep(8000);
         }catch (Exception e){
        e.printStackTrace();
        }
        //threadDemo1.shutdown();
       threadDemo1.running = false;
    // kuang.shutdown();
    }
}
