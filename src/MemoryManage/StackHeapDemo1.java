package MemoryManage;
/*
* https://www.bilibili.com/video/BV1Yt41197sM?p=28
*  栈中存放 局部变量、引用的地址及 形参
* */
public class StackHeapDemo1 {
    public static void main(String[] args) {
        int a = 3 ;
        Person p1 = new Person("李四",4,"CTO");
        Person p2 = new Person("王五",5,"CFO");

        StackHeapDemo1 demo1 = new StackHeapDemo1();
        demo1.changeNum(a); // 解释：将 a 的值9 复制一份，放到形参x中 ，方法执行完之后，形参x的内存回收。
        System.out.println(a);

        demo1.changeManager(p1); // 解释：将 p1的引用地址 复制一份，放到形参p中，方法执行完之后，形参p的内存回收。p1指向原对象不变。
        demo1.changePosition(p1);
        System.out.println(p1.getName()+"  "+p1.getPosition());
    }

    public void changeNum(int x){  // 方法的参数为基本类型，传递进去，并不改变原值
        x= 5;
    }

    public void changeManager(Person p){   // 方法的参数为引用类型，传递进去，并不改变原来引用的对象
        p = new Person("张三",3,"CEO");
    }
    public void changePosition(Person p){   // 方法的参数为引用类型，传递进去，并不改变原来引用的对象
        p.setPosition("ChaimMan");
    }
}
