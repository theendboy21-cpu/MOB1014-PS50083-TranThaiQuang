/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
/**
 *
 * @author Lenovo
 */



public class QuanLyNhanVien {
    public static void main(String[] args) {
     
        List<Employee> list = new ArrayList<>();

        list.add(new FullTimeEmployee("FT01", "Nguyen Van An", 12000000));
        list.add(new PartTimeEmployee("PT01", "Tran Thị Binh", 80, 50000));
        list.add(new FullTimeEmployee("FT02", "Le Van Cuong", 15500000));
        list.add(new PartTimeEmployee("PT02", "Pham Thi Dung", 120, 60000));
        list.add(new PartTimeEmployee("PT03", "Hoang Van Em", 200, 90000));

        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee e : list) {
       
            System.out.printf("%s -> Luong: %.0f\n", e.toString(), e.getSalary());
        }

    
        double totalSalary = 0;
        for (Employee e : list) {
            totalSalary += e.getSalary();
        }
        System.out.printf("Tong quy luong: %.0f\n", totalSalary);

        Employee maxSalaryEmployee = list.get(0);
        for (Employee e : list) {
            if (e.getSalary() > maxSalaryEmployee.getSalary()) {
                maxSalaryEmployee = e;
            }
        }
        System.out.printf("Nhan vien luong cao nhat: %s -> Luong: %.0f\n", 
                maxSalaryEmployee.toString(), maxSalaryEmployee.getSalary());

        Collections.sort(list, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
            
                return Double.compare(e2.getSalary(), e1.getSalary());
            }
        });
        
        System.out.println("=== SAP XEP THEO LUONG GIAM DAN ===");
        for (Employee e : list) {
            System.out.printf("%s -> Luong: %.0f\n", e.toString(), e.getSalary());
        }
    }
}

