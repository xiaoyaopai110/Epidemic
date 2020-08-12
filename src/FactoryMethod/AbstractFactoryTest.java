package FactoryMethod;

public class AbstractFactoryTest {
    public static void main(String[] args)
    {
         AbstractFactory factory = new ConcreteFactory1();
         // Product a;
        Product p = factory.newProduct();
        p.show();
    }
}
