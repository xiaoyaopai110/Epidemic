package ArrayObject;
/*
*  演示数组中存放 父类和存放子类的关系
* */
public class Demo1 {

    public static void eat(Fish[] fishs){
        for(int i= 0;i<fishs.length;i++){
            System.out.println(fishs[i].toString());
        }
    }

    public static void main(String[] args) {
        Fish[] a = new Fish[3];
        a[0] = new Fish("zero");
        a[1] = new Fish("one");
        a[2] = new Fish("two");

        BigFish[] b = new BigFish[3];
        b[0] = new BigFish("bigzero");
        b[1] = new BigFish("bigone");
        b[2] = new BigFish("bigtwo");
        System.out.println("start*********************");
        eat(a);
        System.out.println("Second*********************");
        eat(b);
        System.out.println("end*********************");
    }
}
