/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fpoly.asmcom108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {

    static ArrayList<SanPham> danhSachSP = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    
    static {
        // 5 Sản phẩm điện tử
        danhSachSP.add(new SanPhamDienTu("SP001", "Laptop Dell", 15000000, 5, "12 Thang"));
        danhSachSP.add(new SanPhamDienTu("SP002", "Dien thoai iPhone", 20000000, 10, "12 Thang"));
        danhSachSP.add(new SanPhamDienTu("SP003", "Tivi Sony", 12000000, 8, "24 Thang"));
        danhSachSP.add(new SanPhamDienTu("SP004", "May giat LG", 9000000, 4, "24 Thang"));
        danhSachSP.add(new SanPhamDienTu("SP005", "Tu lanh Panasonic", 11000000, 6, "12 Thang"));

        // 5 Sản phẩm tiêu dùng 
        danhSachSP.add(new SanPhamTieuDung("SP006", "Nuoc mam Nam Ngu", 45000, 100, 0.0, "12 Thang 2026"));
        danhSachSP.add(new SanPhamTieuDung("SP007", "Dau an Tuong An", 60000, 80, 0.05, "05 Thang 2025"));
        danhSachSP.add(new SanPhamTieuDung("SP008", "Gao ST25", 180000, 40, 0.1, "01 Thang 2025"));
        danhSachSP.add(new SanPhamTieuDung("SP009", "Mi Hao Hao", 110000, 200, 0.0, "08 Thang 2025"));
        danhSachSP.add(new SanPhamTieuDung("SP010", "Sua tuoi TH True Milk", 350000, 30, 0.15, "10 Thang 2024"));
    }
    
    public static void main(String[] args) {
        int chon;
        do {
            System.out.println("\n--- MENU QUAN LY SAN PHAM ---");
            System.out.println("1. Nhap thong tin san pham");
            System.out.println("2. Hien thi thong tin san pham");
            System.out.println("3. Cap nhat thong tin san pham");
            System.out.println("4. Tim kiem san pham");
            System.out.println("5. Xoa san pham trong danh sach");
            System.out.println("6. Sap xep danh sach san pham theo ten");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine(); // Xóa bộ nhớ đệm sau khi nhập số

            switch (chon) {
                case 1:
                    nhapSP();
                    break;
                case 2:
                    hienThiSP();
                    break;
                case 3:
                    capNhatSP();
                    break;
                case 4:
                    timKiemSP();
                    break;
                case 5:
                    xoaSP();
                    break;
                case 6:
                    sapXepTheoTen();
                    break;
                case 0:
                    System.out.println("Da thoat chương trinh.");
                    break;
                default:
                    System.out.println("Chuc nang không hop le!");
            }
        } while (chon != 0);
    }

    // Y1, Y9: Nhập & Đa hình
    public static void nhapSP() {
        System.out.print("Chon loai SP (1 - Dien tu, 2 - Tieu dung): ");
        int loai = sc.nextInt();
        sc.nextLine();

        SanPham sp;
        switch (loai) {
            case 1:
                sp = new SanPhamDienTu();
                break;
            case 2:
                sp = new SanPhamTieuDung();
                break;
            default:
                System.out.println("Loai khong hop le!");
                return;
        }

        sp.Nhap(sc);
        danhSachSP.add(sp);
        System.out.println("Them san pham thanh cong!");
    }

    // Y2: Hiển thị
    public static void hienThiSP() {
        if (danhSachSP.isEmpty()) {
            System.out.println("Danh sach trong!");
            return;
        }
        System.out.println("\n--- DANH SACH SAN PHAM ---");
        for (SanPham sp : danhSachSP) {
            sp.Xuat();
            System.out.println(); 
        }
    }

    // Y4: Cập nhật
    public static void capNhatSP() {
        System.out.print("Nhap ma san pham can cap nhat: ");
        String ma = sc.nextLine();
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                System.out.println("Nhap thong tin moi cho san pham nay:");
                sp.Nhap(sc);
                System.out.println("Cap nhat thanh cong!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham co ma: " + ma);
    }

    // Y6: Tìm kiếm
    public static void timKiemSP() {
        System.out.print("Nhap ma san pham can tim: ");
        String ma = sc.nextLine();
        for (SanPham sp : danhSachSP) {
            if (sp.getMaSP().equalsIgnoreCase(ma)) {
                sp.Xuat();
                System.out.println();
                return;
            }
        }
        System.out.println("Khong tim thay san pham!");
    }

    // Y7: Xóa
    public static void xoaSP() {
        System.out.print("Nhap ma san pham can xoa: ");
        String ma = sc.nextLine();
        for (int i = 0; i < danhSachSP.size(); i++) {
            if (danhSachSP.get(i).getMaSP().equalsIgnoreCase(ma)) {
                danhSachSP.remove(i);
                System.out.println("Da xoa san pham!");
                return;
            }
        }
        System.out.println("Khong tim thay san pham!");
    }

    // Y8: Sắp xếp
    public static void sapXepTheoTen() {
        Collections.sort(danhSachSP, new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                return sp1.getTenSP().compareToIgnoreCase(sp2.getTenSP());
            }
        });
        System.out.println("Da sap xep danh sach theo ten (A-Z). Chon chuc nang 2 de xem.");
    }
}
