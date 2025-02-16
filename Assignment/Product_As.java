class Product{
    private String name;
    private int price;
    private float quantity;

    public Product()//default constrcutor
    {

    }
    public Product(String name){ this.name = name;}
    public Product(int price){ this.price = price;}
    public Product(float quantity){ this.quantity = quantity;}
    public Product(String name, int price)
    {
        this.name = name;
        this.price = price;
    }
    public Product(String name, int price, float quantity)
    {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
    }
}
public class Product_As {
    public static void main(String[] args) {
        Product obj = new Product(); // default constrctor will get called.
        Product obj1 = new Product("Dell Laptop"); // Name-Single element constrctor will get called.
        Product obj2 = new Product(850000); //  Price constrctor will get called.
        Product obj3 = new Product(5f); //  Quantity constrctor will get called.
        Product obj4 = new Product("Dell Laptop",850000); // Name & Price constrctor will get called.
        Product obj5 = new Product("Dell Laptop",850000,5); // all parameter's constrctor will get called.
        System.out.println(obj.toString());
        System.out.println(obj1.toString());
        System.out.println(obj2.toString());
        System.out.println(obj3.toString());
        System.out.println(obj4.toString());
        System.out.println(obj5.toString());
    }
}
