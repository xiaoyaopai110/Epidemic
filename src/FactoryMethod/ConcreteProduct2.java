package FactoryMethod;

 class ConcreteProduct2 implements Product{

     ConcreteProduct2(){
         System.out.println("ConcreteProduct2 is being 生产");
     }
     public void show(){
         System.out.println("具体产品2显示...");
     }
}
