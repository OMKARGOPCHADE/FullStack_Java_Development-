class Cal{
    /*
     * Method Overloading basically it is an concept of using same method name for different work like a user can add two number's also sometimes three number also.
     * so it simply means with same work behaviour can be change.
     * but u will say u can write different method for adding three numbers ya it can be done but what if we have multiple work like that then it's very difficult to remember the method name's right and also doing same work on different behaviour we have to use different method names. so it's better to use the same name with different behaviour so that user and developer both can understand easily.
     * method overloading is the concept of same method name whatever the return type but different arguments/parameters. it is called method overloading.
     */
    public int add(int a, int b)//method is used to add two integer number's
    {
        return a + b;
    }
    public double add(int a, double b)//method is used to add one integer and one double number.
    {
        return a + b;
    }
    public int add(int a, Integer b)//Integer is the wrapper class of the java.
    {
        return a + b;
    }
}
public class Method_Overloading {
    public static void main(String args[])
    {
        Cal c = new Cal();//new Cal() creation of the object. stored in heap memory.
        //here c is the reference to the object. stored in the stack memory.
        System.out.println(c.add(10,20));//calling first method of adding two integer's.
        // Autoboxing: While Java supports autoboxing (automatic conversion of primitive types to their corresponding wrapper classes), it prioritizes an exact match. Since a method with an int parameter exists, the compiler will choose that method directly instead of implicitly boxing the int value to Integer.
        System.out.println(c.add(10,20.23));//calling second method of adding one integer and one double.
    }
}
