
/**
 * Library
 */
import java.util.Vector;
import java.util.HashMap;
import java.util.Scanner;

class Student {
    int S_Roll;
    private String S_Name;
    private String S_Class;

    public Student(int s_Roll, String s_Name, String s_Class) {
        S_Roll = s_Roll;
        S_Name = s_Name;
        S_Class = s_Class;
    }

    public int getS_Roll() {
        return S_Roll;
    }

    public String getS_Name() {
        return S_Name;
    }

    public String getS_Class() {
        return S_Class;
    }


}

class Lb_Mgt {
    private Vector<String> Available_Books = new Vector<>(3, 2);
    private HashMap<String, Integer> Issued_Books = new HashMap<>();
    private Vector<Student> students = new Vector<>();

    public void getBooks() {
        for (String str : Available_Books) {
            System.out.println(str);
        }
    }

    public void addNewBook(String book) {
        this.Available_Books.add(book);
    }

    public void checkOutBook(String book, int s_roll) {
        if(this.Available_Books.contains(book))
        {
            this.Available_Books.remove(book);
            Issued_Books.put(book, s_roll);
            students.add(this.getStudDetails(s_roll));
        }
        else 
        {
            System.out.println("Book is Not Available!");
        }
        // System.out.println(students[i].toString());
    }

    public Student getStudDetails(int roll) {
        String name, sclass;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        name = sc.next();
        System.out.println("Enter Student Class: ");
        sclass = sc.next();
        return new Student(roll, name, sclass);
    }

    public void returnBook(String book, int s_Roll) {
        this.addNewBook(book);
        this.Issued_Books.remove(book);
        for(Student stud : students)
        {
            if(stud.S_Roll == s_Roll)
            {
                students.remove(stud);
            }
        }
    }

    public void checkIssuedBooks() {
        if (this.Issued_Books.isEmpty())
            System.out.println("No Books Issued!");
        else {
            Issued_Books.forEach((s, r) -> {
                for (Student stud : this.students) {
                    if(r == stud.S_Roll)
                    {
                        System.out.println("Issued Book: " + s);
                        System.out.println("Student Deatils");
                        System.out.println(stud.getS_Roll());
                        System.out.println(stud.getS_Name());
                        System.out.println(stud.getS_Class());
                    }

                }
            });
        }
    }
}

public class Library {

    public static void main(String[] args) {
        Lb_Mgt obj = new Lb_Mgt();
        obj.addNewBook("Java");
        obj.addNewBook("CPP");
        obj.addNewBook("C");
        obj.addNewBook("Python");
        System.out.println("Welcome to Library Management John Doe!");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.AddNewBook");
            System.out.println("2.View Available Books");
            System.out.println("3.Issue Book");
            System.out.println("4. CheckIn Book");
            System.out.println("5. Check Issued Books");
            System.out.println("6.Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    String str;
                    System.out.println("Enter Book Name: ");
                    str = sc.next();
                    obj.addNewBook(str);
                    break;
                case 2:
                    obj.getBooks();
                    break;
                case 3:
                    System.out.println("Enter Book Name: ");
                    str = sc.next();
                    int roll;
                    System.out.println("Enter student roll no. ");
                    roll = sc.nextInt();
                    obj.checkOutBook(str, roll);
                    break;
                case 4:
                    System.out.println("Enter Book Name: ");
                    str = sc.next();
                    System.out.println("Enter student roll no. ");
                    roll = sc.nextInt();
                    obj.returnBook(str, roll);
                    break;
                case 5:
                    obj.checkIssuedBooks();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
        }
    }
}