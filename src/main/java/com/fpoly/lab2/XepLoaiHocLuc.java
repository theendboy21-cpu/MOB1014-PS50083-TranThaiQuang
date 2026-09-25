/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class XepLoaiHocLuc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double toan,ly,hoa,dtb;
        String xl;
        System.out.print("Nhap diem toan: ");
        toan = sc.nextDouble();
        System.out.print("Nhap diem ly: ");
        ly = sc.nextDouble();
        System.out.print("Nhap diem hoa: ");
        hoa = sc.nextDouble();
        if((toan<0 || toan>10) || (ly <0 || ly>10) || (hoa<0 || hoa>10)){
            System.out.print("Diem nhap khong hop le");
            return;
        } else dtb = (toan * 2 + ly + hoa)/4;
        if (dtb>=8) xl = "Gioi";
        else if(dtb>=6.5) xl = "Kha";
        else if(dtb>=5) xl = "Trung Binh";
        else xl = "Yeu";
        
        System.out.printf("Diem trung binh: %.2f\n",dtb);
        System.out.printf("Xep loai: %s\n",xl);
           
    }
}
