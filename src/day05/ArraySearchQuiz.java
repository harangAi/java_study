package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySearchQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] members = {"영웅재중", "최강창민","시아준수", "믹키유천", "유노윤호"};
        System.out.println("# 변경 전 정보: " + Arrays.toString(members));
        while (true) {
            System.out.println("# 수정할 맴버의 이름을 입력하세요.");
            System.out.print(">> ");
            String addMember = sc.next();
            int idx = -1;
            boolean change = false;
            for (int i = 0; i < members.length; i++) {
                // 수정할 맴버의 이름을 확인한 경우
                if (addMember.equals(members[i])) {
                    idx = i;
                    System.out.printf("%s의 별명을 변경합니다.\n", addMember);
                    System.out.print(">> ");
                    addMember = sc.next();
                    members[i] = addMember;
                    System.out.println("변경이 완료 되었습니다.");
                    System.out.println("# 변경 후 정보: " + Arrays.toString(members));
                    change = true;
                    break;
                }
            }
            //수정할 맴버의 이름을 확인받지 못한 경우
            if (idx == -1) {
                System.out.printf("%s은(는) 없는 이름입니다.\n", addMember);
            }
            //조건 검색의 종료 조건(무한루프종료)
            if (change == true) {
                break;
            }
        }
    }
}
