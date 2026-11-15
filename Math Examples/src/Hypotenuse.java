import java.util.Scanner;

public class Hypotenuse {

    public static void math()
    {
        Scanner scanner = new Scanner(System.in);
        double a;
        double b;
        double c;

        System.out.print("Enter the length of Side A: ");
        a = scanner.nextDouble();

        System.out.print("Enter the length of Side B: ");
        b = scanner.nextDouble();

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));


        System.out.println("The Hypotenuse is " + c + " cm");


        scanner.close();


    }

}
