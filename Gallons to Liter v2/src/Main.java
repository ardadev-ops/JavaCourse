import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println();
            System.out.println("===Gallon to Liter===");
            System.out.print("Gallon angeben: ");

            if (sc.hasNextDouble()) {
                double gallon = sc.nextDouble();
                double liter = gallon * 3.7854;
                System.out.printf("Ergebnis: %.2f Liter%n", liter);
            } else {
                String eingabe = sc.next();
                if (eingabe.equals("q")) {
                    System.out.println("Programm beendet.");
                    break;
                }
                System.out.println("Ungültige Eingabe: " + eingabe);
            }

            System.out.println("=======================");
        }

        sc.close();
    }
}