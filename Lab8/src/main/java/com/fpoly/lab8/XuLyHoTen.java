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

public class XuLyHoTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập vào họ tên
        String hoTen = sc.nextLine();
        
        // Xóa khoảng trắng đầu và cuối chuỗi
        String trimmed = hoTen.trim();
        
        // Kiểm tra chuỗi rỗng sau khi trim
        if (trimmed.isEmpty()) {
            System.out.println("Ho ten khong duoc de trong");
            return;
        }
        
        // 1. In chuỗi sau trim kèm số ký tự
        System.out.println("Sau trim: " + trimmed + " (" + trimmed.length() + " ky tu)");
        
        // 2. Thay mọi chuỗi nhiều khoảng trắng liên tiếp bằng một khoảng trắng
        String normalizedSpace = trimmed.replaceAll("\\s+", " ");
        System.out.println("Chuan hoa khoang trang: " + normalizedSpace);
        
        // 3. Chuyển toàn bộ họ tên sang chữ IN HOA
        String upperCase = normalizedSpace.toUpperCase();
        System.out.println("In hoa: " + upperCase);
        
        // 4. Tách họ tên thành mảng các từ và in số từ
        String[] words = normalizedSpace.split(" ");
        System.out.println("So tu: " + words.length);
        
        // 5. Viết hoa chữ cái đầu mỗi từ, các chữ còn lại viết thường
        StringBuilder hoTenChuan = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String w = words[i];
            String formattedWord = w.substring(0, 1).toUpperCase() + w.substring(1).toLowerCase();
            hoTenChuan.append(formattedWord);
            if (i < words.length - 1) {
                hoTenChuan.append(" ");
            }
        }
        System.out.println("Ho ten chuan: " + hoTenChuan.toString());
        
        sc.close();
    }
}