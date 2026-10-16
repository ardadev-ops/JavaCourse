import java.util.Scanner;

public class Main {
    private static final String[] WAEHRUNGEN = {"Euro", "USD", "CHF", "GBP"};

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String weiter;

        do {
            System.out.println("=== Währungsrechner ===");
            String von = waehrungWaehlen(scanner, "Von welcher Währung?");
            String nach = waehrungWaehlen(scanner, "In welche Währung?");

            System.out.print("Betrag in " + von + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Bitte eine Zahl eingeben: ");
                scanner.next();
            }
            double betrag = scanner.nextDouble();
            scanner.nextLine();

            double ergebnis = betrag * KursService.getKurs(von, nach);
            System.out.printf("%.2f %s = %.2f %s%n", betrag, von, ergebnis, nach);

            System.out.print("Nochmal? (j/n): ");
            weiter = scanner.nextLine().trim().toLowerCase();
            System.out.println();
        } while (weiter.equals("j"));

        System.out.println("Tschüss!");
    }

    private static String waehrungWaehlen(Scanner scanner, String frage) {
        while (true) {
            System.out.println(frage);
            for (int i = 0; i < WAEHRUNGEN.length; i++) {
                System.out.println("  " + (i + 1) + ") " + WAEHRUNGEN[i]);
            }
            System.out.print("Auswahl: ");
            String eingabe = scanner.nextLine().trim();

            try {
                int index = Integer.parseInt(eingabe) - 1;
                if (index >= 0 && index < WAEHRUNGEN.length
                        && KursService.isGueltig(WAEHRUNGEN[index])) {
                    return WAEHRUNGEN[index];
                }
            } catch (NumberFormatException e) {
                // fällt durch zur Fehlermeldung
            }
            System.out.println("Ungültige Auswahl, bitte nochmal.");
        }
    }
}
