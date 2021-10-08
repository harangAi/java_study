package com.kh.example.practice5.model.vo;

import java.util.*;

public class Lotto {
    /**
     * int successCnt = 0;
     * while (successCnt < lotto.length) {
     *     int rn = (int) (Math.random() * 45 + 1);
     *      * boolean flag = false;
     *      * for(int i = 0; i < successCnt; i++) {
     *      *     if(rn == lotto[i]) {
     *      *         flag = ture;
     *      *         break;
     *      *     }
     *      * }
     *      * if (!flag) {
     *      *     lotto[successCnt++] = rn;
     *      *
     *      * }
     * }
     */

    private int lotto[] = new int [6];

    public Lotto() {
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
    }

    public int[] getLotto() {
        return lotto;
    }

    public void setLotto(int[] lotto) {
        this.lotto = lotto;
    }

    public void information() {
        System.out.println("로또번호: " + Arrays.toString(lotto));
    }
}
