package day17.api.lang.obj;

public class Member {
    String name;
    int age;
    String address;

    public Member(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println(name + "객체 소멸됨!");
    }

    @Override
    public String toString() {
        return "Member{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    //    public String toString() {
//        return String.format("이름: %s, 나이: %d, 주소: %s ", name, age, address);
//    }

}
