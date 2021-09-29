package day05;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeleteQuiz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] members = {"영웅재중", "최강창민", "시아준수", "믹키유천", "유노윤호"};
        System.out.println("# 우리반 학생들의 별명: " + Arrays.toString(members));
        while (true) {
            System.out.println("# 삭제할 학생의 이름을 입력하세요.");
            System.out.print(">> ");
            String newName = sc.next();
            //삭제할 인덱스 변수 생성 및 초기화
            int delidx = -1;
            //삭제할 인덱스 번호 검색 후 갱신
            for (int i = 0; i < members.length; i++) {
                if (newName.equals(members[i])) {
                    delidx = i;
                    break;
                }

            }
            //삭제할 인덱스 번호 조건이 true면 삭제 과정 알고리즘 실행
            if (delidx != -1) {
                for (int i = delidx; i < members.length-1 ; i++) {
                    members[i] = members[i+1];
                }
                //일련의 삭제 과정후 갱신할 새 배열 생성(기존배열 -1)
                String[] temp = new String[members.length-1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = members[i];
                }
                members = temp;
                temp = null;
                System.out.println(newName + "의 별명을 삭제합니다");
                System.out.println("# 삭제 후 정보: " + Arrays.toString(members));
                sc.close();
                break;
            } else {
                System.out.printf("해당 별명(%s)은 존재하지 않습니다.\n", newName);
            }
        }
    }
}
