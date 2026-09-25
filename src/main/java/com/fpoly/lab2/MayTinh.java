/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab2;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class MayTinh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        double a,b,kq=0;
        char op;
        System.out.print("Nhap a:  ");
        a = sc.nextDouble();
        System.out.print("Nhap b:  ");
        b = sc.nextDouble();
        System.out.print("Nhap phep toan: ");
        op = sc.next().charAt(0);
        
        switch (op){
            case '+':
                kq = a+b;
                break;
            case '-':
                kq = a-b;
                break;
            case '*':
                kq = a*b;
                break;
            case '/':
                if(b==0) System.out.print("Khong the chia cho 0 \n");
                else kq=a/b;
                break;
            default: System.out.print("Phep toan khong hop le\n");
        }
        System.out.printf("%.2f %c %.2f = %.2f",a,op,b,kq);
    }
}
