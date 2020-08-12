/*
  单实例模式-饿汉式
 */
public class Hungary {
    private static Hungary ourInstance = new Hungary();

    public static Hungary getInstance() {
        return ourInstance;
    }
    private Hungary() {
        System.out.println("饿汉式");
    }
    public void Show(){
        System.out.println("单实例秀肌肉");
    }


}
