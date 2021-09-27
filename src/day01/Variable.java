package day01;

public class Variable {
    public static void main(String[] args) {
        //변수의 선언
        int score;
        //변수의 초기화
        score = 100;
        //출력 sout(단축코드)
        System.out.println(score);
        //변수의 선언과 초기화 동시작업
        int life = 50;
        life = 100;

        int triple = score * 3;
        System.out.println("triple = " + triple);

        //정수: int, 실수: double, 문자열: String
        String nickName = "짹짹이";

        //변수 이름은 중복 선언 불가 int score = 30.5;
        //타입에 맞지않는 값은 저장 불가 nickName = 100;
        /*
        선언이나 초기화 되지 않은 변수는 사용 불가
        int result;
        System.out.println(result);
        */

        //$,_,(0)
    }
}
