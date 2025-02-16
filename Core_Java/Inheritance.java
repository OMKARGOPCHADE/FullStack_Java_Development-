/*
 * What is Inheritance?
 * Inheritance means we are inheriting the properties of the parent class to child class or super class to sub class or base class derived class.
 * Inheritance helps us to maintain the code resuablity, means we can use the same code (class properties) by just inheriting the properties to the class.
 * 
 * Types of Inheritance?
 * 1. Single-Level Inheritance
 * 2. Multi-Level Inheritance
 * 3. Multiple Inheritance which java does not support because of ambiguity problem ya there is way to do it with Interface.
 * 
 * Every class in java has by default one parent class that is object class.
 * Every class constructor has super() method by default which calls the parent class constructor. by default if u don't mention then it simply calls the default constructor of the parent class.
 * Every class also has this() method which is used to call the same class constructor as earlier we seen that this helps us to refer the current class object. same this() method holds the reference of current class with the help of that we can call constructor of the same class wheather it is default or parameterized constructor. we can use this when we want both the constructor get excute.
 * 
 * Hirerchy of calling super()
 * suppose we have class A and class B and we are inheriting the properties of the A to B. so when we create constructor of class B() it will first check which type of constructor ur calling so the excution start from that constructor in which it will call first the parent class constructor if u don't mention which one to call it will directly call the default one.
 * 
 * Note:- Always remember constructor call be the first statement in any class.
 * 
 * Access Modifiers.
 * 1.Public --> Allows every class t use the properties, weather it is from same class , same package or not.
 * 2. Protected --> Allows same class, same package non-subclass and inherited class from same package, or different package. but it not allows to other package non-subclass.
 * 3. private --> only the same class.
 * 4. Default--> allows to same class , same package sub class or non-subclass.
 */

//  single level inheritance
class A{
    public A()
    {
        System.out.println("In class A");
    }
    public A(int n)
    {
        System.out.println("In A int");
    }
}
class B extends A{
    public B()
    {
        super(10);
        System.out.println("In Class B");
    }
    public B(int n)
    {
        this();
        System.out.println("In B int");
    }
}
public class Inheritance {
    public static void main(String[] args) {
        B obj = new B(5);
    }
}