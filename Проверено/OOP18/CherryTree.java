package OOP18;

public class CherryTree extends Tree {
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public int getHarvest() {
        return harvest;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public void setHarvest(int harvest) {
        this.harvest = harvest;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }
}
