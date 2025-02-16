import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str = sc.next();
        String temp = "";
        for(int i = 0; i<str.length(); i++)
        {
            temp = str.charAt(i) + temp;
        }
        if(str.equals(temp)) System.out.println("Palindrome!");
        else System.out.println("Not a Palindrome!");
    }
}
