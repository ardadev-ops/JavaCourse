//===========================
//VARIABLES
//===========================


//Variable = a reusable container for a value
//           a veriable behaves as if it was the value it contains
//Primitive = simple value stored directly in memory (stack)
//Reference = memory address (stack) that point to the (heap)

//  Primitive = int, double, float, char, boolean
//  Reference = string, array, object


//2 Steps to creating a variable
//------------------------------
//1. declaration
//2. assignment

public class Variables{
    public static void declare() {
        //Zahlen
        int age = 28;
        int year = 2025;
        int quantity = 1;
        double price = 19.99;
        double gpa = 3.5;
        double temperature = 39;

        System.out.println(age);
        System.out.println(price);

        //Einzelne Zeichen
        char grade = 'A';
        char symbol = '!';
        char currency = '€';
        System.out.println(currency + " " + price);

        //Richtig oder Falsch
        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnline = true;

        System.out.println(forSale);


        if(isOnline){
            System.out.println("The User is Online");
        }else{
            System.out.println("The User is Offline");
            if(isStudent){
                System.out.println("He is learning");
            }else {
                System.out.println("He is dead");
            }
        }

    }
}
