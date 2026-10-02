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
public class XulyMang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,tong=0;
        do {
            System.out.print("nhap so phan tu mang: ");
            n=sc.nextInt();
        } while (n<=0);
        int[]a=new int[n];
        int max = a[0];
        for(int i=0;i<n;i++){
            System.out.printf("Nhap vao phan tu thu %d cua mang: ",i+1);
            a[i]=sc.nextInt();
        }
        System.out.print("Mang vua nhap la: ");
        for(int so : a){
            System.out.print(so+" ");
        }
        System.out.println();
        System.out.print("Cac phan tu chan: ");
        for(int so : a){
            if(so%2==0){
                System.out.print(so+" ");
            }
        }
        System.out.println();
        System.out.print("Tong cac so chia het cho 4: ");
        for(int so: a){
            if(so%4==0)
                tong = tong +so;
                }
        System.out.print(tong);
        System.out.println();
        System.out.print("Gia tri lon nhat: ");
        for(int so: a){
            if(so>max){
                max=so;
            }
        }
        System.out.print(max);
    }
}
