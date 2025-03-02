import java.util.List;
import java.util.Scanner;

class Students {
    int roll;
    String name;
}

public class Arrays {
    public static void main(String args[]) {
        // int a[] = new int[5];//single dimensional array.
        // for(int i = 0; i<5; i++)
        // {
        // a[i] = i+1;
        // }
        // for(int i : a)//Enhanced For Loop
        // {
        // System.out.print(i + " ");
        // }
        // int arr[][] = new int[3][4];//multi dimensional array.
        // for(int i = 0; i<3; i++)
        // {
        // for(int j = 0; j<4; j++)
        // {
        // arr[i][j] = (int)(Math.random()*100);
        // }
        // }
        // for(int ar[]:arr)
        // {
        // for(int j : ar)
        // {
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        /*
         * what is jagged array?
         * yeah it's type of array in which we can create a multidimensional array with
         * different types of size.
         * e.g.
         * we have 2-dimensional array.
         * for college like enviornment.
         * int college[branches][students] = new int[5][]
         * suppose we have five branches in the college but we don't know the exact
         * count of n. of branches and no. of students.
         * so that purpose we can use jagged array.
         * 
         * by default integer array values before initilization are 0's.
         */
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[2][];// jagged array.
        // arr[0]= new int[2];
        // arr[1]= new int[1];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter no. of students u have in branch" + i);
            int num = Integer.parseInt(sc.next());
            // Integer.parseInt() method is used to convert a number from string to int.
            arr[i] = new int[num];
            for (int j = 0; j < num; j++) {
                arr[i][j] = j + 1;
            }
        }

        for (int n[] : arr) {
            for (int i : n) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        Students stud1 = new Students();
        stud1.roll = 19;
        stud1.name = "omkar";
        Students stud2 = new Students();
        stud2.name = "Prathmesh";
        stud2.roll = 20;
        // array of objects
        Students Stud_arr[] = new Students[2];
        Stud_arr[0] = stud1;        
        Stud_arr[1] = stud2;        
        // Enhanced for-loop or for each loop
        for(Students stud : Stud_arr)
        {
            System.out.println("Student Name: "+stud.name+" Roll_No: "+stud.roll);
        }
    }
    // in java array is also called as object.
    // drawbacks of array
    // 1. size can'not modify once decalred array.
    // 2. type of values stores only homogeneous data.

    public static List<Integer> asList(int i, int j, int k, int l, int m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }

    public static List<Integer> asList(int i, int j, int k, int l, int m) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }

    public static List<String> asList(String string, String string2, String string3, String string4) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'asList'");
    }

}
