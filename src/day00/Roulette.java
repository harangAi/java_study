package day00;

import java.util.Arrays;
import java.util.Scanner;

public class Roulette {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("게임 인원 (2 ~ 4명) ==> ");

        //총 참여 인원 수
        int playerNum = sc.nextInt();

        //인원 수의 범위가 적당한지 확인
        if (playerNum < 2 || playerNum > 4) {
            System.out.println("인원수가 올바르지 않습니다. GAME OVER!");
            return;
        }

        //플레이어의 이름들을 저장할 배열
        //배열의 크기는 참여인원만큼 설정
        String[] players = new String[playerNum];

        //참여 인원 수대로 이름을 반복 입력 받은 후 배열에 저장
        System.out.println("\n플레이어의 이름을 등록합니다.");
        for (int i = 0; i < playerNum; i++) {
            System.out.printf("%d번 플레이어 이름: ", i+1);
            players[i] = sc.next();

        }
        //참여 인원 이름 출력
        System.out.print(Arrays.toString(players) + " 참가!");

        System.out.print("\n실탄 개수 (6 미만) ==> ");
        int bulletNum = sc.nextInt();
        sc.nextLine();

        //탄창 배열을 생성 (공간 6개)
        boolean[] magazine = new boolean[6];

        System.out.println("실탄을 넣고 탄창을 무작위로 돌립니다.");
        //입력된 실탄 수만큼 배열의 내부값을 true로 랜덤하게 바꿔줌
        int successCount = 0; //정확히 총알을 장전한 횟수
        while (successCount < bulletNum) {
            int position = (int) (Math.random() * 6);
            if (!magazine[position]) {  //탄창이 빈 곳만
                magazine[position] = true;  //장전해라
                successCount++; //성공시 카운트 증가
            }
            //if (bulletNum == successCount) break;
        }
        //System.out.println("탄창: " + Arrays.toString(magazine));


        //=================== 게임 시작 로직 ========================//
        //선턴 플레이어 랜덤 결정
        //랜덤 인덱스 생성 (플레이어 수에 따라 변경)
        int turn = (int) (Math.random() * playerNum);

            System.out.printf("총을 돌렸습니다. %s부터 시작합니다.\n", players[turn]);

            //한 턴 내에서 해야 할 일
        /*
            1. 턴창을 돌린다: 0~5 사이의 인덱스를 랜덤 결정한다.
            2. 격발한다: 위에서 나온 인덱스를 통해 탄창을 조회하여 실탄이 있는지 확인
            3. 사망 판정: 실탄이 있었다면 사망처리, 없었다면 다음 턴으로 넘어감.
         */
        while (true) {
            System.out.printf("\n[%s님의 턴!] 실린더를 돌립니다.\n", players[turn]);
            int bulletPosition = (int) (Math.random() * magazine.length);

            System.out.println("# 엔터를 누르면 격발합니다.");
            sc.nextLine();

            //사망 판정
            if (magazine[bulletPosition]) {
                System.out.printf("\n빵!! [%s]님 사망....\n", players[turn]);
                //사망자를 players배열에서 삭제
                for (int i = turn; i < players.length-1; i++) {
                    players[i] = players[i+1];
                }
                String[] temp = new String[players.length-1];
                for (int i = 0; i < temp.length; i++) {
                    temp[i] = players[i];
                }
                players = temp; temp = null;
                playerNum--;

                //System.out.println("남은 인원: " + Arrays.toString(players));

                //탄창 배열에서 총알이 나간 위치를 재조정
                magazine[bulletPosition] = false;
                bulletNum--;

                //게임 종료 조건 판단
                //남은 플레이어가 1명일 때, 총알이 모두 소진되었을 때
                if (playerNum==1) {
                    System.out.println("\n# 단 한명만 살아남았습니다. 게임을 종료합니다.");
                    System.out.println("최후 생존자: " + players[0]);
                    break;
                } else if (bulletNum == 0) {
                    System.out.println("총알이 모두 발사되었습니다. 게임을 종료합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                } else {
                    System.out.println("남은 인원으로 게임을 계속 진행합니다.");
                    System.out.println("남은 인원 정보: " + Arrays.toString(players));
                    //혹시 사망자가 마지막 플레이어면 turn을 0으로 조정
                    if (turn == players.length) {
                        turn = 0;
                    }
                    continue;
                }
                break;
            } else {
                //생존한 경우: 턴을 넘김
                System.out.println("휴.... 살았습니다.");
                if (turn == players.length-1) {
                    //마지막 플레이어는 턴을 첫번째로 돌려놓는다.
                    turn = 0;
                } else {
                    turn++;
                }
            }
        }
    }
}
