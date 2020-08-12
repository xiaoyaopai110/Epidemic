package Thread2;

public class ProducerConsumer {
    public static void main(String[] args) {
        SyncStack ss = new SyncStack();
        Producer p1 = new Producer(ss);
        Producer p2 = new Producer(ss);
        Consumer c1 = new Consumer(ss);
        Consumer c2 = new Consumer(ss);
        new Thread(p1).start();
        new Thread(p2).start();
       // new Thread(p).start();
        new Thread(c1).start();
        new Thread(c2).start();
    }
}
