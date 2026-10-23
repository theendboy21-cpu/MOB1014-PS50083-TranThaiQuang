/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */

public class FullTimeEmployee extends Employee {
    
    private double basicSalary;

    // Hàm tạo đầy đủ tham số
    public FullTimeEmployee(String id, String name, double basicSalary) {
        super(id, name);
        this.basicSalary = basicSalary;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    @Override
    public double getSalary() {
        return this.basicSalary;
    }

    @Override
    public String toString() {
        return String.format("FullTime [ID: %s, Name: %s, Basic Salary: %.1f, Total Salary: %.1f]", 
                id, name, basicSalary, getSalary());
    }
}

