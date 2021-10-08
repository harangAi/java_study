package com.kh.example.practice1.run;

import com.kh.example.practice1.model.vo.Member;

public class Run {

    public static void main(String[] args) {

        Member member = new Member();
        member.changeName("이하랑");
        member.changeName("이군학");
        member.printName();

    }
}
