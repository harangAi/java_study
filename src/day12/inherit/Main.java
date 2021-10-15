package day12.inherit;

public class Main {
    public static void main(String[] args) {
        Warrior w = new Warrior();
        w.name = "주차왕파킹";
        w.level = 1;
        w.hp = 50;
        w.rage = 100;
        w.info();

        Mage mage = new Mage("마법사님",1, 50, 50);
        mage.info();

        Hunter hunter = new Hunter("사냥꾼님", 1, 50, "펫");
        hunter.info();

    }
}
