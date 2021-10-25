package day18.generic;

public class Main {
    public static void main(String[] args) {
        AppleBasket ab = new AppleBasket();
        ab.setApple(new Apple());
        Apple apple = ab.getApple();
        System.out.println("apple = " + apple);

        PeachBasket pb = new PeachBasket();
        pb.setPeach(new Peach());
        Peach peach = pb.getPeach();
        System.out.println("peach = " + peach);

        System.out.println("========================");
        Basket<Apple> apb = new Basket<>();
        apb.setF(new Apple());
        Apple f = apb.getF();
        System.out.println("f = " + f);

        Basket<Peach> pcb = new Basket<>();
        pcb.setF(new Peach());
        Peach f1 = pcb.getF();
        System.out.println("f1 = " + f1);

    }
}
