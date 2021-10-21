package day16.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryExample2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("정수: ");
                int num = scanner.nextInt();
                System.out.println("입력된 정수: " + num);
                System.out.println(10 / num);
                break;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("정수로만 입력하세요!");
            } catch (ArithmeticException e) {
                System.out.println("0으로 나눌 수 없습니다");
            }
        }

        scanner.close();
        System.out.println("프로그램 정상 종료!");
    }
}
