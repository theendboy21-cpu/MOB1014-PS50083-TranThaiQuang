/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */


import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
 
    private List<Employee> list = new ArrayList<>();

    @Override
    public boolean add(Employee e) {
      
        for (Employee emp : list) {
            if (emp.getId().equalsIgnoreCase(e.getId())) {
                return false; 
            }
        }
        list.add(e);
        return true; 
    }

    @Override
    public Employee findById(String id) {
      
        for (Employee emp : list) {
            if (emp.getId().equalsIgnoreCase(id)) {
                return emp;
            }
        }
        return null; 
    }

    @Override
    public List<Employee> getAll() {
        return this.list;
    }

    @Override
    public double getTotalSalary() {
        double total = 0;
        for (Employee emp : list) {
            total += emp.getSalary();
        }
        return total;
    }
}
