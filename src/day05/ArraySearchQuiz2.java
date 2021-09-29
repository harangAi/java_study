package day05;
import java.util.*;
public class ArraySearchQuiz2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] tvxq = {"영웅재중", "최강창민", "시아준수"
                , "믹키유천", "유노윤호"};

        System.out.println("* 변경 전 정보: " + Arrays.toString(tvxq));

        while (true) {
            System.out.println("- 수정할 멤버의 이름을 입력하세요.");
            System.out.print("> ");
            String targetName = sc.next();

            //순차 탐색: 탐색성공 -> 해당데이터의 인덱스 || 실패시 -> -1
            int idx = -1;
            for (int i = 0; i < tvxq.length; i++) {
                if (targetName.equals(tvxq[i])) {
                    idx = i;
                    break;
                }
            }

            //수정 여부 결정
            if (idx != -1) {  //수정 진행
                System.out.println(tvxq[idx] + "의 별명을 변경합니다.");
                System.out.print("> ");
                tvxq[idx] = sc.next();
                System.out.println("변경 완료!");
                System.out.println("* 변경 후 정보: " + Arrays.toString(tvxq));
                sc.close();
                break;
            } else {
                System.out.printf("%s은(는) 없는 이름입니다.\n", targetName);
            }
        }

    }
}