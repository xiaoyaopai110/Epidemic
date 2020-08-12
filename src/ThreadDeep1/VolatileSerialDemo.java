package ThreadDeep1;

import java.util.*;

/*   JMM  jAVA  Memory Model java内存模型 。
 *   并发编程的三个特性 ，可见性，原子性 ，有序性
 *   该程序演示并发编程的 可见性
 *   在变量前面加上 volatile ，可以达到 命令有序的效果
 * */
public class VolatileSerialDemo {
    static int x = 0,y=0;
//    static volatile int x = 0,y=0;  // 保证其 有序性
    public static void main(String[] args) throws  InterruptedException{
        Set<String> resultSet = new HashSet<>();
        Map<String,Integer> resultMap = new HashMap<>();
        for(int i=1;i<=10000;i++){
            x = 0;
            y = 0;
            resultMap.clear();
            Thread one = new Thread(new Runnable() {
                @Override
                public void run() {
                    int a = y;
                    x = 1;
                    resultMap.put("a",a);
                }
            });
            Thread two  = new Thread(new Runnable() {
                @Override
                public void run() {
                    int b = x;
                    y = 1 ;
                    resultMap.put("b",b);
                }
            });
            one.start();
            two.start();
            one.join();
            two.join();
            resultSet.add("a="+resultMap.get("a")+","+"b="+resultMap.get("b"));
            System.out.println(resultSet);
        }
    }
}
