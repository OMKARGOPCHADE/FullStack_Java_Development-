interface Add{
    int disp(int a, int b);
}
public class Lambda {
    /*
     * --- Lambda Expression ---
     * For reducing the cost of memory or reducing the loc(lines of code) when we have small work to do then we should use lambda expression.
     * note:- lambda expression only work with functional interface.
     */
    public static void main(String[] args) {
        Add a = (i,j) -> i + j; // lambda expression.
        System.out.println(a.disp(10, 20));
    }
}
