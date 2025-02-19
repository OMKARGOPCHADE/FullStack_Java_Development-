import java.util.ArrayList;
import java.util.LinkedList;
public class Array_Linkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        LinkedList<String> strings = new LinkedList<>();
        strings.add("Omkar");
        strings.add("Anand");
        strings.add("Datta");
        strings.add("null");
        strings.add("rushi");
        strings.add("Shree");
        strings.add("vaibhav");
        System.out.println(strings);
        strings.removeLast();
        System.out.println(strings);
        strings.remove(3);
        System.out.println(strings);
    }
}
