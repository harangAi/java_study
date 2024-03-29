package day17.api.lang.obj;

public class Main {
    public static void main(String[] args) {
        Member member = new Member("김철수", 30, "대전시 서구");
        System.out.println(member);

        Member member1 = new Member("박영희", 40, "대전시 유성구");
        System.out.println(member1);

        System.out.println("========== 소멸자 테스트 ================================");

        Member m = null;
        for (int i = 0; i < 50; i++) {
            m = new Member("바보" + i, i,"대전" );
            m = null;
            System.gc(); // garbage collector 호출
        }

    }
}
