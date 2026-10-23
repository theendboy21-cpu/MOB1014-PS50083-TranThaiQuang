/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Lenovo
 */


public class ThanhToanDemo {
    public static void main(String[] args) {
    
        double[] donHang = {100000, 250000, 1000000};

        List<Payment> methods = new ArrayList<>();
        methods.add(new CashPayment()); 
        methods.add(new CardPayment()); 

        for (double price : donHang) {
       
            double cashAmount = methods.get(0).pay(price);
            double cardAmount = methods.get(1).pay(price);

            System.out.printf("Don hang %.0f: Tien mat = %.0f | The = %.0f\n", 
                    price, cashAmount, cardAmount);
        }
    }
}
