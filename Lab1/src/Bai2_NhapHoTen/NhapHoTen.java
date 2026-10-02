/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2_NhapHoTen;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NhapHoTen {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho va ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinh = sc.nextInt();
        System.out.println("Ten: " + hoTen);
        System.out.printf("Tuoi: %d", 2026 - namSinh);
    }
}
