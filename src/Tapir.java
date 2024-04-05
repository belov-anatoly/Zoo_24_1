public class Tapir extends Mammal {
    private int speed;

    public Tapir(double weight) {
        super(weight);
    }

    public Tapir(double weight, int speed) {
        super(weight);
        this.speed = speed;
    }

    public int getSpeed() {return speed;}

    public void setSpeed(int speed) {
        if (speed<60)
            speed=60;
        if (speed<40)
            speed=40;
        this.speed = speed;
    }
}




}
