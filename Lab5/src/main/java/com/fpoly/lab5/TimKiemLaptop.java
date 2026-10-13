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

public class TimKiemLaptop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22900000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24900000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        System.out.print("Nhap gia min: ");
        double min = sc.nextDouble();
        System.out.print("Nhap gia max: ");
        double max = sc.nextDouble();
        sc.nextLine();

        if (min > max) {
            System.out.println("Khoang gia khong hop le");
        } else {
            System.out.printf("\n=== LAPTOP GIA TU %.0f DEN %.0f ===\n", min, max);
            boolean timThayGia = false;

            for (Laptop lt : list) {
                if (lt.getPrice() >= min && lt.getPrice() <= max) {
                    lt.output();
                    timThayGia = true;
                }
            }
            if (!timThayGia) {
                System.out.println("Khong tim thay laptop nao");
            }
        }

        System.out.print("\nNhap tu khoa tim kiem (keyword): ");
        String keyword = sc.nextLine();

        System.out.printf("\n=== KET QUA TIM KIEM \"%s\" ===\n", keyword);
        boolean timThayKeyword = false;

        for (Laptop lt : list) {

            String idLower = lt.getId().toLowerCase();
            String nameLower = lt.getName().toLowerCase();
            String keywordLower = keyword.toLowerCase();

            if (idLower.equals(keywordLower) || nameLower.contains(keywordLower)) {
                lt.output();
                timThayKeyword = true;
            }
        }
        if (!timThayKeyword) {
            System.out.println("Khong tim thay laptop nao");
        }

        sc.close();
    }
}
