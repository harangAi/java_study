package com.kh.practice.point.view;

import com.kh.practice.point.controller.CircleController;
import com.kh.practice.point.controller.RectangleController;

import java.util.Scanner;

public class PointMenu {
    private Scanner sc = new Scanner(System.in);
    private CircleController cc = new CircleController();
    private RectangleController rc = new RectangleController();

    public void mainMenu() {
        int menuStatus = 0;
        while (true) {
            System.out.println("==== 메뉴 ====");
            System.out.println("1. 원");
            System.out.println("2. 사각형");
            System.out.println("9. 끝내기");
            System.out.print("메뉴 번호:");
            menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1: circleMenu();
                case 2: rectangleMenu();
                case 9: return;
                default:
                    System.out.println("올바른 메뉴를 선택하세요!");
            }
        }
    }

    public void circleMenu() {
        int menuStatus = 0;
        while (true) {
            System.out.println("==== 원 메뉴 ====");
            System.out.println("1. 원 둘레");
            System.out.println("2. 원 넓이");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호:");
            menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1: calcCircum();
                case 2: calcCircleArea();
                case 9: mainMenu();
                default:
                    System.out.println("올바른 메뉴를 선택하세요!");
            }
        }

    }

    public void rectangleMenu() {
        int menuStatus = 0;
        while (true) {
            System.out.println("==== 사각형 메뉴 ====");
            System.out.println("1. 사각형 둘레");
            System.out.println("2. 사각형 넓이");
            System.out.println("9. 메인으로");
            System.out.print("메뉴 번호:");
            menuStatus = sc.nextInt();
            sc.nextLine();

            switch (menuStatus) {
                case 1: calcPerimeter();
                case 2: calcRectArea();
                case 9: return;
                default:
                    System.out.println("올바른 메뉴를 선택하세요!");
            }
        }

    }

    public void calcCircum() {

    }

    public void calcCircleArea() {

    }

    public void calcPerimeter() {

    }

    public void calcRectArea() {

    }


}
