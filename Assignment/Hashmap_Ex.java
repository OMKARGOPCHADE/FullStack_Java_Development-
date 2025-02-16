import java.util.HashMap;
import java.util.Scanner;
class Student{
    private int roll;
    private String name;
    private int age;
    private char grade;
    public Student(int roll, String name, int age, char grade) {
        this.roll = roll;
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    public int getRoll() {
        return roll;
    }
    public void setRoll(int roll) {
        this.roll = roll;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public char getGrade() {
        return grade;
    }
    public void setGrade(char grade) {
        this.grade = grade;
    }

}
class Handle_Student 
{

    public Student add(int roll)
    {   Scanner sc = new Scanner(System.in); 
         String name;
         System.out.println("Enter Student Name: ");
         name = sc.nextLine();
         int age;
         System.out.println("Enter Student Age: ");
         age = Integer.parseInt(sc.nextLine());
         char grade;
        System.out.println("Enter Student Grade: ");
        grade = sc.nextLine().charAt(0);
        //sc.close();
       return new Student(roll, name, age, grade);
    }
    public void update(Student student)
    {
        Scanner sc = new Scanner(System.in); 
        String name;
        System.out.println("Enter Student Name: ");
        name = sc.nextLine();
        int age;
        System.out.println("Enter Student Age: ");
        age = Integer.parseInt(sc.nextLine());
        char grade;
       System.out.println("Enter Student Grade: ");
       grade = sc.nextLine().charAt(0);
       student.setName(name);
       student.setAge(age);
       student.setGrade(grade);
    }
    public void remove()
    {
        System.out.println("Student Recored Deleted Successfully...");
    }
    public void display(Student student)
    {
        System.out.println("Student Roll: "+student.getRoll());
        System.out.println("Student Name: "+student.getName());
        System.out.println("Student Age: "+student.getAge());
        System.out.println("Student Grade: "+student.getGrade());
    }
}
public class Hashmap_Ex {
    public static void main(String args[]) throws Exception
    {
        HashMap<Integer,Student> hm = new HashMap<>();
        Handle_Student handle_Student = new Handle_Student();
        Scanner sc = new Scanner(System.in); 
        while (true) {
            System.out.println("|| Welcome to Student Management ||");
            System.out.println("1. Add Student");
            System.out.println("2. Update Student");
            System.out.println("3. Delete Student");
            System.out.println("4. Display Student");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.println("Enter Your Choice: ");
            int n = Integer.parseInt(sc.nextLine());
            switch (n) {
                case 1:
                    int roll;
                    System.out.println("Please Enter Student RollNo: ");
                    roll = Integer.parseInt(sc.nextLine());
                    if(hm.containsKey(roll))
                    {
                        System.out.println("Warnining: Student Record Already Exist!");
                    }
                    else
                    {
                        hm.put(roll, handle_Student.add(roll));
                        System.out.println("Student Record Added Successfully!");
                    }
                    break;
                    case 2:
                    System.out.println("Please Enter Student RollNo: ");
                    roll = Integer.parseInt(sc.nextLine());
                    if(!hm.containsKey(roll))
                    {
                        System.out.println("Warnining: Student Record Not Exist!");
                    }
                    else
                    {
                        handle_Student.update(hm.get(roll));
                        System.out.println("Student Details Updated!");
                    }
                    break;
                    case 3:
                    System.out.println("Please Enter Student RollNo: ");
                    roll = Integer.parseInt(sc.nextLine());
                    if(!hm.containsKey(roll))
                    {
                        System.out.println("Warnining: Student Record Not Exist!");
                    }
                    else
                    {
                        hm.remove(roll);
                        handle_Student.remove();
                    }
                    break;
                    case 4:
                    System.out.println("Please Enter Student RollNo: ");
                    roll = Integer.parseInt(sc.nextLine());
                    if(!hm.containsKey(roll))
                    {
                        System.out.println("Warnining: Student Record Not Exist!");
                    }
                    else
                    {
                        handle_Student.display(hm.get(roll));
                    }
                    break;
                    case 5:
                    hm.forEach((rl,Student)->handle_Student.display(Student));
                    break;
                    case 6:
                    System.out.println("Thank You...");
                    System.exit(0);
                    break;
                default:
                System.out.println("Enter Valid Option!");
                    break;
            }
           
        }
    }
}
