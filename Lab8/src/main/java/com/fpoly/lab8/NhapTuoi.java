/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab8;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

public class NhapTuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tuoi = 0;
        int lanNhap = 1;

        while (true) {
            try {
                System.out.print("Nhap tuoi: ");
                tuoi = sc.nextInt();

                if (tuoi <= 0) {
                    // Tự ném ngoại lệ nếu tuổi <= 0
                    throw new IllegalArgumentException("Tuoi phai lon hon 0");
                }
                
                // Nếu dữ liệu hợp lệ thì thoát vòng lặp
                break;

            } catch (InputMismatchException e) {
                System.out.println("Loi: Tuoi phai la so nguyen!");
                // Xóa chuỗi sai còn lưu trong bộ đệm của Scanner để tránh lặp vô hạn
                sc.nextLine(); 
            } catch (IllegalArgumentException e) {
                System.out.println("Loi: " + e.getMessage());
            } finally {
                // Khối finally luôn được thực thi dù có lỗi hay gọi lệnh break
                System.out.println("Da xu ly lan nhap thu " + lanNhap);
                lanNhap++;
            }
        }

        System.out.println("Ket thuc qua trinh nhap du lieu. Tuoi hop le: " + tuoi);
        sc.close();
    }
}