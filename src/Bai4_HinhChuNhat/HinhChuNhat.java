/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai4_HinhChuNhat;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class HinhChuNhat {

        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;
        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = sc.nextDouble();
        double cv = 2 * (chieuDai + chieuRong);
        double dt = chieuDai * chieuRong;
        System.out.printf("Chu vi hinh chu nhat: %.2f\n",cv);
        System.out.printf("Dien tich hinh chu nhat: %.2f\n",dt);
    }
}
