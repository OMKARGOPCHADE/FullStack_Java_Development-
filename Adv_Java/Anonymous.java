class A{
    public void show()
    {
        System.out.println("Hello inside A");
    }
}
abstract class B
{
    public abstract void show1();
}
public class Anonymous {
    /*
     * --- Anonymous ---
     * it is the concept of creating a anonymous inner class where a class can create can have a block of code while object creation which is used only once so it's good to have that part as anonyomus class.
     * what if we have method which we want to be modified ya we have feature of method overriding but what if i say i need changes but i need that method only once. then is it make sence to make different class for that work no right so for that we concept called anonymous class. 
     * anonymous simply mean;s which has no name.
     * we can write the same method implimentation right after the class object creation whatever we wanna use once.
     * 
     * as normal method's we have inside anonymous class we can also have abstract method's implimenation inside the anonymous class.
     * 
     * note:- when u create a anonymous class it has no name but after compliation it is created in form a class right so that name is given in the form of 1 to n. mean's if class have 5 anonymous classes then their sequence always start from the 1 to n.
     * and the numbering is refered to the main class of the java program. 
     * e.g Anonymous$1 ... Anonymous$n.
     */
    public static void main(String args[])
    {
        A obj = new A(){
            public void show()
            {
                System.out.println("Inside Anonymous-Inner Class");
            }
        };
        obj.show();

        B obj1 = new B() {
            public void show1()
            {
                System.out.println("Inside Anonymous Class Abstract Method");
            }
        };
        obj1.show1();
    }
}
