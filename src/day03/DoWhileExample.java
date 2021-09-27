package day03;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0, total = 0;
        do {
            System.out.print("정수1: ");
            number = sc.nextInt();
            total += number;
        } while(number != 0);
        System.out.println("입력된 누적총합 : " + total);
        sc.close();

    }
}
