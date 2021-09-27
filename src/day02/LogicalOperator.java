package day02;

public class LogicalOperator {

    public static void main(String[] args) {
        int x = 10, y = 20;
        boolean result1 = (x != 10) & (++y == 21); //&&는 앞에가 true여서 뒤에 식은 안봄(좌항에서 결정) -> y값 증감 안됨
        boolean result2 = (x == 10) | (++y == 21);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}
