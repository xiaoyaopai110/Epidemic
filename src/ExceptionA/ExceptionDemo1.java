package ExceptionA;

import java.io.FileNotFoundException;
import java.io.IOException;
/*
*   异常演示：
*   异常类关系图。
* */
public class ExceptionDemo1 {

    public void a() throws FileNotFoundException {
        throw new FileNotFoundException("没有找到文件");
    }
    public static void main(String[] args) {
        ExceptionDemo1 exceptionDemo1 = new ExceptionDemo1();
        try {
            exceptionDemo1.a();
        }catch (FileNotFoundException a){  // 第一个catch 捕获到异常，后面的catch 语句，则不再执行。
            System.out.println("file not found");
            a.printStackTrace();
        }catch (IOException a){
            System.out.println("io");
            a.printStackTrace();
        }finally { //   finally :  无论是否捕获到异常，该部分代码都会执行。
                   //   常用场景：  清理临时文件，关闭打开没有关闭的文件等。
            System.out.println("hhh");
        }
    }
}
