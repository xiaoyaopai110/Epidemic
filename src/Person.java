public class Person {
    private int age;
    private String name;
    public Person(String name ,int age ){
        this.age = age;
        this.name = name;
    }


    public void Show(){
        System.out.println("Hello ,my name is: "+this.name+" my age is: "+this.age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
