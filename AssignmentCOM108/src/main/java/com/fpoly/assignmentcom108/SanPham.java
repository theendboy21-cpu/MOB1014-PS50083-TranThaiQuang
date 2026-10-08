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
public class SanPham {
//Thuoc tinh
    private String maSP;
    private String tenSP;
    private double donGia;
    private int soLuong;

    // ===== Constructor =====
    public SanPham() {
        this.maSP = "";
        this.tenSP = "";
        this.donGia = 0;
        this.soLuong = 0;
    }

    public SanPham(String maSP, String tenSP, double donGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    // ===== Getter / Setter =====
    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public void setDonGia(double dg) {
        if (dg >= 0) {
            this.donGia = dg;
        }
    }

    public void setSoLuong(int sl) {
        if (sl >= 0) {
            this.soLuong = sl;
        }
    }

    // Kiem tra ma
    public static boolean hopLeMa(String ma) {
        return ma != null && ma.matches("SP\\d{3}");
    }

    //Nhap thong tin
    public void Nhap(Scanner sc) {
        while (true) {
            System.out.print("Nhap ma san pham (SPXXX): ");
            String ma = sc.nextLine().trim();
            if (hopLeMa(ma)) {
                this.maSP = ma.toUpperCase();
                break;
            }
            System.out.println("  -> Ma khong hop le! Vi du dung: SP001, SP123");
        }

        System.out.print("Nhap ten san pham: ");
        this.tenSP = sc.nextLine().trim();

        while (true) {
            System.out.print("Nhap don gia: ");
            try {
                double g = Double.parseDouble(sc.nextLine().trim());
                if (g < 0) {
                    System.out.println("  -> Don gia phai >= 0!");
                    continue;
                }
                this.donGia = g;
                break;
            } catch (NumberFormatException e) {
                System.out.println("  -> Vui long nhap so!");
            }
        }

        while (true) {
            System.out.print("Nhap so luong: ");
            try {
                int s = Integer.parseInt(sc.nextLine().trim());
                if (s < 0) {
                    System.out.println("  -> So luong phai >= 0!");
                    continue;
                }
                this.soLuong = s;
                break;
            } catch (NumberFormatException e) {
                System.out.println("  -> Vui long nhap so nguyen!");
            }
        }
    }

    // Hien thi thong tin
    public void Xuat() {
        System.out.printf("| %-8s | %-22s | %14.0f | %6d | %16.0f |%n",
                maSP, tenSP, donGia, soLuong, thanhTien());
    }

    //Thanh tien
    public double thanhTien() {
        return soLuong * donGia;
    }

    // Cap nhat
    public void capNhat(Scanner sc) {
        System.out.println("--- Cap nhat " + maSP + " ---");
        System.out.println("Ten hien tai : " + tenSP);
        System.out.print("Nhap ten moi (Enter de giu nguyen): ");
        String s = sc.nextLine().trim();
        if (!s.isEmpty()) {
            this.tenSP = s;
        }

        System.out.println("Don gia hien tai : " + donGia);
        System.out.print("Nhap don gia moi (Enter de giu nguyen): ");
        s = sc.nextLine().trim();
        if (!s.isEmpty()) {
            try {
                double g = Double.parseDouble(s);
                if (g >= 0) {
                    this.donGia = g;
                } else {
                    System.out.println("  -> Bo qua: don gia am.");
                }
            } catch (NumberFormatException e) {
                System.out.println("  -> Bo qua: khong phai so.");
            }
        }

        System.out.println("So luong hien tai : " + soLuong);
        System.out.print("Nhap so luong moi (Enter de giu nguyen): ");
        s = sc.nextLine().trim();
        if (!s.isEmpty()) {
            try {
                int sl = Integer.parseInt(s);
                if (sl >= 0) {
                    this.soLuong = sl;
                } else {
                    System.out.println("  -> Bo qua: so luong am.");
                }
            } catch (NumberFormatException e) {
                System.out.println("  -> Bo qua: khong phai so nguyen.");
            }
        }
        System.out.println("Cap nhat xong!");
    }

}
