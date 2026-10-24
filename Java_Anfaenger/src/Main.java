import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        //Variablen
        String name = "Arda";
        String job = "Softwareentwickler";
        int alter = 28;
        String stadt = "Innsbruck";




        System.out.println("Hello World ich heiße " + name + " ich bin ein " + job);
        System.out.println("Ich komme aus " + stadt + " und bin aktuell " + alter + " Jahre alt.");
        showGreeting();

        showDayTime(10);

        showDayTime(14);

        showDayTime(20);



    }

    public static void showGreeting(){
        //aktuelle Uhrzeit
        LocalTime d = LocalTime.now();
        //Uhrzeit in INT
        int timeAsInt = (d.getHour() * 100) + d.getMinute();

        //if else
        if (timeAsInt < 12){
            System.out.println("Es ist Vormittag " + timeAsInt);
        } else if (timeAsInt < 18) {
            System.out.println("Es ist Nachmittag " + timeAsInt);
        }else {
            System.out.println("Es ist Abend " + timeAsInt);
        }
    }

    public static void showDayTime(Integer hour){

        if (hour < 12){
            System.out.println("Guten Morgen");
        }else {
            if (hour > 18){
                System.out.println("Guten Abend");
            }
            else {
                System.out.println("Guten Mittag");
            }
        }

    }
}

