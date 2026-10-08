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
public class QuanLySinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n;
        do {
            System.out.print("Nhap so luong sinh vien: ");
            n = sc.nextInt();
            sc.nextLine();
        } while (n <= 0);

        Student[] ds = new Student[n];
        for (int i = 0; i < n; i++) {
            ds[i] = new Student();
            System.out.println("--- Sinh vien " + (i + 1) + " ---");
            ds[i].input(sc);
        }

        System.out.println("=== DANH SACH SINH VIEN ===");
        for (Student sv : ds) {
            sv.output();
        }

        Student max = ds[0];
        for (int i = 1; i < n; i++) {
            if (ds[i].getGpa() > max.getGpa()) {
                max = ds[i];
            }
        }
        System.out.println("=== SINH VIEN CO GPA CAO NHAT ===");
        max.output();

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (ds[j].getGpa() < ds[j + 1].getGpa()) {
                    Student tmp = ds[j];
                    ds[j] = ds[j + 1];
                    ds[j + 1] = tmp;
                }
            }
        }
        System.out.println("=== DANH SACH SAU KHI SAP XEP GIAM DAN THEO GPA ===");
        for (Student sv : ds) {
            sv.output();
        }

        sc.close();
    }
}
