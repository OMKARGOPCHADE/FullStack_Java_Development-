public class Type_conversion {

    /*
     * Type Conversion and Type Casting.
     * when we want chnage the type of the data or we want to store value of another data type other data type thier we can use this concept.
     * there two types of type conversion.
     * explict and implict
     * explict --> it's called as type casting.
     * implict --> it's called type conversion.
     * type permotion is nothing but converting small number into bigger range number. 
     */
    public static void main(String args[])
    {
        byte b= 10;
        int num = b;//implicit type conversion.
        byte by = 10;
        byte by2 =30;
        int result = by * by2;//type permotion.
        int n = 257;
        byte k = (byte)n;//explict type conversion.
        //in this case it will do % operation. because byte range is only from -128 to 127 --> 256.
        // and the following integer number is bigger so it will do n % 256. which will be 1 
        float f = 25.55f;
        int j = (int)f;//explict
        //while permoting or casting float to int always be in mind it will only take floor values.
        // if(1)System.out.println("hello");
        // we can'not write single integer in the if(condition) beause in java boolean supports only true or false value not a number or digit. as 0 or 1.
        // note:- we can write cases without statement in switch.
        //e.g
        // switch (2) {
        //     case 1:
        //         // we can have this is as empty
        //     case:2
        //         break;
        
        //     default:
        //         break;
        // }
    }
}
