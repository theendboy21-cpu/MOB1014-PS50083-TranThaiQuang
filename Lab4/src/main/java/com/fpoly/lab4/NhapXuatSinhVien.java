/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab4;
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class NhapXuatSinhVien {



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student sv1 = new Student();  
        Student sv2 = new Student();

        System.out.println("--- Nhap sinh vien 1 ---");
        sv1.input(sc);
        System.out.println("--- Nhap sinh vien 2 ---");
        sv2.input(sc);

        System.out.println("--- Danh sach ---");
        sv1.output();
        sv2.output();

        Student sv3 = sv1;          
        sv3.name = "Test";
        sv1.output();               
    
        sc.close();
    }
}
