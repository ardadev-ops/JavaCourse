import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        myName();

        myAge();



    }

    private static void myAge() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Age: ");
        int age = scanner.nextInt();



        if (age >=18){
            System.out.println("You are an adult");
        } else if (age < 0){
            System.out.println("You are not born yet lol");

        }else{
            System.out.println("You are a kid");
        }

    }

    private static void myName(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name:");
        String name = scanner.nextLine();

        if(name.isEmpty()){
            System.out.println("You didn't enter your Name!");
            myName();
        }
    }



}
