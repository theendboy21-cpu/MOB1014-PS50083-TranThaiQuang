/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab4;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class KhoiTaoSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student sv1 = new Student("PS001", "Nguyen Van An", 19, 8.25);
        sv1.output();

        Student sv2 = new Student();
        sv2.output();

        sv2.input(sc);
        sv2.output();

        sc.close();
    }
}
