package OOP_3;

public class Bot implements Robot {
    int speed;

    @Override
    public int run(int speed, int distance) {
        int time;
        time = distance / speed;
        return time;
    }
}
