/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fpoly.lab3;

import java.util.Scanner;




/**
 *
 * @author Lenovo
 */
public class Trungbinhchia3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,dem=0,tong=0;
        double tb;
        System.out.print("Nhap n: ");
        n = sc.nextInt();
        
        if(n<=0)
            System.out.println("n phai la so nguyen duong");
        else if(n<3)
            System.out.println("Khong co so nao chia het cho 3");
        else {
            System.out.print("So chia het cho 3 la: ");
            for (i=1;i<n;i++){
                if(i%3 == 0){
                System.out.print(i+" ");
                dem=dem+1;
                tong = tong +i;
               }
            }
            System.out.println();
            tb = tong/dem;
            System.out.printf("Tong: %d\n",tong);
            System.out.printf("Trung binh cong: %.2f",tb);
        }
    }
    
}
