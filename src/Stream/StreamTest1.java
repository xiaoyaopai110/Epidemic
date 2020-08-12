package Stream;
/*
    Java 8 API添加了一个新的抽象称为流Stream，可以让你以一种声明的方式处理数据。
    Stream 使用一种类似用 SQL 语句从数据库查询数据的直观方式来提供一种对 Java 集合运算和表达的高阶抽象。
    Stream API可以极大提高Java程序员的生产力，让程序员写出高效率、干净、简洁的代码。
    这种风格将要处理的元素集合看作一种流， 流在管道中传输， 并且可以在管道的节点上进行处理， 比如筛选， 排序，聚合等。
    元素流在管道中经过中间操作（intermediate operation）的处理，最后由最终操作(terminal operation)得到前面处理的结果。
    +--------------------+       +------+   +------+   +---+   +-------+
    | stream of elements +-----> |filter+-> |sorted+-> |map+-> |collect|
    +--------------------+       +------+   +------+   +---+   +-------+
    参考： https://www.runoob.com/java/java8-streams.html
    视频参考：https://www.bilibili.com/video/av78795761?p=6
*/

import Lambda.Student;

import java.util.ArrayList;
import  java.util.stream.*;

public class StreamTest1 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList();
        list.add(new Student("张三1",12));
        list.add(new Student("张三2",13));
        list.add(new Student("张三3",14));
        list.add(new Student("张三4",15));
        list.add(new Student("张三5",16));
        list.add(new Student("张三6",17));
        list.add(new Student("张三7",18));
        list.add(new Student("张三8",19));
        list.add(new Student("张三8",19));

//        使用Stream的步骤
//        1、创建Stream
         Stream<Student> stuStream = list.stream();
//        2、中间操作过滤
//        stuStream.filter(e->e.getAge()>16).forEach(e-> System.out.println(e.toString()));
//        3、中间操作，去重,该部分去重没有成功。
        stuStream.distinct().forEach(e-> System.out.println(e.toString()));

    }
}
