/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;

/**
 *
 * @author Lenovo
 */

public class Cylinder extends Circle {
   
    private double height;

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = 1.0; 
        setHeight(height);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Chieu cao khong hop le");
        }
    }

    @Override
    public double getArea() {
        // Công thức: 2 * pi * r * h + 2 * pi * r * r
        // Trong đó (2 * pi * r * r) chính là 2 lần diện tích đáy của lớp cha
        return (2 * Math.PI * radius * height) + (2 * super.getArea());
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return String.format("Hinh tru [ban kinh=%.2f, mau=%s, chieu cao=%.2f, dien tich toan phan=%.2f, the tich=%.2f]",
                radius, color, height, getArea(), getVolume());
    }
}
 
