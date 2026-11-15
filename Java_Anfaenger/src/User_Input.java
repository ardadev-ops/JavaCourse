/*
User input
 */


//Zuerst das Packet runterladen
import java.util.Scanner;


public class User_Input {

    public static void scanny() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Are you a Student?");
        boolean isStudent = scanner.nextBoolean();
        
        int age = scanner.nextInt();
        System.out.println("Enter your age: ");

        scanner.close();

    }
}
