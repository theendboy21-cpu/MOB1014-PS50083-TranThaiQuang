/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */


public class PartTimeEmployee extends Employee {
    
    private int workHours;
    private double salaryPerHour;

 
    public PartTimeEmployee(String id, String name, int workHours, double salaryPerHour) {
        super(id, name); 
        this.workHours = workHours;
        this.salaryPerHour = salaryPerHour;
    }

 
    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

  
    public double getSalaryPerHour() {
        return salaryPerHour;
    }

    public void setSalaryPerHour(double salaryPerHour) {
        this.salaryPerHour = salaryPerHour;
    }

   
    @Override
    public double getSalary() {
        return this.workHours * this.salaryPerHour;
    }

   
    @Override
    public String toString() {
        return String.format("PartTime [ID: %s, Name: %s, Work Hours: %d, Rate: %.1f, Total Salary: %.1f]", 
                id, name, workHours, salaryPerHour, getSalary());
    }
}
