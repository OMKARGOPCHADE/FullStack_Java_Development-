public class Loops {
    public static void main(String[] args) {
        // There are three types of loops in java.
        /*
         * 1. do-while-loop
         * 2. while-loop
         * 3. for-loop
         */
        int i = 6;
        do{
            System.out.println(i);
            //no matter the condition is true or false it will definetly excutes once.
            //that's why do-while is called as exit control loop.
        }while(i<5);

        while(i<5)
        {
            System.out.println(i);
            i--;
        }
        
        for(i = 0; i<3; i++)System.out.println("omkar sir");
    }
}
