/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab8;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Lenovo
 */

public class KiemTraSinhVien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id, name, phone, email;

        // 1. Nhập và kiểm tra ID
        do {
            System.out.print("Nhap Ma SV: ");
            id = sc.nextLine();
            if (!id.matches("^SV[0-9]{3}$")) {
                System.out.println("Ma SV phai co dang SVxxx (x la chu so)");
            } else {
                break;
            }
        } while (true);

        // 2. Nhập và kiểm tra Họ tên
        do {
            System.out.print("Nhap Ho ten: ");
            name = sc.nextLine();
            if (!name.matches("^[a-zA-Z ]+$")) {
                System.out.println("Ho ten chi duoc chua chu cai va khoang trang");
            } else {
                break;
            }
        } while (true);

        // 3. Nhập và kiểm tra Số điện thoại (sử dụng Pattern và Matcher)
        Pattern phonePattern = Pattern.compile("^0[0-9]{9}$");
        do {
            System.out.print("Nhap So dien thoai: ");
            phone = sc.nextLine();
            Matcher phoneMatcher = phonePattern.matcher(phone);
            if (!phoneMatcher.matches()) {
                System.out.println("So dien thoai phai bat dau bang 0 va co 10 chu so");
            } else {
                break;
            }
        } while (true);

        // 4. Nhập và kiểm tra Email
        do {
            System.out.print("Nhap Email: ");
            email = sc.nextLine();
            if (!email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$")) {
                System.out.println("Email khong dung dinh dang");
            } else {
                break;
            }
        } while (true);

        // In kết quả
        System.out.println("\n=== THONG TIN SINH VIEN HOP LE ===");
        System.out.println("Ma SV: " + id);
        System.out.println("Ho ten: " + name);
        System.out.println("So dien thoai: " + phone);
        System.out.println("Email: " + email);

        sc.close();
    }
}