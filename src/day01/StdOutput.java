package day01;

public class StdOutput {
    public static void main(String[] args) {
        String dog = "멍멍이";
        String cat = "야옹이";
        System.out.println(dog);
        System.out.println(cat);

        int month = 10;
        int day = 3;
        String anni = "개천절";
        System.out.println(month + "월 " + day + "일은 " + anni + "입니다.");

        // 정수: %d, 실수: %f, 문자: %s
        System.out.printf("%d월 %d일은 %s입니다.\n",month, day, anni);//줄 개행은 이루어지지 않음(기본값) - 필요시 \n

        double saleRate = 0.2532;
        System.out.printf("할인비율: %.2f\n", saleRate); //%f는 소수점 6자리까지 표현 - 필요시 %와f사이의 .자릿수
        System.out.printf("할인비율: %.2f%%\n", saleRate * 100); //&& = '%'
    }
}
