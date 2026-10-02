/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab3;

import java.util.Scanner;
import java.util.Arrays;

/**
 *
 * @author Lenovo
 */
public class TimKiemSapXep {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, x;
        boolean timThay = false;

        do {
            System.out.print("Nhap vao so phan tu mang: ");
            n = sc.nextInt();
        } while (n <= 0);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("Nhap vao phan tu thu %d: ", i);
            a[i] = sc.nextInt();
        }
        System.out.print("Nhap vao so can tim: ");
        x = sc.nextInt();
        System.out.print("Vi tri cua x can tim la: ");
        for (int i = 0; i < n; i++) {
            if (x == a[i]) {
                System.out.print(i + " ");
                timThay = true;
            }
        }
        if (!timThay) {
            System.out.println("Khong tim thay");
        }
         System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if(a[i]<a[j]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
        }
        System.out.println("Mang giam dan (Bubble Sort): "+Arrays.toString(a));
        int[]b=Arrays.copyOf(a, n);
        Arrays.sort(b);
        System.out.println("Mang tang dan (Array Sort): "+Arrays.toString(b));
    }
}
