/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;

/**
 *
 * @author Lenovo
 */


public class Circle {
   
    protected double radius;
    protected String color;

    public Circle() {
        this.radius = 1.0;
        this.color = "Trang";
    }

    public Circle(double radius, String color) {
        this.color = color;
      
        this.radius = 1.0; 
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Ban kinh khong hop le");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return String.format("Hi    nh tron [ban kinh=%.2f, mau=%s, chu vi=%.2f, dien tich=%.2f]", 
                radius, color, getPerimeter(), getArea());
    }
}


