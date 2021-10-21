package lottosimulator_homework;

import java.util.Arrays;

public class Lotto {

    private static int lotto[] = new int [6];

    public static int[] createLotto() {
        for(int i=0; i<6; i++) {
            lotto[i] = (int)(Math.random() * 45) + 1;

            // 중복 번호 제거
            for(int j=0; j<i; j++) {
                if(lotto[i] == lotto[j]) {
                    i--;
                    break;
                }
            }
        }
        return lotto;
    }

    public static int createBonusNum(int[] win) {
        return 0;
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }
}
