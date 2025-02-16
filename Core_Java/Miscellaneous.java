/**
 * Miscellaneous
 */
// final class A{
class A {
    // public final void show()
    private final int ac_no = 12;//cant' change!
    public void show() {
        System.out.println("In A Class");
    }
}

// class B extends A{ The type B cannot subclass the final class A
class B extends A {
    // public void show()Cannot override the final method from A
    public void show1() {
        System.out.println("In B Class");
    }
}

public class Miscellaneous {

    /*
     * ---Final Keyword---
     * final is keyword in java which is used to create final variables, method's ,
     * and classes.
     * when we write a final keyword with variable then we are making the variable
     * constant means once a variable is final then it could not get changed!
     * 
     * final method when we extend a class to any other class, and when we do method
     * overriding in that case if we want to stop overriding our method from
     * everyone even if someone inherits the properties of our class that time while
     * writting function defination just use final keyword at the start.
     * 
     * final class when we want no one can inherit our class then we can use final
     * for stopping someone to inherit our properties.
     * 
     * ---Object class---
     * every class in java has their parent class as object class by-default which
     * call's one method call toString() by-default. in object class there are
     * plenty of methods to use e.g toString(), equals(), etc.
     * when we want to check weather to object's equal or not that time we can use
     * this inbuild method equals.
     * also we can override the object class method's.
     * when try to obj it gives us class name along with hashcode which is genrated
     * by the object class for making the more secure, with the help of hex code
     * format.
     * 
     * --- upcasting - downcasting ---
     * when we want to use the parent class properties in child class with help of
     * help of upcasting we can do it.
     * how upcasting happens use the same object of child class just assign the
     * reference of child class.
     * there are two types--
     * 1. auto-boxing and boxing
     * doing manual casting is boxing and just creating reference is auto-boxing
     * 2. auto-un-boxing and un-boxing
     * doing manual casting is un-boxing and just creating reference is
     * auto-un-boxing.
     * 
     * ---wrapper classes---
     * as java is not 100% object oriented because of premitive data types e.g int
     * float, double, etc.
     * as everything entity in java inherits object class.
     * premitive data types not do that.
     * so java created feature of wrapper classes in which every premitive data type
     * has their respective wrapper class which helps to convert data one to another
     * form and also every wrapper class is bundled with plenty of method's which
     * makes life easy.
     */
    public static void main(String[] args) {
        A obj = new B();//upcasting
        obj.show();
        B obj1 = (B)obj;
        obj1.show1();//downcasting

        int num = 10;
        Integer n = num;//wrapper class
        String str = "10";
        num = Integer.parseInt(str);
    }
}