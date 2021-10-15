package day12.inherit;

public class Hunter extends Player {
    public String beast;

    public void frozenShot() {

    }

    @Override
    public void info() {
        super.info();
        System.out.println("# 동물 : " + beast);
    }

    public Hunter(String name, int level, int hp, String beast) {
        this.name = name;
        this.level = level;
        this.hp = hp;
        this.beast = beast;
    }
}
