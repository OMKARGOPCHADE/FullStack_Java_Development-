class Person{
    private String name;
    private long Id;
    private int age;

    public void setName(String name)
    {
        this.name = name;
    }
    public void setId(long id)
    {
        this.Id = id;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public String getName()
    {
        return this.name;
    }
    public long getId()
    {
        return this.Id;
    }
    public int getAge()
    {
        return this.age;
    }
}
public class Person_As {
// The public static void main(String[] args) method in Java is the entry point for any Java program. The keyword public makes this method accessible from anywhere, ensuring the program can start executing from this point. static allows the method to be called without creating an instance of the class, making it easier to run the program directly. void indicates that the method doesn't return any value, and String[] args is an array that stores command-line arguments, allowing users to input data when they run the program. This setup is essential for Java programs to function correctly.
    public static void main(String args[])
    {
        Person obj = new Person();
        obj.setName("Omkar");
        obj.setId(643563544332L);
        obj.setAge(21);
        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getAge());
    }
}
