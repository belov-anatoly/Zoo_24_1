public class Main {
    public static void main(String[] args) {
        exampleRacoon();
    }

    public static void exampleRacoon(){
        Racoon racoon = new Racoon(4, 9);
        System.out.println("У нас есть енот: "+racoon);
        racoon.move();
        racoon.die();
        System.out.println("У нас есть енот: "+racoon);
    }
}