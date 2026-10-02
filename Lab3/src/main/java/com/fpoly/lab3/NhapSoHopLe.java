/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab3;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class NhapSoHopLe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int so;
        int count = 0;
        do {
            System.out.print("Nhap so: ");
            so = sc.nextInt();
            if (so < 0 || so % 3 != 0 || so % 5 != 0) {
                System.out.println("So khong hop le, moi nhap lai\n");
                count++;
            } else {
                count++;
                System.out.printf("%d hop le sau %d lan nhap", so, count);
            }
        } while (!(so > 0 && so % 3 == 0 && so % 5 == 0));
    }
}
