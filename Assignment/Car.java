class Car_Data
{
    private int price;
    private int year;
    private String model;
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public int getYear() {
        return year;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    @Override
    public String toString() {
        return "Car_Data [price=" + price + ", year=" + year + ", model=" + model + ", name=" + name + "]";
    }
    
}
public class Car {
    public static void main(String[] args) {
        Car_Data obj = new Car_Data();
        obj.setModel("A6");
        obj.setName("Audi");
        obj.setPrice(200000000);
        obj.setYear(2025);
        System.out.println(obj.toString());
    }
}
