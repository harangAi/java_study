package day15.quiz;

public class Main {
    public static void main(String[] args) {
        Child c = new Child();

        SnowTire snowTire = new SnowTire();
        Tire tire = snowTire;

        snowTire.roll();
        tire.roll();
    }
}
