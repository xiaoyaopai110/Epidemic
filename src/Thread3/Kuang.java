package Thread3;

public class Kuang implements Runnable{
    boolean flag =true ;
    @Override
    public void run() {
        int i = 1;
        while(flag){
            System.out.println("start count:"+i);
            i++;
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void shutdown(){
        this.flag = false;
    }

}
