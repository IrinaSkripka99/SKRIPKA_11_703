package ru.itis.Task2;

public class Shoot {
    private int x;
    private int y;

    public Shoot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private double calcRadius() {
        return Math.sqrt(x * x + y * y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}