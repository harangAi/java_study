package com.kh.example.practice2.run;

import com.kh.example.practice2.model.vo.Product;

public class Run {
    public static void main(String[] args) {
        Product product = new Product("아이폰13", 1300000, "Apple");
        product.information();
    }
}
