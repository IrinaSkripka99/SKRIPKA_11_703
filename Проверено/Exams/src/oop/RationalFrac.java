package oop;

public class RationalFrac {
    protected int a, b, c;

    public RationalFrac(int a, int b) {
        this.a = a;
        this.b = b;
        this.c = 0;
    }

    public void CorrectForm(int a, int b) {
        int c = a / b;
        System.out.println(c + " " + a + "/" + b);
    }

    public void Subtraction(int a1, int b1, int a2, int b2) {
        int demoninator = b1 * b2;
        int numenator = a1 * b2 - a2 * b1;
        for (int i = numenator; i > 0; i--) {
            if (demoninator % i == 0 && numenator % i == 0) {
                numenator /= i;
                demoninator /= i;
            }
        }
        System.out.println(numenator + "/" + demoninator);
    }

    public void Division(int a1, int b1, int a2, int b2) {
        int demoninator = b1 * a2;
        int numenator = a1 * b2;
        for (int i = numenator; i > 0; i--) {
            if (demoninator % i == 0 && numenator % i == 0) {
                numenator /= i;
                demoninator /= i;
            }
        }
        System.out.println(numenator + "/" + demoninator);
    }

}
