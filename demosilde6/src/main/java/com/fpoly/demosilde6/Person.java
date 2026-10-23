/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.demosilde6;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Person {

    private String ID;
    private String name;
    private Date birthday;

    public Person(){}
    
    public Person(String ID, String name, Date birthday) {
        this.ID = ID;
        this.name = name;
        this.birthday = birthday;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Person{");
        sb.append("ID=").append(ID);
        sb.append(", name=").append(name);
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
    
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Input ID: ");
        this.ID = sc.nextLine();
        System.out.print("Input name: ");
        this.name = sc.nextLine();
        System.out.print("Input birthday: ");
       
    }
    
}
