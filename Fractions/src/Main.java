public class Main {
    final static int numerator = 4;
    final static int denominator = 5;
    final static int integer = 5;

    public static void main(String[] args) throws ArithmeticException {
        Fraction fraction = new Fraction();
        fraction.setDenominator(denominator);
        fraction.setNumerator(numerator);
        fraction.setInteger(integer);

        System.out.println(new Fraction(1, -45, 30).toDouble());

        fraction = new Fraction(numerator, denominator);
        System.out.println(fraction);

        fraction = new Fraction(integer, numerator, denominator);
        System.out.println(fraction);

        fraction.add(3);
        System.out.println(fraction);

        fraction.subtract(3);
        System.out.println(fraction);

        fraction.multiply(3);
        System.out.println(fraction);

        fraction.multiply(1,2,3);
        System.out.println(fraction);

        fraction.add(2,3);
        System.out.println(fraction);

        fraction.add(9,0);
        System.out.println(fraction);
    }
}
