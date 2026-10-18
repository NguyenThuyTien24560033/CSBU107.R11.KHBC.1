class Fraction {
    private int numerator;
    private int denominator;

    public Fraction() {
        this.numerator = 0;
        this.denominator = 1;
    }

    public Fraction(int numerator, int denominator) {
        if (denominator == 0) {
            System.out.println("Denominator cannot be 0. Setting denominator to 1.");
            this.numerator = numerator;
            this.denominator = 1;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        simplify();
    }

    public Fraction(Fraction other) {
        if (other != null) {
            this.numerator = other.numerator;
            this.denominator = other.denominator;
        } else {
            this.numerator = 0;
            this.denominator = 1;
        }
    }

    private int gcd(int a, int b) {
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public void simplify() {
        if (this.numerator == 0) {
            this.denominator = 1;
            return;
        }
        int commonDivisor = gcd(this.numerator, this.denominator);
        this.numerator /= commonDivisor;
        this.denominator /= commonDivisor;

        if (this.denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -this.denominator;
        }
    }

    public Fraction add(Fraction other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction subtract(Fraction other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction multiply(Fraction other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Fraction(newNumerator, newDenominator);
    }

    public Fraction divide(Fraction other) {
        if (other.numerator == 0) {
            System.out.println("Cannot divide by zero fraction.");
            return new Fraction();
        }
        int newNumerator = this.numerator * other.denominator;
        int newDenominator = this.denominator * other.numerator;
        return new Fraction(newNumerator, newDenominator);
    }

    public void display() {
        System.out.println(this.numerator + "/" + this.denominator);
    }

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);

        System.out.print("f1: ");
        f1.display();
        System.out.print("f2: ");
        f2.display();

        System.out.print("Add (f1 + f2): ");
        f1.add(f2).display();

        System.out.print("Subtract (f1 - f2): ");
        f1.subtract(f2).display();

        System.out.print("Multiply (f1 * f2): ");
        f1.multiply(f2).display();

        System.out.print("Divide (f1 / f2): ");
        f1.divide(f2).display();

        System.out.println("\n   Copy Constructor Test   ");
        Fraction f3 = new Fraction(f1);
        System.out.print("f3 (copied from f1): ");
        f3.display();

        System.out.println("f1 == f3 ? " + (f1 == f3) + " (false means two distinct memory locations)");
    }
}