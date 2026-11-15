public class LogicalOpTable {

    public static void run() {
        boolean p, q;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;  q = true;
        System.out.print(toBit(p) + "\t" + toBit(q) + "\t");
        System.out.print(toBit(p & q) + "\t" + toBit(p | q) + "\t");
        System.out.println(toBit(p ^ q) + "\t" + toBit(!p));

        p = true;  q = false;
        System.out.print(toBit(p) + "\t" + toBit(q) + "\t");
        System.out.print(toBit(p & q) + "\t" + toBit(p | q) + "\t");
        System.out.println(toBit(p ^ q) + "\t" + toBit(!p));

        p = false; q = true;
        System.out.print(toBit(p) + "\t" + toBit(q) + "\t");
        System.out.print(toBit(p & q) + "\t" + toBit(p | q) + "\t");
        System.out.println(toBit(p ^ q) + "\t" + toBit(!p));

        p = false; q = false;
        System.out.print(toBit(p) + "\t" + toBit(q) + "\t");
        System.out.print(toBit(p & q) + "\t" + toBit(p | q) + "\t");
        System.out.println(toBit(p ^ q) + "\t" + toBit(!p));
    }

    private static int toBit(boolean b) {
        if(b){
            return 1;
        }else
            return 0;
    }
}