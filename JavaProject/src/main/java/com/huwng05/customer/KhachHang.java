/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.customer;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
public class KhachHang implements Comparable<KhachHang>{
    private String maso;
    private String hoTen;
    private LocalDate ngaySinh;
    private BigDecimal soDu;
    public static int soLuong;
    
    public KhachHang(String hoTen, String ngaySinh, BigDecimal soDu) throws CusException.ErrorCreateCustomer {
        if (this.soLuong >= Config.NUM_CUSTOMER) throw new CusException.ErrorCreateCustomer(
                    String.format("Error: Not create customer %s",Config.NUM_CUSTOMER));
        this.maso = String.format("KH-%04d",++this.soLuong);
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh,Config.DATE_FORMATTER);
        this.soDu = soDu;
    }
    
    public int tinhTuoi() {
        return (int) LocalDate.now().getYear() - this.ngaySinh.getYear();
    }

    @Override
    public int compareTo(KhachHang t) {
        return this.soDu.compareTo(t.soDu);
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%sVND\n",
                              this.maso,  
                              this.hoTen,
                              Config.DATE_FORMATTER.format(this.ngaySinh),
                              Config.BIG_FORMATTER.format(this.soDu));
        
    }

    public String getMaso() {
        return maso;
    }

    public void setMaso(String maso) {
        this.maso = maso;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public BigDecimal getSoDu() {
        return soDu;
    }

    public void setSoDu(BigDecimal soDu) {
        this.soDu = soDu;
    }
    
    
    
            
}
