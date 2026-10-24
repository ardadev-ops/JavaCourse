import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //input Variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gebe den Betrag in Euro an: ");
        double money = scanner.nextDouble();

        convertToDolars(money);
        convertToLira(money);
    }

    public static void convertToDolars(double euro){
        System.out.println("Der Betrag in Dolar ist: " + euro * 1.2);
    }

    public static void convertToLira(double euro){
        System.out.println("Der Betrag in Lira ist : " + euro * 56);
    }
}