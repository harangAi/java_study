package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {
    public static void main(String[] args) {
        Student student = new Student(3, 2, "이군학", 173.7,'M');
        student.information();
    }
}
