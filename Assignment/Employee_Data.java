import java.util.Scanner;
import java.util.Vector;

class Work {
    private long day_Shift_Pay = 100000l;
    private long night_Shift_Pay = 150000l;
    private int extra_Per_Hour_Pay = 250;
    private int regular_Hours_Of_Working = 8;
    private long per_Hour_Night_Pay = night_Shift_Pay / regular_Hours_Of_Working;
    private long per_Hour_Day_Pay = day_Shift_Pay / regular_Hours_Of_Working;

    protected long getDay_Shift_Pay() {
        return day_Shift_Pay;
    }

    protected long getNight_Shift_Pay() {
        return night_Shift_Pay;
    }

    protected int getExtra_Per_Hour_Pay() {
        return extra_Per_Hour_Pay;
    }

    protected int getRegular_Hours_Of_Working() {
        return regular_Hours_Of_Working;
    }

    protected long getPer_Hour_Night_Pay() {
        return per_Hour_Night_Pay;
    }

    protected long getPer_Hour_Day_Pay() {
        return per_Hour_Day_Pay;
    }
}

class Employee extends Work {
    private String emp_Name;
    private int emp_Id;
    private String emp_Job_Role;
    private String emp_Shift;
    private int emp_Work_Hours;
    private int emp_Extra_Hours;

    public Employee(String emp_Name, int emp_Id, String emp_Job_Role, String emp_Shift, int emp_Work_Hours,
            int emp_Extra_Hours) {
        this.emp_Name = emp_Name;
        this.emp_Id = emp_Id;
        this.emp_Job_Role = emp_Job_Role;
        this.emp_Shift = emp_Shift;
        this.emp_Work_Hours = emp_Work_Hours;
        this.emp_Extra_Hours = emp_Extra_Hours;
    }

    public String getEmp_Name() {
        return emp_Name;
    }

    public int getEmp_Id() {
        return emp_Id;
    }

    public String getEmp_Job_Role() {
        return emp_Job_Role;
    }

    public String getEmp_Shift() {
        return emp_Shift;
    }

    public int getEmp_Work_Hours() {
        return emp_Work_Hours;
    }

    public int getEmp_Extra_Hours() {
        return emp_Extra_Hours;
    }

    public void getEmp_Payroll() {
        if (emp_Shift == "Day" || emp_Shift == "day") {

            if (emp_Work_Hours == getRegular_Hours_Of_Working())
                System.out.println("Employee Working " + emp_Work_Hours + "Hour Payroll: " + getDay_Shift_Pay());
            else {
                System.out.println("Employee Working " + emp_Work_Hours + "Hour Payroll: "
                        + emp_Extra_Hours * getPer_Hour_Day_Pay());
            }
            if (emp_Extra_Hours > 0) {
                System.out.println("Employee Extra Working " + emp_Work_Hours + "Hour Payroll: "
                        + getExtra_Per_Hour_Pay() * emp_Extra_Hours);
            }
        } else {

            if (emp_Work_Hours == getRegular_Hours_Of_Working())
                System.out.println("Employee Working " + emp_Work_Hours + "Hour Payroll: " + getDay_Shift_Pay());
            else {
                System.out.println("Employee Working " + emp_Work_Hours + "Hour Payroll: "
                        + emp_Work_Hours * getPer_Hour_Day_Pay());
            }
            if (emp_Extra_Hours > 0) {
                System.out.println("Employee Extra Working " + emp_Work_Hours + "Hour Payroll: "
                        + getExtra_Per_Hour_Pay() * emp_Extra_Hours);
            }
        }
    }
}

public class Employee_Data {
    public static void main(String[] args) {
        Vector<Employee> employees = new Vector<>();
        System.out.println("|| Welcome to Employee Management ||");
        System.out.println("Please Enter Employee Data.");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 2; i++) {
           
            // Employee Name
            System.out.println("Enter Employee Name: ");
            String emp_Name = sc.nextLine();

            // Employee ID
            System.out.println("Enter Employee EmpID: ");
            int emp_Id = Integer.parseInt(sc.nextLine()); // Correct usage

            // Employee Job Role
            System.out.println("Enter Employee JobRole: ");
            String emp_Job_Role = sc.nextLine();

            // Employee Shift
            System.out.println("Enter Employee Shift: ");
            String emp_Shift = sc.nextLine();

            // Employee Work Hours
            System.out.println("Enter Employee Working Hours: ");
            int emp_Work_Hours = Integer.parseInt(sc.nextLine());

            // Employee Extra Work Hours
            System.out.println("Enter Employee Extra Hours of Working: ");
            int emp_Extra_Hours = Integer.parseInt(sc.nextLine());
            employees.add(new Employee(emp_Name, emp_Id, emp_Job_Role, emp_Shift, emp_Work_Hours, emp_Extra_Hours));
            
        }
        sc.close();
        for (Employee emp : employees) {
            System.out.println("Employee Name: " + emp.getEmp_Name());
            System.out.println("Employee ID: " + emp.getEmp_Id());
            System.out.println("Employee Job_Role: " + emp.getEmp_Job_Role());
            System.out.println("Employee Shift: " + emp.getEmp_Shift());
            System.out.println("Employee Working Hours: " + emp.getEmp_Work_Hours());
            System.out.println("Employee Extra Hours: " + emp.getEmp_Extra_Hours());
            System.out.println("|| Employee PayRoll ||");
            emp.getEmp_Payroll();

        }
    }
}
