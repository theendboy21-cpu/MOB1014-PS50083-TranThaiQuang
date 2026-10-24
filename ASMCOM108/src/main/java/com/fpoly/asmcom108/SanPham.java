/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fpoly.asmcom108;


import java.util.Scanner;
import java.util.regex.Pattern;

public class SanPham {

    protected String maSP;
    protected String tenSP;
    protected double dongGia;
    protected int soLuong;

    public SanPham() {
    }

    public SanPham(String maSP, String tenSP, double dongGia, int soLuong) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.dongGia = dongGia;
        this.soLuong = soLuong;
    }

    // Truyền Scanner vào để tránh lỗi trôi dòng
    public void Nhap(Scanner sc) {
        // Y5: Bắt lỗi mã sản phẩm định dạng SPXXX (VD: SP001)
        while (true) {
            System.out.print("Nhap ma san pham (Dinh dang SPXXX): ");
            maSP = sc.nextLine();
            if (Pattern.matches("^SP\\d{3}$", maSP)) {
                break;
            }
            System.out.println("Loi: Ma san pham phai có dang SPXXX (X la so). Vui long nhap lai!");
        }

        System.out.print("Nhap ten san pham: ");
        tenSP = sc.nextLine();

        System.out.print("Nhap don gia: ");
        dongGia = sc.nextDouble();

        System.out.print("Nhap so luong: ");
        soLuong = sc.nextInt();
        sc.nextLine(); // Xóa bộ nhớ đệm (Enter) sau khi nhập số để không bị trôi lệnh
    }

    public void Xuat() {
        System.out.printf("Ma SP: %s | Ten SP: %s | Don gia: %.2f | So luong: %d | Thanh tien: %.2f",
                maSP, tenSP, dongGia, soLuong, thanhTien());
    }

    // Y3: Tính thành tiền
    public double thanhTien() {
        return this.soLuong * this.dongGia;
    }

    public String getMaSP() {
        return maSP;
    }

    public String getTenSP() {
        return tenSP;
    }
}
