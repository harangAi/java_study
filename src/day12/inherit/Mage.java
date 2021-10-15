package day12.inherit;

public class Mage extends Player {
    public int mana;

    public void fireBall() {

    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 마력: " + mana);
    }

    public Mage(String name, int level, int hp, int mana) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.mana = mana;
    }
}
