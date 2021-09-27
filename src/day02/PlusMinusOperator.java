package day02;

public class PlusMinusOperator {

    public static void main(String[] args) {

        int x = 3;
        int y = ++x + 5 * 3;    //y=19 x=4
        int z = 5 * y-- + x++ - --y;    //z=95+4-17=82  y=18 x=5
        System.out.println("x = " + x); //5
        System.out.println("y = " + y); //18
        System.out.println("z = " + z); //82
    }
}
