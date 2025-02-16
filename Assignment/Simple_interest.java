import java.util.Scanner;
public class Simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Principle Amount: ");
        int principle_amt = sc.nextInt();
        System.out.println("Enter Intrest Rate: ");
        int intrest_rate = sc.nextInt();
        System.out.println("Enter Time Period: ");
        int time_period = sc.nextInt();
        int ans = (principle_amt * intrest_rate * time_period ) / 100;
        System.out.println(ans);
    }
}
