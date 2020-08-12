package Reflect;

public class ReflectDemo1 {

    public static void  main(String[] args){
        /**
         * 获取类对象的方法
         */
        try {
            Class cl1 = Class.forName("Reflect.Student"); // 通过类全名获取
            System.out.println(cl1.toString());
        }catch(Exception e){
            System.out.println(e.toString());
        }
        Class cl2 = Student.class;   // 通过类名获取
        Student stu = new Student("zhangsan",1);
        Class cl3 = stu.getClass();   // 通过对象获取
        System.out.println(cl3==cl2);
    }
}
