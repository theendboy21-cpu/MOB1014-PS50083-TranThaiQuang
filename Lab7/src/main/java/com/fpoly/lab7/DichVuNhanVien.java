/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */

public class DichVuNhanVien {
    public static void main(String[] args) {
   
        EmployeeService service = new EmployeeServiceImpl();

      
        Employee e1 = new FullTimeEmployee("FT01", "Nguyen Van An", 12000000);
        Employee e2 = new PartTimeEmployee("PT01", "Tran Thi Binh", 80, 50000);
        Employee e3 = new FullTimeEmployee("FT02", "Le Van Cuong", 15500000);
        Employee e4 = new FullTimeEmployee("ft01", "Ngo Van Giang", 9000000);

        printAddResult(service.add(e1), e1.getId());
        printAddResult(service.add(e2), e2.getId());
        printAddResult(service.add(e3), e3.getId());
        printAddResult(service.add(e4), e4.getId());

      
        System.out.println(); 
        printSearchResult(service.findById("pt01"), "pt01");
        printSearchResult(service.findById("xx99"), "xx99");

     
        System.out.println("=== DANH SACH NHAN VIEN ===");
        for (Employee emp : service.getAll()) {
            System.out.printf("%s -> Luong: %.0f\n", emp.toString(), emp.getSalary());
        }
        System.out.printf("Tong luong: %.0f\n", service.getTotalSalary());
    }

    
    private static void printAddResult(boolean isSuccess, String id) {
        if (isSuccess) {
            System.out.printf("Them thanh cong: [%s]\n", id);
        } else {
            System.out.printf("Them that bai, trung ID: [%s]\n", id);
        }
    }

 
    private static void printSearchResult(Employee emp, String searchId) {
        if (emp != null) {
            System.out.printf("Tim thay: [%s]\n", emp.toString());
        } else {
            System.out.printf("Khong tim thay nhan vien [%s]\n", searchId);
        }
    }
}
