package day05;

import java.util.Arrays;

public class ArrayPop {
    public static void main(String[] args) {
        //배열의 끝 데이터 삭제
        int[] arr = {10, 20, 30, 40, 50};
        //사이즈가 1작은 배열 삭제
        int[] temp = new int[arr.length-1];
        //맨 마지막 데이터를 제외한 나머지는 temp로 복사
        for (int i = 0; i < temp.length; i++) {
            temp[i] = arr[i];
        }
        arr = temp;
        temp = null;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.toString(temp) = " + Arrays.toString(temp));

    }
}
