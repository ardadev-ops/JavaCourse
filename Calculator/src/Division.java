public class Division implements Operation {

    @Override
    public double berechne(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Man kann nicht durch 0 teilen");
        }
        return a / b;
    }

}
