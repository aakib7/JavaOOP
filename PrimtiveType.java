public class PrimtiveType{
    public static void main(String[] args){

        // byte,short,int
        // byte number = 123;
        // System.out.println(number);
        // //number = 128; an error occure because it is out of range
        // System.out.println(number);

        //long
        // long number = 2452345356543; it gives an error brcause it handle tjis value as integer to specify it as long we specify it with long litteral (L/l) 
        long number = 2452345356543L;
        System.out.println(number);

        // float
        // float average = 22.3; // it gives an error brcause it handle tjis value as double we give here floating literal (F/f)
        float average = 22.3f;
        System.out.println(average);

        //Boolean
        Boolean flag = false;
        System.out.println(flag);



    }
}
// signed means negative and positive both 

//          Type           Size                Range
//Integral Type (not in decimal)

//signed   byte       8 bit 1 byte       -2^7 --> 2^7-1 (-128-0-127)
//signed   shord      16 bit 2 bytes      -2^15 --> 2^15-1 
//unsigned   char     16 bit 2 bytes      0 --> 2^16 
//signed   int        32 bit 4 bytes      -2^31 --> 2^31-1 
//signed   long      64 bit 8 bytes      -2^63 --> 2^53-1 

// Floating Type
// float  32 bit 4 bytes ................
// double 64 bit 8 bytes ................

// range -127 0 127 means byte value in between these values if byte value is 128 or greater than that it gives an error...