package day02;

public class Casting2 {

    public static void main(String[] args) {

        char c = 'B';
        int i = 2;
        System.out.println(c + i);  // 업케스팅이 더 안전함, 낮은애가 높은쪽으로 변하기 때문에 char가 int로 변함

        System.out.println(10 + 3.5);   // int가 double로 변함

        char result1 =  (char) (c + i);
        System.out.println("result1 = " + result1);

        double result2 = 3.5F + 5.6;
        //크기가 다른 데이터끼리 연산은 크기가 작은쪽이
        //큰 쪽으로 자동형변환 된 후 연산됨

        //int보다 작은(byte, short, char)의 연산은 결과값이 자동으로 int형 변환됨.
        byte b1 = 100, b2 = 110;
        int b3 = b1 + b2;

        int n1 = 27, n2 = 5;

        double result3 = (double)n1 / n2;   //int가 double로 형변환됨.
        System.out.println("result3 = " + result3);
    }
}
