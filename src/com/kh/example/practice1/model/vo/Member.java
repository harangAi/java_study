package com.kh.example.practice1.model.vo;
// 그룹id(도메인주소) - 프로젝트명


public class Member {

    private String memberId;
    private String memberPwd;
    private String memberName;
    private int age;
    private char gender;
    private String Phone;
    private String email;

    public Member() {

    }

    public void changeName(String name) {
        this.memberName = name;
    }

    public void printName() {
        System.out.printf("이름: %s\n", this.memberName);
    }
}
