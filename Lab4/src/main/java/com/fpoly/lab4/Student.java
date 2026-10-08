/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Student {

    private String id;
    String name;
    private int age;
    private double gpa;

    public Student() {
    }

    public Student(String id, String name, int age, double gpa) {
        this.id = id;
        this.name = name;
        setAge(age);
        setGpa(gpa);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Tuoi khong hop le");
        }
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        if (gpa >= 0 && gpa <= 10) {
            this.gpa = gpa;
        } else {
            System.out.println("GPA khong hop le");  
        }
    }

    void input(Scanner sc) {
        System.out.print("Nhap ma SV: ");
        id = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        name = sc.nextLine();
        System.out.print("Nhap tuoi: ");
        age = sc.nextInt();
        System.out.print("Nhap GPA: ");
        gpa = sc.nextDouble();
        sc.nextLine();
    }

    String rank() {
        if (gpa >= 9.0) {
            return "Excellent";
        } else if (gpa >= 8.0) {
            return "Very Good";
        } else if (gpa >= 6.5) {
            return "Good";
        } else if (gpa >= 5.0) {
            return "Average";
        } else {
            return "Fail";
        }
    }

    void output() {
        System.out.printf("ID: %s | Ho ten: %s | Tuoi: %d | GPA: %.2f | Xep loai: %s%n",
                id, name, age, gpa, rank());
    }
}
