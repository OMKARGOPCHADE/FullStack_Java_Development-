interface Shape{
    public Number area();
    public Number perimeter();
}
class Square implements Shape{
    private int side;
    public void setSide(int side)
    {
        this.side = side;
    }
    public Integer area()
    {
        return (side * side);
    }
    public Integer perimeter()
    {
        return 4 * side;
    }
}
class Triangle implements Shape{
    private int base;
    private int height;
    private int a;
    private int b;
    private int c;
    public Double area()
    {
        return (0.5 * base * height);
    }
    public Integer perimeter()
    {
        return (a + b + c);
    }
    public void setBase(int base) {
        this.base = base;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public void setC(int c) {
        this.c = c;
    }

}
public class Shape_Ex_Interface {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
       triangle.setBase(10);
       triangle.setHeight(20);
       System.out.println("Area of triangle: "+triangle.area());
       triangle.setA(10);
       triangle.setB(20);
       triangle.setC(30);
       System.out.println("Perimeter of triangle: "+triangle.perimeter());
       Square sq = new Square();
       sq.setSide(20);
       System.out.println("Area of Square: "+sq.area());
       System.out.println("Perimeter of Square: "+sq.perimeter());
    }
}
