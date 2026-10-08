/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.assignmentcom108;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class QuanLySanPham {

    private final ArrayList<SanPham> ds = new ArrayList<>();

    //Tim theo ma
    public int timKiem(String ma) {
        for (int i = 0; i < ds.size(); i++) {
            if (ds.get(i).getMaSP().equalsIgnoreCase(ma)) {
                return i;
            }
        }
        return -1;
    }

    // Them san pham
    public void them(Scanner sc) {
        SanPham sp = new SanPham();
        sp.Nhap(sc);
        if (timKiem(sp.getMaSP()) != -1) {
            System.out.println("Ma " + sp.getMaSP() + " da ton tai -> Khong them!");
            return;
        }
        ds.add(sp);
        System.out.println("Da them " + sp.getMaSP());
    }

    // Them san pham tu constructor
    public boolean them(SanPham sp) {
        if (timKiem(sp.getMaSP()) != -1) {
            System.out.println("Ma " + sp.getMaSP() + " da ton tai!");
            return false;
        }
        ds.add(sp);
        return true;
    }

    // Cap nhat
    public void sua(Scanner sc) {
        System.out.print("Nhap ma can sua: ");
        int i = timKiem(sc.nextLine().trim());
        if (i == -1) {
            System.out.println("Khong tim thay!");
            return;
        }
        ds.get(i).capNhat(sc);
    }

    // Xoa
    public void xoa(Scanner sc) {
        System.out.print("Nhap ma can xoa: ");
        int i = timKiem(sc.nextLine().trim());
        if (i == -1) {
            System.out.println("Khong tim thay!");
            return;
        }
        System.out.print("Xac nhan xoa " + ds.get(i).getMaSP() + "? (y/n): ");
        if (sc.nextLine().trim().equalsIgnoreCase("y")) {
            System.out.println("Da xoa " + ds.remove(i).getMaSP());
        } else {
            System.out.println("Huy.");
        }
    }

    // Xap xep a den z
    public void sapXepTheoTen() {
        if (ds.size() < 2) {
            System.out.println("Chua du 2 san pham de sap xep.");
            return;
        }
        ds.sort(Comparator.comparing(SanPham::getTenSP, String.CASE_INSENSITIVE_ORDER));
        System.out.println("Da sap xep theo ten.");
    }

    //In danh sach
    public void hienThi() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach rong!");
            return;
        }
        System.out.println("+----------+------------------------+----------------+--------+------------------+");
        System.out.printf("| %-8s | %-22s | %14s | %6s | %16s |%n",
                "MaSP", "TenSP", "DonGia", "SL", "ThanhTien");
        System.out.println("+----------+------------------------+----------------+--------+------------------+");
        double tong = 0;
        for (SanPham sp : ds) {
            sp.Xuat();
            tong += sp.thanhTien();
        }
        System.out.println("+----------+------------------------+----------------+--------+------------------+");
        System.out.printf("So luong loai SP: %d | Tong gia tri kho: %.0f%n", ds.size(), tong);
    }

    // Tim menu
    public void timKiemMenu(Scanner sc) {
        System.out.print("Nhap ma can tim: ");
        int i = timKiem(sc.nextLine().trim());
        if (i == -1) {
            System.out.println("Khong tim thay san pham nao.");
            return;
        }
        System.out.println("Tim thay:");
        System.out.printf("| %-8s | %-22s | %14s | %6s | %16s |%n",
                "MaSP", "TenSP", "DonGia", "SL", "ThanhTien");
        ds.get(i).Xuat();
    }

}
