

}public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}public class Fox extends Mammal{
    private int sly;

    public Fox (double weight) {
        super(weight);
    }

    public Fox (double weight, int sly) {
        super(weight);
        this.sly= sly;
    }


    public String getSly() {
        return sly;
    }

    public void setSly(int sly) {
        if (sly<0)
            sly=0;
        if (sly>10)
            sly=10;
        this.sly= sly;
    }

    @Override
    public void move() {
        run();
    }

    public void run()
    {
        System.out.println("лиса бежит");
    }

    @Override
    public String toString() {
        return "Fox{" +
                "fox=" + fox +
                ", isAlive=" + isAlive +
                ", pawAmount=" + pawAmount +
                ", weight=" + weight +
                '}';
    }
}
