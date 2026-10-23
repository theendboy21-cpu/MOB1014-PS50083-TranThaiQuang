/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab8;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */

public class KiemTraMatKhau {

    public static void kiemTra(String pw) throws InvalidPasswordException {
        // Kiểm tra độ dài tối thiểu trước
        if (pw.length() < 8) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 8 ky tu");
        }

        int countUpper = 0;
        int countLower = 0;
        int countDigit = 0;
        int countSpecial = 0;
        String specialChars = "!@#$%^&*";

        // Dùng một vòng lặp duyệt từng ký tự của mật khẩu
        for (int i = 0; i < pw.length(); i++) {
            char c = pw.charAt(i);
            if (Character.isUpperCase(c)) {
                countUpper++;
            } else if (Character.isLowerCase(c)) {
                countLower++;
            } else if (Character.isDigit(c)) {
                countDigit++;
            } else if (specialChars.indexOf(c) >= 0) {
                countSpecial++;
            }
        }

        // Kiểm tra tuần tự các quy tắc còn lại
        if (countUpper < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu hoa");
        }
        if (countLower < 2) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 2 chu thuong");
        }
        if (countDigit < 3) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 3 chu so");
        }
        if (countSpecial < 1) {
            throw new InvalidPasswordException("Mat khau phai co it nhat 1 ky tu dac biet (!@#$%^&*)");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Nhap mat khau: ");
            String pw = sc.nextLine();

            try {
                kiemTra(pw);
                // Nếu không có exception nào bị ném ra, mật khẩu hợp lệ
                System.out.println("Mat khau hop le!");
                break; // Thoát vòng lặp
            } catch (InvalidPasswordException e) {
                System.out.println("Loi: " + e.getMessage());
            }
        }

        sc.close();
    }
}
