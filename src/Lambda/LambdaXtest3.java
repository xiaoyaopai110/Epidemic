package Lambda;

import java.util.ArrayList;
import java.util.Comparator;
public class LambdaXtest3 {
    public static void main(String[] args) {
//        将列表中的学生，按照年龄排序
        ArrayList<Student> list = new ArrayList();
        list.add(new Student("张三1",12));
        list.add(new Student("张三2",13));
        list.add(new Student("张三3",14));
        list.add(new Student("张三4",15));
        list.add(new Student("张三5",16));
        list.add(new Student("张三6",17));
        list.add(new Student("张三7",18));
        list.add(new Student("张三8",19));
        // 原始写法
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getAge()-o1.getAge();
            }
        });
        // lambda 表达式,实现了Comparator接口的compare方法。
        list.sort((o1,o2)->o2.getAge()-o1.getAge());
        System.out.println(list);
    }
}
