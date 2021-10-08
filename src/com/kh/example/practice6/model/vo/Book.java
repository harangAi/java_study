package com.kh.example.practice6.model.vo;

public class Book {
    private String title;
    private String publisher;
    private String author;
    private int price;
    private double discountRate;

    public Book() {
        title = "등대지기";
        publisher = "맑은샘";
        author = "이군학";
        price = 10000;
        discountRate = 0.10;
    }

    public Book(String title, String publisher, String author) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
    }

    public Book(String title, String publisher, String author, int price, double discountRate) {
        this.title = title;
        this.publisher = publisher;
        this.author = author;
        this.price = price;
        this.discountRate = discountRate;
    }

    public void information() {
        System.out.printf("책 제목: %s, 출판사: %s, 지은이: %s, 가격: %d, 할인율: %f\n", this.title, this.publisher, this.author, this.price, this.discountRate);
    }
}
