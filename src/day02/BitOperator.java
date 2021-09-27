package day02;

public class BitOperator {

    public static void main(String[] args) {

        //비트 연산
        byte a = 5; //00000101
        byte b = 3; //00000011

        //비트곱: 각 자리수를 곱하세요
        System.out.println(a & b);  // 00000001 => 1

        //비트합: 각 자리수를 더하세요. 단 1 + 1은 1로 처리하세요.
        System.out.println(a | b);  // 00000111 => 7

        //배타적논리합: 다르면 1 같으면 0
        System.out.println(a ^ b);  // 0000110 => 6

        //비트 이동 연산
        //왼쪽방향: 2의 이동숫자 제곱만큼 곱함
        //오른쪽방향: 2의 이동숫자 제곱만큼 나눔
        int x = 192;    // 00000000 00000000 00000000 11000000
        System.out.println(x << 3);
        System.out.println(x >> 2);

        //비트 반전 (단항연산자)
        int y = 8;  // 00001000
        System.out.println(~8); // 11110111 => -9
    }
}
