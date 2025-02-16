public class literls {
    public static void main(String args[])
    {
        /*
         * 1. for storing binary value use 0b before starting number.
         * 2. for hexadecimal use 0x
         * 3. for explon value use e between two digits.
         * 4. for long number use l at the end
         * 5. for float value use f at the end
         * 6. if you have number zeros more in a number use underscore between two zeros. so that it is help full to understand because compiler understand that type as well. 
         * 
         */
        int num = 0b101;//binary number
        int zeros = 10_00_00_00;
        float f = 100.3f;
        double d = 112e45;
        long l = 1234455667l;
        System.out.println(num);
        System.out.println(zeros);
        System.out.println(f);
        System.out.println(d);
        System.out.println(l);
    }
}
