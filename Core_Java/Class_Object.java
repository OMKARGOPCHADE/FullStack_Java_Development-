class Calculator{
    int a ;// class instance member variables.
    int b ;// class instance member variables.
    //The default access level for class members in Java is package-private, which means they are only accessible within the same package. This is the default when no access modifier is specified.
    public int add()//formal arguments
    {
        int sum = a + b; // sum is the local variable of the fn add.
        return sum;
    }
}
public class Class_Object {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();//object creation
        //this new keyword is operator in java which is used to create a object.
        c1.a = 10;
        c1.b = 20;
        System.out.println(c1.add());

    }
}
