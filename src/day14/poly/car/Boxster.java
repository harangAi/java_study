package day14.poly.car;

public class Boxster extends Car{
    @Override
    public void run() {
        System.out.println("박스터가 달립니다.");
    }

    @Override
    public void downSpeed() {
        System.out.println("박스터가 멈춥니다.");
    }

    public void 스포츠카할증() {
        System.out.println("보험료가 할증됩니다.");
    }

}
