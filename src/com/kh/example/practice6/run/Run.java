package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("책제목1","출판사1","지은이1");
        Book book3 = new Book("책제목2","출판사2", "지은이2", 20000, 0.20);

        book1.information();
        book2.information();
        book3.information();
    }
}
