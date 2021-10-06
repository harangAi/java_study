package day09;

import day08.Phone;

public class MessageMain {
    public static void main(String[] args) {
        Phone haptic = new Phone("햅틱2");
        Phone chocolate = new Phone("초콜릿폰");
        haptic.powerOn();
        haptic.sendMessage(chocolate,"안녕");
        chocolate.sendMessage(haptic,"꺼져");
        chocolate.checkMessages();
        haptic.checkMessages();
        System.out.println("======================================");
        Person Lee = new Person("이군학",haptic);
        Person Harang = new Person("이하랑", new Phone("아이폰13"));
        Lee.contact(Harang, "사랑해");
        Harang.check();
    }
}
