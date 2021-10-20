package polymorphism_homework.controller;

import polymorphism_homework.model.vo.Animal;
import polymorphism_homework.model.vo.Cat;
import polymorphism_homework.model.vo.Dog;

public class AnimalManager {
    public static void main(String[] args) {
        Animal[] aArry = new Animal[5];
        aArry[0] = new Dog("바둑이","말티즈",5);
        aArry[1] = new Cat("극동이","코숏","인천","검+흰");
        aArry[2] = new Dog("너울이","슈나우저",9);
        aArry[3] = new Cat("초코","코숏","서울","삼");
        aArry[4] = new Cat("망고","코숏","인천","노란색");

        for (int i = 0; i < aArry.length; i++) {
            aArry[i].speak();
        }




    }
}
