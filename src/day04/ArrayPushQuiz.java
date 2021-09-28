package day04;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPushQuiz {
    public static void main(String[] args) {
        //문자열끼리의 동등비교 시 ==을 사용하지 말고
        //문자열1.equals(문자열2)를 사용할 것!
        //ex) if (s1 == s2) (x)
        //    if (s1.equals(s2)) (o)
        Scanner sc = new Scanner(System.in);
        System.out.println("# 먹고 싶은 음식을 입력하세요!!");
        System.out.println("# 입력을 중지하려면 <그만>이라고 입력하세요");
        //입력될 값들을 받을 빈배열 생성
        String[] foods = new String[0];

        while (true) {
            //스캐너로 입력값 처리
            System.out.print(">>");
            String newFood = sc.nextLine();
            //입력값이 "그만"이면 무한루프 종료
            if (newFood.equals("그만")) break;
            //기존 배열 공간보다 하나 더 큰 배열 생성
            String[] temp = new String[foods.length + 1];
            //추가된 입력값을 반복문으로 빈배열로 값 복사
            for (int i = 0; i < foods.length; i++) {
                temp[i] = foods[i];
            }
            //새로운 음식을 임시배열 마지막 인덱스에 추가
            temp[temp.length - 1] = newFood;
            //주소값 이전
            foods = temp;
            temp = null;
        }
        sc.close();
        System.out.println("프로그램종료!");
        System.out.println("먹고싶은 음식: " + Arrays.toString(foods));
    }
}
