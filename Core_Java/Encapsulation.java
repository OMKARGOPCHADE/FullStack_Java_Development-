class Home{
    private int hm_id;
    private String hm_name;
    private long hm_Tel_no;

    /*
     * Encapsulation is the one of object oriented programming key concept.
     * Encapsulation is nothing but encapsulating (binding) the properties like member variables and member functions(methods) of the class together.
     */
    void setData(int hm_id, String hm_name,long hm_Tel_no)
    {
        this.hm_id = hm_id;
        this.hm_name = hm_name;
        this.hm_Tel_no = hm_Tel_no;
    }
    void getData()
    {
        System.out.println("Home_Id: "+hm_id);
        System.out.println("Home_name: "+hm_name);
        System.out.println("Home_Tel: "+hm_Tel_no);
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Home hm = new Home();
        hm.setData(105, "Gaurai Niwas", 9890772303l);
        hm.getData();
        
    }
}
