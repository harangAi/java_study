package day15.abs;

public class Tiger extends Pet{
    public Tiger(String name, String kind) {
        super(name, kind);
    }

    @Override
    public void inject() {
        System.out.println("호랑이는 주사따위 맞지 않습니다~");
    }

    @Override
    public void eat() {
        System.out.println("호랑이는 생고기를 먹어요~");
    }
}
