public class String_Builder_Buffer {
    /*
     * String is Immutable --> once created can not be changed.
     * StringBuilder Mutable--> changing possible.
     * StringBuffer Mutable --> changing possible
     * 
     * String is used when we want immutuablity.
     * String Builder is used when thread safety is not required.
     * String Buffer is used when thread safety is required.
     * 
     * String is thread safe.
     * StringBuilder is not thread safe.
     * StringBuffer is thraed safe.
     * 
     * String is class in java not a premitive data type like other's. e.g int,float,etc.
     * When any String object is created that takes place in heap memory.
     * and that memory reference is the variable(object) which we have created.
     * when we concat something with String object that time orignal string is not get changed it simply created new String object in heap with the new data and refernce to that is returend.
     * and later on when we are not using the firstly created object that automatically get collected by garbage collector to destory that String to make space in memory.
     * 
     * StringBuilder and StringBuffer has initial capacity of 16 bytes.
     * whenever new element added it automatically regenrate or allocate memory of 16 bytes again.
     * e.g new string = omkar -->5 len so capacity will become 21
     */

     public static void concat(String s1)
     {
        s1 = s1 + "gopchade";
     }
     public static void concat(StringBuilder s2)
     {
        s2.append("Gopchade");
     }
     public static void concat(StringBuffer s2)
     {
        s2.append("Gopchade");
     }
    public static void main(String []args)
    {
        String name = "omkar";
        concat(name);
        System.out.println(name);
        StringBuilder name2 = new StringBuilder();
        System.out.println(name2.capacity());
        name2.append("Omkar ");
        concat(name2);
        System.out.println(name2.capacity());
        System.out.println(name2);
        StringBuffer name3 = new StringBuffer("Omkar ");
        concat(name3);
        System.out.println(name3.capacity());
        System.out.println(name3);
    }
}
