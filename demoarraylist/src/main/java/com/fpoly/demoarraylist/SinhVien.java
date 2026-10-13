/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.demoarraylist;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class SinhVien {

    private String maSV;
    private String tenSV;
    private Double diemTB;
    private boolean gioiTinh;

    public SinhVien() {
    }

    public SinhVien(String maSV, String tenSV, double diemTB, boolean gioiTinh) {
        this.maSV = maSV;
        this.tenSV = tenSV;
        this.diemTB = diemTB;
        this.gioiTinh = gioiTinh;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public Double getDiemTB() {
        return diemTB;
    }

    public boolean isGioiTinh() {
        return gioiTinh;
    }
    
    public String getGioiTinh(){
        return gioiTinh?"Nam":"Nu";
    }
    
    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    public void setDiemTB(Double diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
//        return "SinhVien{" + "tenSV=" + tenSV + ", diemTB=" + diemTB + '}';
        return String.format("%12s%20s%8.2f%8s", this.maSV, this.tenSV, this.diemTB, this.getGioiTinh());
    }

    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap ma sv: ");
        this.maSV = sc.nextLine();
        System.out.print("Ten sinh vien: ");
        this.tenSV = sc.nextLine();
        System.out.print("Nhap diem Tb sv: ");
        this.diemTB = sc.nextDouble();
        System.out.print("Nhap gioi tinh sinh vien: ");
        this.gioiTinh = sc.nextBoolean();
    }

}
