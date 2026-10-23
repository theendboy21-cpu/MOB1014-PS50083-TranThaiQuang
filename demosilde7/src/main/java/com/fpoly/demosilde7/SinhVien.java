/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fpoly.demosilde7;

/**
 *
 * @author Lenovo
 */
public abstract class SinhVien {

    private String maSV;
    private String tenSV;

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTenSV() {
        return tenSV;
    }

    public void setTenSV(String tenSV) {
        this.tenSV = tenSV;
    }

    

    protected abstract Double tinhDiemTB();
    public String xepLoai(){
        if(tinhDiemTB()>=8)
            return "Gioi";
        else if(tinhDiemTB()>=6.5)
            return "Kha";
        else if(tinhDiemTB()>=5)
            return "TB";
        else return "Yeu";
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
      
        sb.append("SinhVien{");
        sb.append("maSV=").append(maSV);
        sb.append(", tenSV=").append(tenSV);
        String s = String.format("%.1f",tinhDiemTB());
        sb.append("diem TB=").append(s);
        sb.append(", xep loai=").append(xepLoai());
        sb.append('}');
        return sb.toString();
    }
    
}
