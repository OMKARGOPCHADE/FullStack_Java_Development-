class Parent{
    public int add(int a, int b)
    {
        System.out.println("In Parent Class!");
        return a + b;
    }
}
class Child extends Parent{
    public int add(int a, int b)
    {
        System.out.println("In Child Class!");
        return a + b;
    }
}
public class Method_Overriding {
    /*
     * Method-Overriding means overriding the method name and method signiture in the subclass.
     * method overriding is also part of runtime polymorphism.
     * polymorphism --> poly(many) morphism(behaviour).
     * polymorphism has two types - 1. compiletime polymorphism and 2. runtime polymorphism.
     * compiletime is also known as early binding and runtime is late binding.
     * method-overloading is the part of compiletime polymorphism. 
     * as simple as it is ki we are using the same method for different work.
     * 
     * in every class when we do inheritance and in that if we do method-overriding that time every class object gives first priority too it's own method first.
     * it's all about dynamic method dispatch.
     */
    public static void main(String[] args) {
        Parent obj = new Parent();
        int r = obj.add(10, 20);
        System.out.println(r);
        obj = new Child();
        r = obj.add(20, 30);
        System.out.println(r);
    }
}
