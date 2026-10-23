/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab6;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class QuanlyHinhtru {
  


    public static void main(String[] args) {
      
        List<Cylinder> list = new ArrayList<>();
        list.add(new Cylinder(1.0, "Do", 2.0));
        list.add(new Cylinder(2.0, "Xanh", 3.0));
        list.add(new Cylinder(1.5, "Vang", 4.0));
        list.add(new Cylinder(3.0, "Do", 1.0));
        list.add(new Cylinder(2.5, "Xanh", 2.0));

        System.out.println("=== DANH SACH HINH TRU ===");
        for (Cylinder cy : list) {
            System.out.println(cy);
        }

        double totalVolume = 0;
        for (Cylinder cy : list) {
            totalVolume += cy.getVolume();
        }
        System.out.printf("Tong the tich: [%.2f]\n", totalVolume);

        Cylinder maxCy = list.get(0);
        for (Cylinder cy : list) {
            if (cy.getVolume() > maxCy.getVolume()) {
                maxCy = cy;
            }
        }
        System.out.println("Hinh tru co the tich lon nhat:");
        System.out.println(maxCy);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap vao mau can tim: ");
        String searchColor = scanner.nextLine();
        
        System.out.printf("=== HINH TRU MAU [%s] ===\n", searchColor);
        boolean found = false;
        for (Cylinder cy : list) {
          
            if (cy.getColor().equalsIgnoreCase(searchColor)) {
                System.out.println(cy);
                found = true;
            }
        }
        
        if (!found) {
            System.out.printf("Khong co hinh tru mau [%s]\n", searchColor);
        }
        
        scanner.close();
    }
}


