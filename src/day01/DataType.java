package day01;

public class DataType {
    public static void main(String[] args) {
        //정수형타입
        byte a = 128 - 1;
        short b = 32768 - 1;
        int c = (int) 2147483648L - 1;
        long d = 20000000000000L;
        System.out.println("d = " + d);

        //실수형타입
        float f1 = 1.234567F; // 4byte
        double d1 = 1.234567; // 8byte

        float f2 = 1.234567891234F;
        double d2 = 1.234567891234;
        System.out.println("f2 = " + f2);
        System.out.println("d2 = " + d2);

        int i;
        double n = 0.0;
        for (i=0; i<100; i++)
            n += 0.1;

        System.out.println("n = " + n);

        //문자타입
        char c1 = 'A';
        char c2 = 0xAC00;
        System.out.println("c2 = " + c2);

        //문자열타입
        String s1 = "hey~";
        String s2 = "my name is Harang~~";
        System.out.println(s1 + s2);

        String msg = "여기는 아주 \"위험해\"!!";
        System.out.println(msg);

    }
}
