package day05_primitives_concatanation;

public class PrimitivesExample {
    public static void main( String[] args){

        byte byteValue = 126;
        short shortValue = 14500;
        int intValue = 5089;
        long longValue = 9874515684L;

        System.out.println(longValue);
        // DECIMAL NUMBERS/ FLOATING POINT TYPES ***
         float floatValue = 1548.65F;
         double doubleValue = 2545116.5464;
         // --- CHARACTER TYPE ----
        char charValue= 'a';
        char ch = 'B';
        //*** BOOLEAN - TRUE OR FALSE****
        boolean booleanValue = true;
        System.out.println(booleanValue);
        System.out.println(byteValue);
        System.out.println(shortValue);
        System.out.println(intValue);
        System.out.println(floatValue);
        System.out.println(charValue);
        System.out.println(ch);
        System.out.println(byteValue+ shortValue);
    }
}