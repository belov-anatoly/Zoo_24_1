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
    public static void  exampleRatel(){
        Ratel ratel = new Ratel(15,999);
        System.out.println("################################## ");
        ratel.move();
        ratel.bolt();
        System.out.println("Медоед: "+ratel);
    }
}
