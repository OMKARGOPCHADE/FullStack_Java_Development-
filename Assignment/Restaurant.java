import java.util.HashMap;
import java.util.Scanner;

public class Restaurant {
    public static void main(String[] args) {
        HashMap<String, Integer> menu = new HashMap<>();
        menu.put("Dal Khichdi", 55);
        menu.put("Veg Thali", 80);
        menu.put("Misal Pav", 75);
        menu.put("Pav Bhaji", 90);
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("|| Welcome to Omkar Resto|| ");
            System.out.println("1. AddNew Dish");
            System.out.println("2. Update Price");
            System.out.println("3. Display Menu");
            System.out.println("4. Reomve Dish");
            System.out.println("5. Exit");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
                case 1:
                    System.out.println("Enter Dish Name: ");
                    String dname = sc.nextLine();
                    System.out.println("Enter Dish Price: ");
                    int price = Integer.parseInt(sc.nextLine());
                    menu.put(dname, price);
                    System.out.println("Dish Added to menu..");
                    break;
                case 2:
                    System.out.println("Enter Dish Name: ");
                    dname = sc.nextLine();
                    if (menu.containsKey(dname)) {
                        System.out.println("Enter Dish Price: ");
                        price = Integer.parseInt(sc.nextLine());
                        menu.put(dname, price);
                        System.out.println("Dish Data Updated..");
                    } else {
                        System.out.println("Warning: Dish not present!");
                    }
                    break;
                case 3:
                    if (menu.isEmpty()) {
                        System.out.println("Menu is Empty!");
                    } else {
                        menu.forEach((s, p) -> {
                            System.out.println("Dish Name: " + s + "| Price: " + p);
                        });
                        break;
                    }
                    case 4:
                    System.out.println("Enter Dish Name: ");
                    dname = sc.nextLine();
                    if (menu.containsKey(dname)) {
                        menu.remove(dname);
                        System.out.println("Dish Deleted..");
                    } else {
                        System.out.println("Warning: Dish not present!");
                    }
                    break;
                    case 5:
                    System.out.println("Thank You!!");
                    System.exit(0);
                    break;
                default:
                System.out.println("Invalid Option");
                    break;
            }
        }
    }
}
