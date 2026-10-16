public class Example3 {
    /*
    This program illustrates the difference between int and double
    Example3.java
     */
    public static void run() {
        int v;
        double x;

        v=10;
        x=10.0;
        System.out.println("Original value of v: " + v);
        System.out.println("Original value of x: " + x);

        v=v/4;
        x=x/4;

        System.out.println("v after division: " + v);
        System.out.println("x after division: " + x);

    }
}
