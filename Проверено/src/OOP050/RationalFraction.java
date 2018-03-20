package OOP050;

public class RationalFraction {
    private int a;
    private int b;

    public RationalFraction(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public RationalFraction() {
        a = 1;
        b = 1;
    }

    public void reduce() {
        for (int i = 1; i <= Math.abs(a); i++) {
            if (a % i == 0 && b % i == 0) {
                    a /= i;
                    b /= i;
            }
        }
    }

    public RationalFraction add(RationalFraction fraction) {
        RationalFraction newFraction = new RationalFraction((a * fraction.b + fraction.a *b), (b * fraction.b));
        newFraction.reduce();
        return newFraction;
    }

    public void add2(RationalFraction fraction){
        a = a * fraction.b + fraction.a * b;
        b = (b * fraction.b);
        reduce();
    }

    public RationalFraction sub(RationalFraction fraction) {
        RationalFraction newFraction = new RationalFraction((a * fraction.b - fraction.a * b), (b * fraction.b));
        newFraction.reduce();
        return newFraction;
    }

    public void sub2(RationalFraction fraction) {
        a = a * fraction.b - fraction.a * b;
        b *= fraction.b;
        reduce();
    }

    public RationalFraction mult(RationalFraction fraction) {
        RationalFraction c = new RationalFraction((a * fraction.a), (b * fraction.b));
        c.reduce();
        return c;
    }

    public void mult2(RationalFraction fraction) {
        a *= fraction.a;
        b *= fraction.b;
        reduce();
    }

    public RationalFraction div(RationalFraction value) {
        RationalFraction newFraction = new RationalFraction((a * value.b), (a * value.b));
        newFraction.reduce();
        return newFraction;
    }


    public void div2(RationalFraction fraction) {
        a *= fraction.b;
        b *= fraction.a;
       reduce();
    }

    @Override
    public String toString() {
        return a + "/" + b;
    }

    public double value() {
        return (double) a / b;
    }

    public boolean eguals(RationalFraction fraction) {
        reduce();
        fraction.reduce();
        return (a == fraction.a) && (b == fraction.b) && (value() == fraction.value());
    }

    public int numberPart() {
        return a / b;
    }


}
