package day14.poly.car;

public class Main {
    public static void main(String[] args) {
        Tucson t = new Tucson();
        Sonata s = new Sonata();
        Boxster b = new Boxster();

        Car[] cars = {t,s,b};
        for (Car car : cars) {
            car.run();
        }

        System.out.println("=============================");

        Driver park = new Driver();
        park.drive(s);
        park.drive(t);
        park.drive(b);

        System.out.println();

        System.out.println("=============================");
        Car myCar = park.buyCar("소나타");
        myCar.run();

        park.buyCar("박스터").run();

        System.out.println("=============================");
        Sonata mySonata = (Sonata) park.buyCar("소나타");
        mySonata.국산세단할인();
        mySonata.run();

        cars[0] = mySonata;

        System.out.println("=============================");

        Boxster myBoxster = (Boxster) park.buyCar("박스터");
        myBoxster.스포츠카할증();

        System.out.println("=============================");
        CarShop carShop = new CarShop();
        int money = carShop.sellCar(new Sonata());
        System.out.println("money = " + money);
    }
}
