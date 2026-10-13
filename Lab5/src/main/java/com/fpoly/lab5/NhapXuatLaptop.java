/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

public class NhapXuatLaptop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Laptop> list = new ArrayList<>();
        String choice;

        do {
            System.out.println("--- Nhap thong tin laptop ---");
            Laptop lt = new Laptop();
            lt.input(sc); 
            list.add(lt); 

            System.out.print("Tiep tuc nhap? (y/n): ");
            choice = sc.nextLine();
        } while (choice.equalsIgnoreCase("y")); 

        System.out.println("\n=== DANH SACH LAPTOP (" + list.size() + " may) ===");
        for (Laptop lt : list) {
            lt.output(); 
        }
        
        sc.close();
    }
}
