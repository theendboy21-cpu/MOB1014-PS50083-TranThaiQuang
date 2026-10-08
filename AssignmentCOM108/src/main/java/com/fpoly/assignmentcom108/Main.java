/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.assignmentcom108;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Main {

    // Menu 
    static void menu() {
        System.out.println();
        System.out.println("===== QUAN LY SAN PHAM (Giai doan 1) =====");
        System.out.println("1. Them san pham");
        System.out.println("2. Hien thi danh sach");
        System.out.println("3. Tim kiem san pham (theo ma)");
        System.out.println("4. Cap nhat san pham");
        System.out.println("5. Xoa san pham");
        System.out.println("6. Sap xep danh sach theo ten");
        System.out.println("7. Thoat");
        System.out.print("Chuc nang chon: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySanPham ql = new QuanLySanPham();

        // Dữ liệu mẫu để chạy thử ngay
        // ql.them(new SanPham("SP001", "Loa Bluetooth", 890000, 20));
        //ql.them(new SanPham("SP002", "Ban phim co", 450000, 35));
        //ql.them(new SanPham("SP003", "Chuot khong day", 250000, 50));
        while (true) {
            menu();
            String c = sc.nextLine().trim();
            switch (c) {
                case "1":
                    ql.them(sc);
                    break;
                case "2":
                    ql.hienThi();
                    break;
                case "3":
                    ql.timKiemMenu(sc);
                    break;
                case "4":
                    ql.sua(sc);
                    break;
                case "5":
                    ql.xoa(sc);
                    break;
                case "6":
                    ql.sapXepTheoTen();
                    break;
                case "7":
                    System.out.println("Tam biet!");
                    sc.close();
                    return;
                default:
                    System.out.println("Nhap 1-7 thoi ban!");
            }
        }
    }
}
