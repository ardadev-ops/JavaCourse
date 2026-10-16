public class CubicMile {
    class Cubic {
        public static void run() {
            long ci;
            long im;

            im = 5280 * 12;
            ci = im * im * im;
            System.out.println("There are " + ci + " cubic inches in cubic mile");

        }
    }

    class Hypot{
        public static void run() {
            double x, y, z;
            x = 3;
            y = 4;

            z = Math.sqrt(x*x + y*y);
            System.out.println("Hypothenuse is " + z);

        }
    }
}

