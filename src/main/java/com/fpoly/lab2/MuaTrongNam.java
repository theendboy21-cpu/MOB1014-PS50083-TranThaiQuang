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
public class MuaTrongNam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        int thang;
        String mua = "";
        System.out.print("Nhap thang: ");
        thang = sc.nextInt();
        
        switch (thang){
            case 1,2,3:
                mua = "Mua xuan";
                break;
                case 4,5,6:
                mua = "Mua ha";
                break;
                case 7,8,9:
                mua = "Mua thu";
                break;
                case 10,11,12:
                mua = "Mua dong";
                break;
                default: 
                    System.out.println("Thang nhap khong hop le");
                    return;
        }
        System.out.printf("Thang %d la mua &s",thang,mua);
        }
}
