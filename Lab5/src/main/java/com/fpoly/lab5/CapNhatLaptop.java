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
public class CapNhatLaptop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Laptop> list = new ArrayList<>();

        list.add(new Laptop("LT01", "Dell Inspiron 15", "Van phong", 15500000, 10));
        list.add(new Laptop("LT02", "Asus TUF Gaming F15", "Gaming", 22900000, 5));
        list.add(new Laptop("LT03", "MacBook Air M2", "Van phong", 24900000, 8));
        list.add(new Laptop("LT04", "Lenovo Legion 5", "Gaming", 32500000, 0));
        list.add(new Laptop("LT05", "HP Pavilion 14", "Van phong", 17800000, 0));

        System.out.print("Nhap ID can sua: ");
        String idSua = sc.nextLine();
        System.out.print("Nhap ten moi: ");
        String tenMoi = sc.nextLine();

        boolean timThayId = false;
        for (Laptop lt : list) {

            if (lt.getId().equalsIgnoreCase(idSua)) {
                lt.setName(tenMoi); 
                System.out.println("Da cap nhat laptop " + idSua);
                timThayId = true;
                break;
            }
        }

        if (!timThayId) {
            System.out.println("Khong tim thay laptop co ID " + idSua);
        }

        int soLuongDaXoa = 0;

        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).getQuantity() == 0) {
                list.remove(i);
                soLuongDaXoa++;
            }
        }
        System.out.println("Da xoa " + soLuongDaXoa + " laptop het hang");

        System.out.println("=== DANH SACH SAU CAP NHAT (" + list.size() + " may) ===");
        for (Laptop lt : list) {
            lt.output();
        }

        sc.close();
    }
}
