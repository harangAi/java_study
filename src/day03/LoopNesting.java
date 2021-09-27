package day03;

public class LoopNesting {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.println("hello" + ++count);
            }
        }
    }
}
