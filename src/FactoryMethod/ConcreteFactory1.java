package FactoryMethod;

public class ConcreteFactory1 implements AbstractFactory{


    public Product newProduct(){
        System.out.println("工厂生产产品：");
        return new ConcreteProduct1();
    }
}
