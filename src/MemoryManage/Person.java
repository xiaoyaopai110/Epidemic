package MemoryManage;

public class Person {
    private String name ;
    private long   id;
    private String position ;

    public Person(String name, long id,String position) {
        this.name = name;
        this.id = id;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }
}
