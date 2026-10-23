/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.lab7;

/**
 *
 * @author Lenovo
 */


public class CardPayment implements Payment {
    @Override
    public double pay(double amount) {
        // Thẻ = (amount * 0.95) + (amount * 0.95) * TAX
        double discountedAmount = amount * 0.95;
        return discountedAmount + (discountedAmount * TAX);
    }
}


