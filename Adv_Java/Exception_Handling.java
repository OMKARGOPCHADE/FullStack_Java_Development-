import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

class Own_Exception extends Exception{
    public Own_Exception(){}
    public Own_Exception(String str)
    {
        super(str);
    }
    // public void show_exception() throws ArithmeticException
    // {
    //     int a = 10 / 0;
    // }
}
public class Exception_Handling {
    /*
     * --- Exception Handling ---
     * In any program there are three types of error's are present.
     * 1. compile-time-error
     * 2. logical-error
     * 3. runtime-error
     * runtime error is known as exception in the program.
     * by being an good programmer which could be managed before occured if there
     * are certain chanceses of error's occurence. this process is known as
     * exception handling.
     * --- types of exception ---
     * checked exception vs unchecked exception
     * Checked Exception: These exceptions are checked at compile time, forcing the
     * programmer to handle them explicitly. e.g Sql exception, IO exception.
     * Unchecked Exception: These exceptions are checked at runtime and do not
     * require explicit handling at compile time. e.g arrayIndexOutOfBoundException.
     * 
     * every exception has Exception as their parent class.
     * we can handle exception with the help of try-catch block.
     * try can'not be written without catch. catch also can'not written without try block.
     * try should contain the code in which there are chances of excpetion occurence.
     * catch should contain code through which could be handled.
     * a try block can have multiple catch block's.
     * we can also throw our own exception with the help of 'throw new' exception.
     * by creating class of that name which extends exception as parent class.
     * if any method includes exceptions and method want's it could handled by the method calling it.
     * there throws keyword is used to handle it.
     * 
     * a try block can also end with finally block as well as single try can also work.
     * single try is used a try with resources.
     * whenever we want to close some connection's or reading inputs that time we can use finally block which always get's excutes weather exception occur or not.
     * or-else if we have single line of closing then we can also go with try-with-resources.
     */
    public static void main(String[] args) throws IOException {
        // int z = 20;
        // try{
        //     z = z / 0;
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }

        //custom(userdefined) exception
        // divide by 1 just for example.
        // try{
        //     if(z/1 == z)
        //     {
        //         throw new Own_Exception("Divide by 1");
        //     }
        // }
        // catch(Exception e)
        // {
        //     System.out.println(e.getMessage());
        // }

        //throws 
        /*
         * Following function thows an exception altough we can leave it on main function as it calling the function show_exception() by the help of throws but this is not good move because main method is called by jvm. so jvm will say hey it's not my job i will stop the excecution. it's ur responsibility to handle it so better to use try-catch.
         */
        // Own_Exception ex = new Own_Exception();
        // ex.show_exception();


        /*
         * For reading input in java now days we use Scanner object class.
         * but before scanner class everyone uses another takenic if taking input and that is,
         * InputStreamReader in = new InpuStreamReader(System.in);
         * BufferReader rd = new BufferReader(in);
         * this rd.readLine() method return's input in string form.
         * and these too lines throws ioexception and numberformatexception.
         */
        //with finally.
         BufferedReader rd = null;
         try{
            InputStreamReader in = new InputStreamReader(System.in);
                 rd = new BufferedReader(in);
            int num = Integer.parseInt(rd.readLine());
            System.out.println(num);
         }
         catch(Exception e)
         {
            System.out.println(e.getMessage());
         }
         finally{
            rd.close();
         }
         //with try-with-resources.
         try(BufferedReader bd = new BufferedReader(new InputStreamReader(System.in)))
         {
            String str = bd.readLine();
            System.out.println(str);
         }
    }
}
