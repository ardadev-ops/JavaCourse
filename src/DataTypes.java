import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class DataTypes {

    public static void byteTest(Byte b){

        System.out.println("- The byte is " + b);
        System.out.println(" Range: " + Byte.MIN_VALUE + "->" + Byte.MAX_VALUE);

    }

    public static void shortTest(Short s){
        System.out.println("- The Short is " + s);
        System.out.println(" Range: " + Short.MIN_VALUE + "->" + Short.MAX_VALUE);
    }

    public static void intTest(Integer i){
        System.out.println("- The integer  " + i);
        System.out.println(" Range: " + Integer.MIN_VALUE + "->" + Integer.MAX_VALUE);

    }

    public static void longTest(Long l){
        System.out.println("- The long integer is " + l);
        System.out.println(" Range: " + Long.MIN_VALUE + "->" + Long.MAX_VALUE);
    }

    public static void floatTest(Float f){
        System.out.println("- The float " + f);
        System.out.println(" Range: " + Float.MIN_VALUE + "->" + Float.MAX_VALUE);

    }


}

