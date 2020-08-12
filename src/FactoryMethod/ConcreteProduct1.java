package FactoryMethod;
class ConcreteProduct1 implements Product {

    ConcreteProduct1(){
        System.out.println("ConcreteProduct1 is being 生产");
    }
    public void show(){
        System.out.println("具体产品1显示...");
    }
}
