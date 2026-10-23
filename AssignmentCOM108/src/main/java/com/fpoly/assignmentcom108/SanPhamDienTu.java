/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.fpoly.assignmentcom108;

import java.util.Scanner;

public class SanPhamDienTu extends SanPham {
    private String ngayBaoHanh;

    public SanPhamDienTu() {
        super();
    }

    public SanPhamDienTu(String maSP, String tenSP, double dongGia, int soLuong, String ngayBaoHanh) {
        super(maSP, tenSP, dongGia, soLuong);
        this.ngayBaoHanh = ngayBaoHanh;
    }

    @Override
    public void Nhap(Scanner sc) {
        super.Nhap(sc); // Gọi hàm nhập của lớp cha
        System.out.print("Nhap thoi gian ngay bao hanh: ");
        this.ngayBaoHanh = sc.nextLine();
    }

    @Override
    public void Xuat() {
        super.Xuat(); 
        System.out.println(" | Bao hanh: " + this.ngayBaoHanh);
    }
    
    public String getBaoHanh() {
        return this.ngayBaoHanh;
    }
}