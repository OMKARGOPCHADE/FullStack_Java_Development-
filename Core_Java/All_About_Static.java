class Static_Data{
    int ac_bal;
    int mo_no;
   static int ac_no = 1212344;
   static String ifc_code = "MH12132";    
    static{
            ac_no = 1212344;
            ifc_code = "MH12132";
            System.out.println("Class loaded");
    }
    //static block
    Static_Data(int ac_bal, int mo_no)
    {
        this.ac_bal = ac_bal;
        this.mo_no = mo_no;
       
    }
    void show_data()
    {
        System.out.println("Account No: "+ac_no);
        System.out.println("Account Bal: "+ac_bal);
        System.out.println("Mobile No: "+mo_no);
        System.out.println("ifc code: "+ifc_code);
    }
    static void show_static_data()
    {
        System.out.println("Account No: "+ac_no);        
        System.out.println("ifc code: "+ifc_code);        
    }
}
public class All_About_Static {
    /*
     * Static is keyword in java.
     * Static Variables.
     * 1. When a Static Variable is created that variable remain's same throughout the program.
     * 2. When we have any constant value which won't be get modified fruther or which don't want to re-initilize again n again then we have to use static variable.
     * 3. Static varibales values remains's same every object that u create with the same class name.
     * 4. Static variables get loaded into memory when ClassLoader of the jvm loads the class into a memory. not like instance member varibles which get loaded only after object creation.
     * 5. If we want to initilize static member's once at a time then we can use static block which will get loaded into the class only once after ClassLoader loads the class. so that we can have our all static member's loaded in the memory.
     * 6. static member's can be accesed by both the method's non-static as well as static methods.
     * 
     * Static Mehtod's.
     * 1. static methods are created with the help of static keyword.
     * 2. static method's can be accesed through class name as well as object of the class. but it's better to use class name to avoid the misscounseption of reading. because static methods can be accsed without object creation and also it hold's only static data which remains same for all the objects, so it doesn't matter u call it with object or class name.
     * 3. static method can access only static member variables of the class. as it can be called via classname also so it becomes difficult do understand which instance member's to be used because instance member's varies different for every object. but not static member's.
     * 4. although we can use it explicitly by passing object via method while calling static method, so that jvm can understand which non-static(instance member's) should be accesed.
     * 
     * Why Main method is static ?
     * just because main method is the entry point of the program and also it remain's same throught out the program execution.
     * and it does'not need object creation so when classloader loads main method into the stack jvm automatically calls the main method which includes execution of the program.
     * 
     * What if we want to load class explictly without object creation?
     * with the help of Class.forName() method which takes className as parameter and load's the class into the heap memory.
     * it also thorows an exception of classNotFound exception.
     * 
     * note:- non-static method can access non-static as well as static member's. but static method can'not access non-static member's.
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // Static_Data st = new Static_Data(12122,44555);
        // st.show_data();
        Class.forName("Static_Data");
        // Static_Data.show_static_data();
    }
}
