import java.util.*;
import java.util.function.Consumer;

class Student{
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }
    
}
public class Stream {

    /*
     * --- Stream Api ---
     * Introduced in Java 8, Stream API is used to process collections of objects. A stream in Java is a sequence of objects that supports various methods that can be pipelined to produce the desired result. 
     * note:- any stream object can be usewd only once.
     * stream has various methods but some of them are important that we use mostly.
     * 1. filter --> filter's values according to condition.
     * 2. map --> mapping with every value whatever the logic is.
     * 3. reduce --> takes a start and do calculation according to given two variables.
     * 4. mapToint converts map to int
     * 5. forEach method --> used to work on every single value of given object.
     * 6. sorted --> sort the given object according to condtion.
     * etc.
     */
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        //forEach Implimentation
        // Consumer<Integer> cn = (n)-> System.out.println(n);
        // nums.forEach(cn);
        //nums.forEach(n -> System.out.println(n));
        // int result = nums.stream()
        //                 .filter(n->n%2==0)
        //                 .map(n->n*2)
        //                 .reduce(0, (c,e) -> c+e);
        // System.out.println(result);

        //Java Parallel Streams is a feature of Java 8 and higher, meant for utilizing multiple cores of the processor. Normally any java code has one stream of processing, where it is executed sequentially. Whereas by using parallel streams, we can divide the code into multiple streams that are executed in parallel on separate cores and the final result is the combination of the individual outcomes. The order of execution, however, is not under our control.
        // Random ran = new Random();
        // //normal stream
        // long startseq = System.currentTimeMillis();
        // for(int i = 0; i<100; i++)
        // {
        //     nums.add(ran.nextInt(100));
        // }
        // int sum = nums.stream().filter(n -> n % 2 == 1)
        //                 .map(n -> n).mapToInt(n -> n).sum();
        // long endseq = System.currentTimeMillis();
        // System.out.println(sum + " "+(endseq - startseq));
        // //parllel stream
        // long startpar = System.currentTimeMillis();
        // for(int i = 0; i<100; i++)
        // {
        //     nums.add(ran.nextInt(100));
        // }
        // int sum2 = nums.parallelStream().filter(n -> n % 2 == 1)
        //                 .map(n -> n).mapToInt(n -> n).sum();
        // long endpar = System.currentTimeMillis();
        // System.out.println(sum2 + " "+(endpar - startpar));

        // Optional Class
        //it is introduced in java 1.8 for avoiding the very famous problem called null pointer exception.
        //sometimes we try fetch value which may not present int that case we should use optional class when we not sure about the result.
        List<String> names = Arrays.asList("omkar", "ak", "sneha","laxmi");
        //first way
        Optional<String>st = names.stream()
                            .filter(name -> name.contains("kar")).findFirst();
                            // .orElse("Hello");
        System.out.println(st);
        //second way
        String ans = names.stream()
                            .filter(name -> name.contains("kar")).findFirst()
                            .orElse("Hello");
        System.out.println(ans);

        //method refernce 
        //it is used make work easy when we do same work multiple times with the same method then we should go for method reference.
        String ans2 = names.stream()
                            .map(String::toUpperCase).toString();
        System.out.println(ans2);
               //method refernce 
        //it is used make work easy when we do same work multiple times with the same method then we should go for method reference.

        //constructor reference
        // List<Student>students = new ArrayList<>();
        // students = names.stream().
        //                 map(name -> new Student(name)).
        //                 toList();
        List<Student>students = new ArrayList<>();
        students = names.stream().
                        map(Student::new).
                        toList();

    }
}