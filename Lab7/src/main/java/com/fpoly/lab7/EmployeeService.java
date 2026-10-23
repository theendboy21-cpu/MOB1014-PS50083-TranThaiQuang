/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

import java.util.List;

/**
 *
 * @author Lenovo
 */

public interface EmployeeService {

    boolean add(Employee e);

    Employee findById(String id);

    List<Employee> getAll();

    double getTotalSalary();
}
