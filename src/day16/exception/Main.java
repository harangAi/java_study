package day16.exception;

public class Main {
    public static void main(String[] args) {
        Student kim = new Student("김철수");
//        kim.insertScore();

//        System.out.println("프로그램 정상 종료");

        System.out.println("====================");
        Account account = new Account(5000);
        try {
            account.withDraw(10000);
        } catch (Exception e) {
            String message = e.getMessage();
            System.out.println("message = " + message);
            // 에러 로그 확인
            e.printStackTrace();
        }

    }
}
