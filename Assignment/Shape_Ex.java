/**
 * Shape_Ex
 */
class Shape{

    public double area(int r)
    {
        return (3.14 * (r * r));
    }
    public double perimeter(int r)
    {
        return ((2 * 3.14) * r);
    }
}
class Rectangle extends Shape
{
    public double area(int l, int w)
    {
        return (l * w);
    }
    public int perimeter(int l, int w)
    {
        return 2 * (l + w);
    }
}
class Circle extends Shape{
    //both methods are already defined as needed in the parent class shape so just use it as it is.
}
public class Shape_Ex {

    public static void main(String[] args) {
        Rectangle r = new Rectangle();
       System.out.println(r.area(10,20));
       System.out.println(r.perimeter(20,30));
       Circle c = new Circle();
       System.out.println(c.area(20));
       System.out.println(c.perimeter(30));
    }
}