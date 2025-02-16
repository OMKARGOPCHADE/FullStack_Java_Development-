import java.util.Random;
import java.util.Scanner;

/**
 * Random_Number
 */
public class Random_Number {

    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome Number Gusseing Game Mr. John Doe!");
        int num = ran.nextInt(100);
        int attempts = 9;
        System.out.println("Enter Your Guess: ");
        int user_guess = sc.nextInt();
        while (attempts > 0 && user_guess != num) {
            if (user_guess > num) {
                System.out.println("Higher Then Number!");
                System.out.println("Oh You Have only " + attempts + " attempts left!");
                System.out.println("Guess Again: ");
                user_guess = sc.nextInt();
                if (user_guess == num)
                    System.out.println("Congratulations You Own Your Guess is Correct!");
            } else {
                System.out.println("Lesser Then Number!");
                System.out.println("Oh You Have only " + attempts + " attempts left!");
                System.out.println("Guess Again: ");
                if (user_guess == num)
                    System.out.println("Congratulations You Own Your Guess is Correct!");
                user_guess = sc.nextInt();
            }
            --attempts;
        }
        if(attempts <= 0) System.out.println("Oh You Have Used All Attempts You Lost!");
    }
}