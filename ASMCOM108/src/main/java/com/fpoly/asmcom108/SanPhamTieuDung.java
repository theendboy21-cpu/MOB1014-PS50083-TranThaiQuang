/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fpoly.asmcom108;

import java.util.Scanner;

public class SanPhamTieuDung extends SanPham {

    private double giamGia;
    private String hanSuDung;

    public SanPhamTieuDung() {
        super();
    }

    public SanPhamTieuDung(String maSP, String tenSP, double dongGia, int soLuong, double giamGia, String hanSuDung) {
        super(maSP, tenSP, dongGia, soLuong);
        this.giamGia = giamGia;
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc);
        System.out.print("Nhap phan tram giam gia (VD: 0.1 cho 10%): ");
        this.giamGia = sc.nextDouble();
        sc.nextLine(); // Xóa bộ nhớ đệm sau khi nhập số
        System.out.print("Nhap han su dung: ");
        this.hanSuDung = sc.nextLine();
    }

    @Override
    public double thanhTien() {
        // Ghi đè phương thức thanhTien tính thêm giảm giá
        double tienGoc = super.thanhTien();
        return tienGoc - (tienGoc * giamGia);
    }

    @Override
    public void Xuat() {
        super.Xuat();
        System.out.println(" | Giam gia: " + (this.giamGia * 100) + "% | Han su dung: " + this.hanSuDung);
    }
}
