/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.demosilde7;

/**
 *
 * @author Lenovo
 */
public class SinhVienIT extends SinhVien {

    private Double java;
    private Double vuejs;
    @Override
    protected Double tinhDiemTB(){
        return (java + vuejs)/2;
    } 

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append("SinhVienIT{");
        sb.append("java=").append(java);
        sb.append(", vuejs=").append(vuejs);
        sb.append('}');
        return sb.toString();
    }
    
}
