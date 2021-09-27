package day03;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("### 여행지 추천 프로그램 ###");
        System.out.println("[여행을 원하는 계절을 입력하세요.]");
        System.out.print(">> ");
        String season = sc.next();
        sc.close();
        // switch문에는 문자, 정수형 변수만 쓸 수 있음

        switch (season) {
            // case에 변수를 쓸 수 없음
            // 리터럴이나 상수형태로 작성함
            case "spring":            case "春":            case  "봄":
                System.out.println("봄에는 남산으로 가보세요~");
                break;
            case "여름":
                System.out.println("여름에는 해운대로 가보세요~");
                break;
            case "가을":
                System.out.println("가을에는 지리산으로 가보세요~");
                break;
            case "겨울":
                System.out.println("겨울에는 대전으로 가보세요~");
                break;
            default:
                System.out.println("[봄, 여름, 가을, 겨울] 중 하나만 입력하세요~");
                break;
        }
    }
}
