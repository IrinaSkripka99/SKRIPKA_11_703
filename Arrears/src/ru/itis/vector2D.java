package ru.itis;

public class vector2D {

    private static double x = 0;
    private static double y = 0;

    public vector2D (double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public static vector2D add(double x2, double y2){
        y2 += y;
        x2 += x;
        return new vector2D (x2, y2);
    }

    public void add2(double x2, double y2){
        this.x += x2;
        this.y += y2;
    }

    public static vector2D sub(double x3, double y3){
        x3 -= x;
        y3 -= y;
        return new vector2D (x3, y3);
    }

    public void sub2 (double x3, double y3){
        this.x -= x3;
        this.y -= y3;
    }

    public static vector2D mult (double numeral){
        double movenX = numeral * x;
        double movenY = numeral * y;
        return new vector2D(movenX, movenY);
    }

    public void mult2(double numeral){
        this.x *= numeral;
        this.y *= numeral;
    }

    @Override
    public String toString() {
        return "vector2D{}";
    }

    public double length(){
        double length = Math.sqrt(x*x + y*y);
        return length;
    }

    public double scalarProduct (double x4, double y4){
        double scalarProduct = y*x + x4 * y4;
        return scalarProduct;
    }

    public double cos(double x4, double y4){
        double cos = (y*x + x4 * y4)/(Math.sqrt(x*x + y*y))/Math.sqrt(x4*x4 + y4*y4)
        return cos;
    }

    public boolean equals(double x4, double y4){
        boolean equals;
        if (x4 == x && y4 == y){
            equals = true;
        } else {
            equals = false;
        }
        return equals;
    }
}
