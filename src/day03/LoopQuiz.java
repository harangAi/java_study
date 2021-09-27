package day03;

import java.util.Scanner;

public class LoopQuiz {
    public static void main(String[] args) {
        int total = 0;
        Scanner sc = new Scanner(System.in);

        System.out.print("정수1: ");
        int num1 = sc.nextInt();

        System.out.print("정수2: ");
        int num2 = sc.nextInt();
        sc.close();

        for (int i = num1; i <= num2; i++) {
            total += i;
        }

        System.out.printf("%d~%d까지의 총합: %d\n", num1, num2, total);


    }
}
