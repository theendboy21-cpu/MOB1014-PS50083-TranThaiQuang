/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Lenovo
 */



public class DanhSachHinh {
    public static void main(String[] args) {
       
        List<Circle> shapes = new ArrayList<>();
        
        shapes.add(new Circle(1, "Do"));
        shapes.add(new Cylinder(1, "Do", 2));
        shapes.add(new Circle(2, "Trang"));
        shapes.add(new Cylinder(2, "Xanh", 3));

        System.out.println("=== CHI TIET CAC HINH ===");
        for (Circle s : shapes) {
            System.out.printf("%s -> getArea() = [%.2f]\n", s.toString(), s.getArea());
        }
        System.out.println(); 

        int countCircle = 0;
        int countCylinder = 0;
        double totalCylinderVolume = 0;

        for (Circle s : shapes) {
           
            if (s instanceof Cylinder) {
                countCylinder++;
             
                Cylinder cy = (Cylinder) s;
                totalCylinderVolume += cy.getVolume();
            } else if (s instanceof Circle) {
                countCircle++;
            }
        }
        
        System.out.printf("So hinh tron: [%d]\n", countCircle);
        System.out.printf("So hinh tru: [%d]\n", countCylinder);
        System.out.printf("Tong the tich cac hinh tru: [%.2f]\n", totalCylinderVolume);
    }
}

