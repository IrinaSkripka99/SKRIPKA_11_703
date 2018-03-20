package OOP18;

public abstract class Tree {
    protected int number;
    protected int harvest;
    protected int age;

    public abstract int getNumber();
    public abstract int getHarvest();
    public abstract int getAge();

    public abstract void setNumber(int number);
    public abstract void setHarvest(int harvest);
    public abstract void setAge(int age);

}
