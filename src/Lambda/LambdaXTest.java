package Lambda;

public class LambdaXTest {
    public static void main(String[] args) {
//        Lambda的基础语法
//        (): 用来描述参数列表
//        {}:用来描述方法体
//        ->： lambda 运算符，读作goes to
//        1、无参，无返回
        LambdaNoneReturnNoneParameter l1 = ()->{
            System.out.println("无参数，无返回值接口的实现");
        };
        l1.find();
//       2、无返回值，一个参数
        LambdaNoneReturnOneParameter l2 =(String name)->{
          System.out.println("一个参数，无返回值接口的实现："+name);
        };
        l2.find("张三");
//       3、无返回值，两个参数
        LambdaNoneReturnTwoParameter l3 = (String name ,int age)->{
            System.out.println("两个参数，无返回值接口的实现："+name+"  "+age);
        };
        l3.find("张三",18);

//       4、有返回值，无参数
        LambdaWithReturnNoneParameter l4 = ()->{
                System.out.println("无参数，有返回值接口的实现");
                String name = "张三";
            return name;
        };
        System.out.println(l4.find());


//       5、有返回值，一个参数
        LambdaWithReturnOneParameter l5 = (String name)->{
            System.out.println("一个参数，有返回值接口的实现");
                 return "我的名字是："+name;
        };
        System.out.println(l5.find("张三"));

//       6、有返回值，两个参数
        LambdaWithReturnTwoParameter l6 = (String name ,int age)->{
            System.out.println("两个参数，有返回值接口的实现");
            return "我的名字是："+name+" 年龄是："+age;
        };
        System.out.println(l6.find("张三",19));


    }
}

