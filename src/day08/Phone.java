package day08;

//설계도 클래스는 main을 만들지 않습니다.
public class Phone {

    //속성: 객체의 데이터
    //필드(field)

    //고유 데이터터
    String model; //모델명
    String color; //색상
    int price; //가격

    //상태 데이터
    String[] receiveMessage = new String[3]; //받은 문자메시지들
    int messageCount; //총 문자메시지 수
    boolean isOn; //전원 켜진 여부

    //부품 데이터(집합관계: composition)
    Battery battery;

    //생성자(constructor) -> 생성자는 하나도 만들지 않으면 기본 생성자가 호출됨
    //객첼를 생성하고 초기화를 담당
    //Phone() -> 기본 생성자
    public Phone() {   //생성자는 리턴을 하지 않기 때문에 void 조차 쓰지 않음
        model = "갤럭시 Z-Fold2";
        color = "펄 블루";
        price = 3000000;
        isOn = true;
    }
    //생성자는 여러 개 선언할 수 있음(오버로딩)
    //오버로딩 규칙: 매개변수의 타입이나 개수나 순서가 달라야 함.
    //Phone(String)
    public Phone(String modelName) {
        model = modelName;
        color = "스노우 화이트";
        price = 1200000;
        isOn = true;
    }
    //Phone(Stirng,String)
    public Phone(String modelName, String colorName) {
        model = modelName;
        color = colorName;
        price = 1400000;
        isOn = true;
    }

    //기능: 객체의 행위
    //메서드(method): static은 붙이지 마세요.

    //전원 켜는 기능
    public void powerOn() {
        isOn = true;
        System.out.println(model + "의 전원을 켭니다.");
    }
    //전원 끄는 기능
    public void powerOff() {
        isOn = false;
        System.out.println(model + "의 전원을 끕니다.");
    }
    //핸드폰의 정보를 보여주는 기능
    public void showSpec() {
        if (!isOn) {
            System.out.println("전원을 먼저 켜세요~");
            return;
        }
        System.out.println("\n### 휴대폰 정보 ###");
        System.out.println("* 모델명: " + model);
        System.out.println("* 색상: " + color);
        System.out.println("* 가격: " + price + "원");
    }

    //문자메시지를 보내는 기능
    public boolean sendMessage(Phone targetPhone, String message) {
        if (!isOn) {
            System.out.printf("%s의 전원을 먼저 켜주세요!\n", model);
            return false;
        } else if (!targetPhone.isOn) {
            System.out.printf("상대방 %s의 전원이 꺼져있습니다.", targetPhone.model);
            return false;
        }

        //메시지를 보낼 수 있는 경우
        if (targetPhone.messageCount < targetPhone.receiveMessage.length) {
            targetPhone.receiveMessage[targetPhone.messageCount++] = message;
            System.out.println("메시지가 성공적으로 전송됨.");
            return true;
        } else {    //상대방 메시지함이 다 찬 경우
            System.out.println("상대방의 메시지함이 가득 찼습니다.");
            return false;
        }
    }

    //수신 메시지함을 확인하는 기능
    public void checkMessages() {
        System.out.printf("\n======== [%s]의 메시지함 ======= \n", model);
        for (int i = 0; i < messageCount; i++) {
            System.out.printf("# %d. %s\n", i+1, receiveMessage[i]);
        }
    }

    //배터리 교환기능
    public void changeBattery() {
        battery = new Battery("삼성");
    }

}
