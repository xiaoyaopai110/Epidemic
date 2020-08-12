package ArrayObject;

import com.sun.org.apache.bcel.internal.generic.RET;

public class Fish {
    private String fish_name;
    Fish(String fish_name){
        this.fish_name = fish_name ;
    }

    @Override
    public String toString() {
        return this.fish_name;
    }
}
