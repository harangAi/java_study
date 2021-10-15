package day12.protect.pac1;

public class B {
    public B() {
        A a = new A();
        a.f1 = 1;
        a.f2 = 2;
        a.m1();
        a.m2();
    }
}
