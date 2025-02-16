abstract class Teacher{
    abstract public  void writing();
}
abstract class Student extends Teacher{
        // public void writing()
        // {    
        //     System.out.println("Hello Teacher abstract method!");
        // }
}
class Sub_Student extends Student{
    //The type Sub_Student must implement the inherited abstract method Teacher.writing()
    public void writing()
    {
        System.out.println("Inside Sub_Student!");
    }
}
public class Abstract {
    /*
     * --- Abstract ---
     * Abstract is keyword in java which is used to make a class abstract class or abstract method as well.
     * abstract is used when we have class in which some of method's are just has declration of it. not definantion. 
     * e.g a teacher class has method has writing method declration not defination. as teacher knows writing but they get it done by student right. i know it's weried example but just for understanding purpose its okay.
     * --- Rules of abstract --- 
     * 1. Normal class can'not have abstract methods.but a abstract class can have normal instance method's as well as abstract method's.
     * 2. abstract method's always belong's to abstract class.
     * 3. we can;not create abstract class object.
     * 4. whenver we want to use the abstract class we have to create concrete class. 
     * a concrete class is a sub-class which extends the abstract class always remember concrete class could not be the abstract class if u make it abstract then u have to make again new concrete class fot creating object to use the properties of all the associated abstract class.
     * 5. a sub-class of any abstract class has to make sure that it has all the method's definantion in it. of the parent class. if u want to do it then the subclass has to a abstract class again. 
     */
    public static void main(String[] args) {
        // Teacher t = new Teacher();Cannot instantiate the type Teacher(abstract class con'not have object of it).
        // Student st = new Student();//concrete class object.
        Sub_Student st = new Sub_Student();
        st.writing();
    }
}
