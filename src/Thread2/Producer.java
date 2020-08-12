package Thread2;

public class Producer implements Runnable{
    SyncStack ss = null;

    Producer(SyncStack ss) {
        this.ss = ss;
    }

    public void run() {
        for (int i = 0; i < 20; i++) {
            WoTou wt = new WoTou(i,Thread.currentThread().getName());
            ss.push(wt);
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
