public class Chupacabras extends Animal{

    public Chupacabras( double weight) {
        super(4, weight);
    }

    @Override
    public void move() {
        chupaMoovin();
    }
    public void chupaMoovin (){
        System.out.println("Чупакабра передвигается прыжками на всех 4 конечностях");
    }
}
