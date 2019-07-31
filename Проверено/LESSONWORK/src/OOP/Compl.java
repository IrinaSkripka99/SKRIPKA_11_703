package OOP;

public class Compl {
    private double a;
    private double b;

    public Compl() {
        a = 0;
        b = 0;
    }

    public Compl(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void init(double a, double b) {
        this.a = a;
        this.b = b;
    }
    public Compl add(Compl c){
        Compl d=new Compl();
        d.a=a+c.a;
        d.b=b+c.b;
        return d;
    }
    public void addVoid(Compl c){
        a=a+c.a;
        b=b+c.b;
    }
}
