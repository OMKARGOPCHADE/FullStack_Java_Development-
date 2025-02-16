enum Status{
    Pending,Remaining,Ongoing,Completed;
    
}
enum Computer{
    Macbook(1000), Dell(2000), Hp(3000), Assuss;//these all the objects so through enum (computer) constructor it is getting filled.
    private int price;
    Computer(int price) {
        this.price = price;
    }
    Computer() {
        this.price = 10000;
    }
}
public class Ennum_cl {
    /*
     * -- Enum --
     * enum is something through we can create named constant.
     * when we want something by using we can show the status of the entity or work
     * there we can use enum class for making most of it.
     * 
     * An enum is a special "class" that represents a group of constants
     * (unchangeable variables, like final variables).
     * 
     * To create an enum, use the enum keyword (instead of class or interface), and
     * separate the constants with a comma. Note that they should be in uppercase
     * letters:
     * 
     * also we can use number's for the constants by using enum class properties(constructor). 
     * for taking all values once we can use enum class inbuild method.
     * as every class in java extends the object class by default enum class also does the same but aprat from that enum class also extends java.lang.Enum class as super parent.
     * every object in ennum has number which start's from 0.
     * which we can check with ordinal() method.
     * 
     * --- Annotation's ---
     * annotation in java is something through we can reduce the cost of error's which could come runtime or compiletime.
     * annotation makes programmer's as well as compiler's life easy by giving annotation's we tell to compiler that what work we are going to do there.
     * e.g @override by writing this we are confirming that below method is overided from parent class. if the method name or any other erro'r chances are there then comiplier helps us to manage those erro'rs before occur's.
     * altough we use annotation when we do actual project work with hibernate and spring.
     * for just be in mind annotation's are good to write for reducing the error rate.
     */
    public static void main(String[] args) {
        Status st = Status.Completed;
        System.out.println(st.ordinal());

        //switch with enum
        // we can directly use the enum constants as case.
        switch (st) {
            case Pending:
                System.out.println(st.name()+":"+st.ordinal());
                break;
            case Remaining:
                System.out.println(st.name()+":"+st.ordinal());
                break;
            case Ongoing:
                System.out.println(st.name()+":"+st.ordinal());
                break;        
            default:
            System.out.println(st.name()+":"+st.ordinal());
                break;
        }
        for(Computer ct : Computer.values())
        {
            System.out.println(ct + ":"+ ct.ordinal());
        }
    }
}
