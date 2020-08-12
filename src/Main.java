import java.util.Arrays;

public class Main {
    static int i ;
    public static void main(String[] args) {
        // if 判断
        int i = 8 ;
        if(i>3){
            System.out.println("大于3");
        }else {
            System.out.println("小于等于3");
        }
        // switch 判断
        switch(i)
        {
            case 3 :
            {
                System.out.println("3");
                break;
            }
            case 8 :
            {
                System.out.println("8");
                break;
            }
            default:
            {
                System.out.println("见鬼了");
            }
        }
        // 数组
        System.out.println("数组 start …… ");
        int[] ages =new int[10];
        for (int k = 0; k<ages.length; k++){
            ages[k]= k;
            System.out.println(ages[k]);
        }
        // 数组工具
        Arrays.toString(ages);

    }
}
