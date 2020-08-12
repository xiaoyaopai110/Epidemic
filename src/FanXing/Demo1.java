package FanXing;

import java.util.ArrayList;
public class Demo1 {
    public static void main(String[] args) {
        ArrayList strList = new ArrayList<>();
        strList.add(6);
        strList.add("Hello");
        strList.add(" China");
        // System.out.println(strList);
        for(int i=0;i<strList.size();i++){
            System.out.println(strList.get(i));
        }
    }
}
