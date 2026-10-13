/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.fpoly.demoarraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Slide5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> dsSinhVien = new ArrayList<>();
        dsSinhVien.add(new SinhVien("PS01", "An", 7.8, true));
        dsSinhVien.add(new SinhVien("PS02", "Binh", 5.2, true));
        dsSinhVien.add(new SinhVien("PS03", "Quy", 9.8, true));
        dsSinhVien.add(new SinhVien("PS04", "Vy", 8.9, false));

//        do {
//            SinhVien sv = new SinhVien();
//            sv.nhap();
//            dsSinhVien.add(sv);
//            System.out.print("Co tiep tuc khong (c/k)");
//        } while (sc.nextLine().equals("k"));

        Comparableto<SinhVien> c = new Comparableto<SinhVien>() {
            @Override
            public int compareTo(SinhVien o) {
                return this.o1.getDiemTb().
            }
        }
       
        dsSinhVien.sort((o1, o2) -> {
            return o1.getDiemTB().compareTo(o2.getDiemTB());
        });
        //xuat
         System.out.println(String.format("%12s%20s%12s%12s", "Ma SV", "Ten SV", "Diem TB", "GioiTinh"));
        for (SinhVien SinhVien : dsSinhVien) {
            System.out.println(SinhVien);
        }
        //sau sap xep
         System.out.println(String.format("%12s%20s%12s%12s", "Ma SV", "Ten SV", "Diem TB", "GioiTinh"));
        for (SinhVien SinhVien : dsSinhVien) {
            System.out.println(SinhVien);
        }
    }
}




