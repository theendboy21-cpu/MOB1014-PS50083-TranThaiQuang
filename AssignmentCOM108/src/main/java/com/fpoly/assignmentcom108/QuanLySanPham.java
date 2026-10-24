/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fpoly.assignmentcom108;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    static ArrayList<SanPham> danhSachSP = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

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
                case 1: nhapSP(); break;
                case 2: hienThiSP(); break;
                case 3: capNhatSP(); break;
                case 4: timKiemSP(); break;
                case 5: xoaSP(); break;
                case 6: sapXepTheoTen(); break;
                case 0: System.out.println("Da thoat chương trinh."); break;
                default: System.out.println("Chuc nang không hop le!");
            }
        } while (chon != 0);
    }

    // Y1, Y9: Nhập & Đa hình
    public static void nhapSP() {
        System.out.print("Chon loai SP (1 - Dien tu, 2 - Tieu dung): ");
        int loai = sc.nextInt();
        sc.nextLine();
        
        SanPham sp;
        if (loai == 1) {
            sp = new SanPhamDienTu();
        } else if (loai == 2) {
            sp = new SanPhamTieuDung();
        } else {
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
        System.out.println("Da sap xep danh sach theo ten (A-Z)");
    }
}