
/**
 * List_Data
 */
// /This program demonstrates the use of wildcards refer following link for more info about wildcard. https://www.geeksforgeeks.org/wildcards-in-java/
// wildcard has three main types:
/*
 * 1. upper-bounded wildcard
 * 2. lower-bounded wildcard
 * 3. unbounded wildcard
 * wildcard character is denoted with ?
 * wildcard is concept of genrics in java 
 * which we can use when we want to work with diffrenet list by using single function.
 */
import java.util.List;
import java.util.Arrays;

public class List_Ex {
    public static void main(String[] args) {
        List<Number> lNumbers = Arrays.asList(10, 20, 30, 54, 50);
        System.out.println(sum(lNumbers));
        List<Double> dList = Arrays.asList(10.40, 50.60, 30.60);
        System.out.println(sum(dList));
        List<Integer> integers = Arrays.asList(1, 3, 4, 5, 6, 7, 8);
        printOnlyIntegerClassorSuperClass(integers);
        printlist(dList);
        printlist(integers);
        printlist(lNumbers);
    }

    // 1. upper-bounded wildcard
    public static Number sum(List<? extends Number> list) {
        Number number = 0;
        for (Number i : list) {
            number = number.intValue() + i.intValue();
        }
        return number;
    }

    /*
     * In the above program, list1 and list2 are objects of the List class. list1 is
     * a collection of Integer and list2 is a collection of Double. Both of them are
     * being passed to method sum which has a wildcard that extends Number. This
     * means that list being passed can be of any field or subclass of that field.
     * Here, Integer and Double are subclasses of class Number.
     */
    // 2. lower_bounded wildcard
    public static void printOnlyIntegerClassorSuperClass(
            List<? super Integer> list) {
        System.out.println(list);
    }
    /*
     * Here arguments can be Integer or superclass of Integer(which is Number). The
     * method printOnlyIntegerClassorSuperClass will only take Integer or its
     * superclass objects. However, if we pass a list of types Double then we will
     * get a compilation error. It is because only the Integer field or its
     * superclass can be passed. Double is not the superclass of Integer.
     */

    // 3. unbounded wildcard
    private static void printlist(List<?> list) {

        System.out.println(list);
    }
    /*
     * This wildcard type is specified using the wildcard character (?), for
     * example, List. This is called a list of unknown types. These are useful in
     * the following cases –
     * 
     * When writing a method that can be employed using functionality provided in
     * Object class.
     * When the code is using methods in the generic class that doesn’t depend on
     * the type parameter
     */
}
