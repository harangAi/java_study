package day12.inherit;

public class Warrior extends Player{
    public int rage;

    public void fireSlash() {

    }

    public Warrior() {
        System.out.println("Warrior 객체 생성됨!");
    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 분노: " + rage);
    }

    public Warrior(String name) {
        super(name);
        this.rage = 100;
    }
}
