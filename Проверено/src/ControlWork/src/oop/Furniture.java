package oop;

public abstract class Furniture {
    protected int height;
    protected int width;
    protected int depth;
    protected String material;
    protected int density;



    public abstract int getHeight(int height);

    public abstract int getWidth(int width);

    public abstract int getDepth(int depth);
}
