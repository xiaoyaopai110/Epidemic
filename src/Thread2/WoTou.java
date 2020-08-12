package Thread2;

public class WoTou {
    int id;
    String name ;
    WoTou(int id,String name) {
        this.id = id;
        this.name = name ;
    }
    public String toString() {
        return "WoTou - "+ name +":" + id ;
    }
}
