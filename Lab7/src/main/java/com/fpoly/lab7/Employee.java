/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */


public abstract class Employee {
    
    protected String id;
    protected String name;

 
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

   
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  
    public abstract double getSalary();
    
    @Override
    public abstract String toString();
}


