interface A {

    void showa();//by default public abstract.
    int num = 10; // by default final and static.
}
class B implements A{
//The type B must implement the inherited abstract method
// A.show() 

    public void showa()
    {
        System.out.println("Inside B Class showa");
    }
}
interface X {
    void showx();
}
interface Y extends X,A{
    void Yshow();
}
class C implements Y{
    public void showa(){
        System.out.println("Inside class c called showa");
    }
    public void showx(){
        System.out.println("Inside class c called show");
    }
    public void Yshow(){
        System.out.println("Inside class c called show");
    }
}
class D implements A, X{
    public void showa(){
        System.out.println("Inside class D called showa");
    }    
    public void showx()
    {
        System.out.println("Inside Class D called showx");
    }
}
public class Interface {
    /*
     * Interface is special type of class in a java. 
     * interface is also known as blue print of class.
     * Interfcace can be created with interface keyword.
     * by default interface every method inside interface is public abstract. wheather u declare with public abstract or not. it always been public abstract.
     * 
     * in interface by default every variable is static and final.
     * 
     * a class can implement a interface.
     * class --> interface (implements).
     * class --> class (extends).
     * interface --> interface(extends).
     *  a interface can have multiple interfaces as implemets just we ned to write interface name1, interface name2, and so on..
     * as java does'not supports multiple inheritance with the help of interface by implementating mulitple interfaces in single interface we can archive mulitple inheritance.
     * 
     * one class can also implements multiple interfaces. 
     * 
     * need of interface 
     * Interfaces in Java are used to achieve abstraction, multiple inheritance, and polymorphism. They also help to make code more flexible, maintainable, and scalable. 
     * 
     * --- Types of interface ---
     * 1. Normal Interface : A interface is normal if it has 2 or more abstract methods.
     * 2. Functional Interface or SAM(Single Abstract Method) : A interface is called as functional interface if it has singal abstract method.
     * 3. Marker Interface : A interface which has no method's. it is basically used for serilization and deserilization.
     * serilization and deserilization is something when we want some data that has to be saved in harddisk even after program execution completion. 
     */
    public static void main(String[] args) {
       // A.num = 10;//The final field A.num cannot be assigned
       System.out.println("As interface member's are by default static using is with interface name: "+A.num);
       A obj = new B();//upcasting
       obj.showa();
       Y obj1 = new C();
       obj1.Yshow();
       obj1.showa();
       obj1.showx();
       D obj3 = new D();
       obj3.showa();
       obj3.showx();
    }
}
