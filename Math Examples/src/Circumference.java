import java.util.Scanner;
public class Circumference {
    public static void math() {
        Scanner scanner = new Scanner(System.in);

        double radius;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the radius ");
        radius = scanner.nextDouble();


        circumference = Math.PI * radius;


        area = Math.PI * Math.pow(radius, 2);

        volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);

        System.out.println(circumference);
        System.out.println(area);
        System.out.println(volume);






        scanner.close();


    }
}
