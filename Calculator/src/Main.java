import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("======TASCHENRECHNER========");
            System.out.println("Operator einfügen (+, -, *, /) oder 'q' zum Beenden: ");
            String operator = sc.next();

            if (operator.equalsIgnoreCase("q")) {
                break;
            }

            Operation operation = switch (operator) {
                case "+" -> new Addition();
                case "-" -> new Subtraktion();
                case "*" -> new Multiplikation();
                case "/" -> new Division();
                default -> throw new IllegalArgumentException("Unbekannter Operator: " + operator);
            };

            System.out.println("Erste Zahl eintragen: ");
            double a = sc.nextDouble();

            System.out.println("Zweite Zahl: ");
            double b = sc.nextDouble();

            double ergebnis = operation.berechne(a, b);
            System.out.println("Ergebnis: " + ergebnis);
        }
    }

}
