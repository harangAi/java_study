package day07;

public class MethodReturn {
    static int add(int n1, int n2) {
        return n1 + n2;
    }
    //리턴값이 존재하지 않는 메서드는 void
    static void multi(int n1, int n2) {
        int result = add(n1, n2) * 10;
        System.out.println("result = " + result);
    }
    //void메서드에서 리턴값 없이 리턴 단독기능(함수종료)은 활용 가능!
    static void sayHello(String name) {
        if (name.length() > 5){
            System.out.println("이름이 너무 길어요!");
            return;
        }
        System.out.println(name + "님 하이!");
    }

    //모든 메서드의 리턴값은 반드시 1개다.
    //2개의 정수를 받아서 덧셈결과, 뺼셈, 곱셈, 나눗셈을 리턴하고 싶다면?
    static int[] operateAll(int n1, int n2) {
        int plus = n1 + n2;
        int minus = n1 - n2;
        int multi = n1 * n2;
        int divide = n1 / n2;
        int[] results = {plus, minus, multi, divide};
        return results;
        //return new int[] {n1 + n2, n1 - n2, n1 * n2, n1 / n2}
    }

    public static void main(String[] args) {
        int total = add(10,20);
        //void타입 메서드는 단독 호출해서 사용함
        multi(100, 20);
        sayHello("이하랑");
        sayHello("세상에서제일이쁜우리하랑이");
    }
}
