package oop;

public class Car {
    private int heightFree;
    private int widthFree;
    private int depthFree;

    public Car(int height, int width, int depth) {
        this.heightFree = height;
        this.widthFree = width;
        this.depthFree = depth;
    }

    public boolean isFitable(Furniture furniture) {
        if (furniture.getHeight() <= this.heightFree && furniture.getDepth() <= this.depthFree
                && furniture.getWidth() < this.widthFree) {
            return true;
        }
        return false;
    }

    public void put(Furniture furniture) {
        this.widthFree -= furniture.getWidth();
        this.depthFree -= furniture.getDepth();
        this.heightFree -= furniture.getHeight();
    }

}