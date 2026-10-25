
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
//für Random nummer erstens importieren
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ThreadLocalRandom;
public class Main
{
    //Der Code mit von bis
    static int myNumber = ThreadLocalRandom.current().nextInt(0, 100 + 1);
    static int startGuess = 0;
    static JLabel text = new JLabel("Gebe eine Zahl zwischen 0 und 100 ein");
    static JTextField textfeld = new JTextField();

    public static void main(String[] args)
    {
        openUI();
        //System.out.println("This is my number " + myNumber);
        //nextRound();


    }

    public static void  openUI()
    {
        //Erstelle das Fenster
        JFrame frame = new JFrame("Guess the Number");
        frame.setSize(400,250);
        frame.setLocation(100,150);

        //Was soll passieren wenn man das Fenster schließt
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setDefaultLookAndFeelDecorated(true);



        //Einen Text anzeigen
        text.setBounds(50,50,200,30);


        //Einen Textfeld erstellen

        textfeld.setBounds(50,100,200,30);


        //Einen Button erstellen
        JButton button = new JButton("Raten");
        button.setBounds(50,150,200,30);


        //ActionListener für den Button
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //Error Fehlermeldung
                try {
                    String textFromTextFeld = textfeld.getText();
                    int number = Integer.parseInt(textFromTextFeld);
                    guess(number);
                } catch (Exception error){
                    text.setText("Bitte gebe eine Zahl ein");
                }

            }
        });

        //Zum Fenster die Objekte hinzufügen
        frame.add(text);
        frame.add(textfeld);
        frame.add(button);

        //frame.setlayout(null); Platzieren von Objekten mit Koordinanten wird erlaubt (absolutes Layout)
        //Also ein Layout mit Koordinaten.
        frame.setLayout(null);


        //Fenster sichtbar machen sonst sieht man nichts
        frame.setVisible(true);


    }



    public static void nextRound(){

        startGuess = startGuess + 1;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte gebe eine Zahl ein: ");
        int typeNumber = scanner.nextInt();
        guess(typeNumber);

    }

    public static void guess(Integer number)
    {

        if(number == myNumber){
            System.out.println("Richtig geraten");
            System.out.println("Du hast " + startGuess + " Versuche gebraucht");

            text.setText("Richtig geraten mit " + startGuess + " Versuchen");
        }else{
            startGuess = startGuess + 1;
            if (number < myNumber){
                text.setText("Falsch, deine Zahl ist zu klein");
            }else {
                text.setText("Falsch deine Zahl ist zu groß");
            }
            textfeld.setText("");

             //nextRound();
        }


    }
}