import javax.xml.crypto.Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {

        /*
        System.out.println("Java learn course");
        Example.run(); //.run führt die Klasse aus
        System.out.println();
        Example2.run();
        System.out.println();
        Example3.run();
        System.out.println();
        GalToLit.run();
        System.out.println();
        IfDemo.go();
        System.out.println();
        ForDemo.goFor();
        System.out.println();
        BlockDemo.run();
        System.out.println();
        Main.run();

         */
        DataTypes.byteTest((byte) 10);
        DataTypes.intTest(10);
        DataTypes.floatTest((float)10.2);
        DataTypes.longTest((long)20);
        DataTypes.shortTest((short)2);

        CubicMile.Cubic.run();
        CubicMile.Hypot.run();








    }
    /*
    public static void run() {

        BufferedReader input = new BufferedReader (new InputStreamReader(System.in));
        String name = "";
        System.out.println("Hello World");
        System.out.print("Ihr Name: ");
        try{
            name = input.readLine();
        }catch (IOException e){}
        System.out.println("Hallo, " + name + "!");

    }
     */
}