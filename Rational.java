public class Rational {
    private int numerator;
    private int denominator;

    public Rational() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public static void printRational(Rational r) {
        System.out.println(r.numerator + "\\" + r.denominator);
    }

    public String toString() {
        return String.format("%01d\\%01d", this.numerator, this.denominator);
    }

    // Instance method that reverse the sign of a rational. It's a modifier
    public void negate() {
        this.numerator = -this.numerator;
        this.denominator = -this.denominator;

    }

    // Instance method that invert the sign of
    public void invert() {
        int num = this.numerator;
        int den = this.denominator;
        this.numerator = den;
        this.denominator = num;
    }

    // Instance method that convert rational to double and doesn't modify object
    public double toDouble() {
        double result = (double)this.numerator/ (double) this.denominator;
        return result;
    }

    // Finding the greatest common denominator using Euclidean algorithm
    public static int gcd(int a, int b) {
        if (b==0) {
            return a;
        }
        else {
            return gcd(b, a%b);
        }
    }

    public Rational reduce() {
        int gcd = gcd(this.numerator, this.denominator);
        Rational reduced_rational = new Rational(this.numerator/gcd,
                this.denominator/gcd);
        return reduced_rational;
    }

    public Rational add(Rational r) {
        Rational sum = new Rational((r.numerator*this.denominator) +(r.denominator*this.numerator)
        , (r.denominator*this.denominator));
        return sum.reduce();
    }

    public static void main(String[] args) {
        // Test printRational
        Rational rational = new Rational();
        System.out.println("printRational method:");
        printRational(rational);

        // Test toString method
        String s = rational.toString();
        System.out.println("toString method:");
        System.out.println(s);
        Rational rational_new = new Rational(16,4);

        // Test printRational method
        System.out.println("printRational method:");
        printRational(rational_new);

        // test negate method
        rational_new.negate();
        System.out.println("negate method:");
        printRational(rational_new);

        // test invert method
        rational_new.invert();
        System.out.println("invert method:");
        printRational(rational_new);

        // test toDouble method
        System.out.println("toDouble method:");
        System.out.println(rational_new.toDouble());

        // test reduce method
        System.out.println("reduce method:");
        printRational(rational_new.reduce());

        // test add method
        System.out.println("add method: ");
        Rational x = new Rational(4,2);
        Rational y = new Rational(12,2);
        printRational(x.add(y));

    }

}
