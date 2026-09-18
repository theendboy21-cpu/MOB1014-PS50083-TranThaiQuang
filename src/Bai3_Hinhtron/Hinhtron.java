/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3_Hinhtron;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Hinhtron {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.14;// final la khai bao hang so vi PI trong toan hoc la hang so
        System.out.print("Nhap do dai ban kinh: ");
         double banKinh = sc.nextDouble();
        double cv = 2 * PI * banKinh;
        double dt = banKinh * PI * banKinh;
        System.out.printf("Chu vi hinh tron: %.2f\n",cv);
        System.out.printf("Dien tich hinh tron: %.2f\n",dt);
    }
}