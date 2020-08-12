package Lambda;

public class LambdaXtest2 {
    public static void main(String[] args) {
//        Lambda的简洁语法
//       a 因为在接口的抽象方法中，定义了参数类型，所以Lambda表达式中，参数类型可以省略。
//       b 如果参数列表只有一个参数，则小括号可以省略
//       c 如果方法体中，只有一条语句，则方法体的大括号可以省略
//       d 如果方法体中，唯一的语句是返回语句，则在省略大括号的同时，也同时省略return 语句。
        LambdaNoneReturnNoneParameter l1 = ()-> System.out.println("无参数，无返回值接口的实现");
        ;
        l1.find();
//       2、无返回值，一个参数
        LambdaNoneReturnOneParameter l2 =name-> System.out.println("一个参数，无返回值接口的实现："+name);

        l2.find("张三");
//       3、无返回值，两个参数
        LambdaNoneReturnTwoParameter l3 = ( name , age)->System.out.println("两个参数，无返回值接口的实现："+name+"  "+age);

        l3.find("张三",18);

//       4、有返回值，无参数
        LambdaWithReturnNoneParameter l4 = ()-> "无参数，有返回值接口的实现";
        System.out.println(l4.find());


//       5、有返回值，一个参数
        LambdaWithReturnOneParameter l5 = name-> "我的名字是："+name;

        System.out.println(l5.find("张三"));

//       6、有返回值，两个参数
        LambdaWithReturnTwoParameter l6 = ( name , age)-> "我的名字是："+name+" 年龄是："+age;

        System.out.println(l6.find("张三",19));

    }
}
