// package Assignment;
import java.util.Scanner;
class Calc{
    private int num1,num2;

    public Calc(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add()
    {
        return this.num1 + this.num2;
    }
    public int sub()
    {
        return this.num1 - this.num2;
    }
    public int div()
    {
        int result = 0;
        try{
            result = this.num1 / this.num2;
        }
        catch(Exception e)
        {
            System.out.println("Exception occured: "+e.getMessage());
        }
        return result;
    }
    public int multi()
    {
        return this.num1 * this.num2;
    }
    
}
public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Calculator John Doe!");
        System.out.println("1.Addition ");
        System.out.println("2.Substraction ");
        System.out.println("3.Multiplication ");
        System.out.println("4.Divison ");
        System.out.println("Enter Your Choice: ");
        int choice = sc.nextInt();
        System.out.println("Please Enter Two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        Calc obj = new Calc(num1,num2);
        switch (choice) {
            case 1:
            System.out.println(obj.add());
                break;
            case 2:
            System.out.println(obj.sub());
                break;
            case 3:
            System.out.println(obj.multi());
                break;
            case 4:
            System.out.println(obj.div());
                break;
        
            default:
            System.out.println("Invalid Choice!");
                break;
        }
    }
    
}
