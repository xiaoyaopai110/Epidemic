public class Animal {

    static {
        System.out.println("静态代码块");
    }
    // 该方法是需要用 Animal.static_fn 的方法调用。
    public static void static_fn(){
        System.out.println(" 静态方法 ");
    }
    // 构造方法 不能有返回类型的定义
    public  Animal(){
        System.out.println("Animal was born");
    }
    public void action(){
        System.out.println("I can do");
    }
}
