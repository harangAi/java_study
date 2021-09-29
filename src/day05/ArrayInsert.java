package day05;

import java.util.Arrays;

public class ArrayInsert {
    public static void main(String[] args) {
        //배열의 중간데이터 삽입
        int[] arr = {10, 20, 40, 50, 60};
        int newNumber = 30;
        System.out.println("#삽입 전(arr) : " + Arrays.toString(arr));

        //새배열 생성(기존배열+1)
        int[] temp = new int[arr.length+1];
        for (int i = 0; i < temp.length-1; i++) {
            temp[i] = arr[i];
        }
        //중간데이터 삽일할 인덱스 초기화
        int insertIdx = 2;
        //마지막 인덱스-1 부터 데이터 인덱스+1 이동
        System.out.println("#현재 새배열(temp) : " + Arrays.toString(temp));
        for (int i = temp.length-1; i > insertIdx ; i--) {
            temp[i] = temp[i-1];
            System.out.println(i + "번 인덱스 작업" + Arrays.toString(temp));
        }
        //중간데이터 삽입
        temp[insertIdx] = newNumber;
        //주소값 이전
        arr = temp;
        temp = null;

        System.out.println("#삽입 후(arr) : " + Arrays.toString(arr));
    }
}
