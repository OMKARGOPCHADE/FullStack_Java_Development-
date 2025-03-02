import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Student implements Comparable<Student>{
    int age;
    String name;
    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }
    @Override
    public String toString() {
        return "Student [age=" + age + ", name=" + name + "]";
    }
    @Override
    public int compareTo(Student that) {
        
        if(this.age > that.age) return 1;
        return 0;
    }

}
public class Collection_Api {
    /*
     * --- Collection Api ---
     * It is inbuild librery in java through which we can use the inbuild data structures like arrayList, map, set, etc.
     * 
     */
    public static void main(String[] args) {
        // List<Integer> nums = new ArrayList<>();
        // nums.add(10);
        // nums.add(20);
        // System.out.println(nums);

        // List<String> nums = new ArrayList<>();
        // nums.add("omkar");
        // nums.add("gopchade");
        // System.out.println(nums);

        //set can'not have duplicate values.
        // Set<Integer> st = new HashSet<>();
        // st.add(10);
        // st.add(11);
        // st.add(10);
        // System.out.println(st); 

        // linkedset
        // Set<Integer> st = new LinkedHashSet();
        // st.add(10);
        // st.add(11);
        // st.add(10);
        // System.out.println(st);

        //treeset
        // Set<Integer> st = new TreeSet();
        // st.add(10);
        // st.add(11);
        // st.add(10);
        // System.out.println(st);

        //map key-value pair unsynchronized
        // Map<Character,Integer> hm = new HashMap<>();
        // hm.put('a', 97);
        // hm.put('b', 98);
        // hm.put('c', 99);
        // for(char key : hm.keySet())
        // {
        //     System.out.println(key + ": "+hm.get(key));
        // }

        //synchronized. hashtable both works same only difference is when u want to work with synchronized threads u can use hashtable
        // Map<Character,Integer> hm = new Hashtable<>();
        // hm.put('a', 97);
        // hm.put('b', 98);
        // hm.put('c', 99);
        // for(char key : hm.keySet())
        // {
        //     System.out.println(key + ": "+hm.get(key));
        // }


        // comparable vs comparator
        /*
         * if you want to specify the which logic u want to sort the elements u can use comparator.
         *  or if you want to give this hold to the class it'self u can use comparator.
         */

        // Comparator<Integer> com = new Comparator<Integer>() {
        //     public int compare(Integer i, Integer j)
        //     {
        //         if(i%10 > j%10) return 1;
        //         else return -1;
        //     }
        // };
        // List<Integer> nums = new ArrayList<>();
        // nums.add(20);
        // nums.add(30);
        // nums.add(10);
        // nums.add(50);
        // Collections.sort(nums,com);
        // System.out.println(nums);
        Comparator<Student> com = (i,j) -> i.age < j.age ? 1 : -1;
        List<Student> students = new ArrayList<>();
        students.add(new Student(19,"omkar"));
        students.add(new Student(26,"yash"));
        students.add(new Student(28,"sandesh"));
        students.add(new Student(22,"aditya"));
        Collections.sort(students,com);
        for(Student stud : students)
        {
            System.out.println(stud.toString());
        }
    }
}
