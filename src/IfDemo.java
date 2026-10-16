public class IfDemo {
    /*
    Demonstrate the if.

     */
    public static void go() {
        int a , b ,c;
        a=2;
        b=3;

        if(a<b){
            System.out.println("a is less than b");
        }

        //this wont display anything
        if (a==b){
            System.out.println("you wont see me");
        }

        c = a - b; //c contains -1

        System.out.println("c equals -1");

        if (c >= 0){
            System.out.println("c is non-negative");
        }
        if(c < 0 ){
            System.out.println("c is negative");
        }

        c = b - a;
        System.out.println("c equals 1");
        if (c >= 0){
            System.out.println("c is non-negative");
        }
        if(c < 0 ){
            System.out.println("c is negative");
        }

    }
}
