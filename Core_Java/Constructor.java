//To create a copy constructor, we can first declare a constructor that takes an object of the same type as a parameter:
 class Employee {
    private int id;
    private String name;
  
    public Employee(Employee employee) {//copy constructor
        this.id = employee.id;
        this.name = employee.name;
    }
    public Employee(int id, String name)//parameterized constructor
    {
        this.id = id;
        this.name = name;
    }
    public Employee()//default constructor
    {
        id = 10;
        name = "abc";
    }
    public void getData()
    {
        System.out.println("Id: "+this.id +" Name: "+this.name);
    }
}
public class Constructor {
    /*
     * Constructor is the special method of class which is automatically invoked at
     * the time of the object creation.
     * Constructor has no return type it is written as same as class name.
     * constructor is basically used to initilize instance member variables.
     * ---Types of constructor---
     * 1. Default constructor --> default constructor is constructor which has no
     * parameter's.
     * 2. Parametrized constructor --> parameterized constructor is one of
     * constructor in which user can share values while object creation.
     * 3. Copy constructor -->A copy constructor in a Java class is a constructor
     * that creates an object using another object of the same Java class.
     * 
     * That’s helpful when we want to copy a complex object that has several fields,
     * or when we want to make a deep copy of an existing object.
     * 
     * Naming Convention--
     * it is just the type of writing class name, variable name, object name, etc.
     */
    public static void main(String[] args) {
        System.out.println("Default Constructor");
        new Employee().getData();//Anonymous object
        /*
         * Anonymous object are those object which can be created without assigning reference to that object for fruther modification.
         * 
         * Anonymous object can be used only once as it has no reference to refer.
         */
        Employee obj1 = new Employee(12,"pqr");
        System.out.println("Parameterized Constructor");
        obj1.getData();
        System.out.println("Copy Constructor");
        new Employee(obj1).getData();
    }
}
