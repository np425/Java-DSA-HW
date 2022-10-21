public class Fraction {
    int numerator;
    int denominator;
    int integer;

    public int getNumerator() {
        return numerator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getInteger() {
        return integer;
    }

    public void setInteger(int integer) {
        this.integer = integer;
    }

    @Override
    public String toString() {
        return String.format("%d %d/%d", integer, numerator, denominator);
    }

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

        this.simplify();
    }

    public Fraction(int integer, int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
        this.integer = integer;

        this.simplify();
    }

    /**
     * @param integer Integer to add to the fraction
     */
    public void add(int integer) {
        this.integer += integer;
    }

    public void add(int numerator, int denominator) {
        this.numerator = (this.numerator * denominator) + (numerator * this.denominator);
        this.denominator = denominator * this.denominator;

        this.simplify();
    }

    public void add(int integer, int numerator, int denominator) {
        this.add(integer);
        this.add(numerator, denominator);
    }

    public void add(Fraction fraction) {
        this.add(fraction.integer, fraction.numerator, fraction.denominator);
    }

    public void subtract(int integer) {
        this.add(-integer);
    }

    public void subtract(int numerator, int denominator) {
        this.add(-numerator, denominator);
    }

    public void subtract(int integer, int numerator, int denominator) {
        this.add(-integer, -numerator, denominator);
    }

    public void subtract(Fraction fraction) {
        this.add(-fraction.integer, -fraction.numerator, fraction.denominator);
    }

    public void multiply(int integer) {
        this.numerator = (this.integer * this.denominator + this.numerator) * integer;
        this.integer = 0;
        this.simplify();
    }

    public void multiply(int numerator, int denominator) {
        this.numerator = (this.integer * this.denominator + this.numerator) * numerator;
        this.denominator *= denominator;
        this.integer = 0;
        this.simplify();
    }

    public void multiply(int integer, int numerator, int denominator) {
        this.numerator = (this.integer * this.denominator + this.numerator) * (integer * denominator + numerator);
        this.denominator *= denominator;
        this.integer = 0;
        this.simplify();
    }

    public void multiply(Fraction fraction) {
        this.multiply(fraction.integer, fraction.numerator, fraction.denominator);
    }

    public double toDouble() throws ArithmeticException {
        return this.integer * (this.numerator / (double) this.denominator);
    }

    private void simplify() throws ArithmeticException {
        // Separate integer from fraction
        int remainder = this.numerator % this.denominator;
        int integer = this.numerator / this.denominator;

        this.integer += integer;
        this.numerator = remainder;

        // Simplify fraction
        int gcf = gcf(this.numerator, this.denominator);
        this.numerator /= gcf;
        this.denominator /= gcf;
    }

    private static int gcf(int a, int b) {
        if (b == 0) {
            return a;
        }

        return gcf(b, a % b);
    }
}
