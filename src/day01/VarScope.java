package day01;

public class VarScope {
    public static void main(String[] args) {
        int num1 = 10, num2 = 20;
        //변수는 선언된 블록을 벗어나면 메모리에서 자동제거
        if (true) {
            int num3 = num1 + num2;
        }//end if
        int num3 = 100;
        int num4 = num3 * num1;
    } //end main
    //int num5 = num1;
}//end class
