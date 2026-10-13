/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author Lenovo
 */

public class SapXepLaptop {

    public static void main(String[] args) {
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22900000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24900000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                String name1 = list.get(j).getName();
                String name2 = list.get(j + 1).getName();

                if (name1.compareToIgnoreCase(name2) > 0) {

                    Laptop temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }

        System.out.println("=== SAP XEP THEO TEN (A-Z) ===");
        for (Laptop lt : list) {
            lt.output();
        }

        Collections.sort(list, new Comparator<Laptop>() {
            @Override
            public int compare(Laptop lt1, Laptop lt2) {

                return Double.compare(lt1.getPrice(), lt2.getPrice());
            }
        });

        Collections.reverse(list);

        System.out.println("=== SAP XEP THEO GIA GIAM DAN ===");
        for (Laptop lt : list) {
            lt.output();
        }
    }
}
