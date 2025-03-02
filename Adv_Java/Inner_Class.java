class A{

    static class B{
        public static void show1()
        {
            System.out.println("Inner class static method");
        }
        public void show()
        {
            System.out.println("Inner class!");
        }
    }
}
public class Inner_Class {
    /*
     * --- Inner Class ---
     * A inner class is a class which is created as a instance member of any other or outer class.
     * As a class can have instance members as variables and methods. that's how a class can have inner class as well.
     * inner class can be a static class also. but outer class can'not be static. 
     * Inner class is accessed through the object of the outer class. or if the inner class is static then it can be accesed through the outer class name as well.
     */
    public static void main(String[] args) {
        A obj = new A();
        // A.B obj1 = obj.new B();  // for instance member's only. 
        // as class B is static class it will through error.
        A.B obj1 = new A.B();
        //outer-class.innerclass = new outer --> inner class.
        obj1.show(); 
        A.B.show1();//static member calling with the help of class name. outer class -> inner class --> it's method.
    }
}
