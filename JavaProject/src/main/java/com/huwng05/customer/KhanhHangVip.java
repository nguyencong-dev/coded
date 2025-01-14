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
public class KhanhHangVip extends KhachHang {
    LocalDate ngayHetHan;

    public KhanhHangVip( String hoTen, String ngaySinh, BigDecimal soDu, 
            String ngayHetHan) throws CusException.ErrorCreateCustomer {
        super(hoTen, ngaySinh, soDu);
        this.ngayHetHan = LocalDate.parse(ngayHetHan,Config.DATE_FORMATTER);
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%sVND\t%s\n",
                              this.getMaso(),  
                              this.getHoTen(),
                              Config.DATE_FORMATTER.format(this.getNgaySinh()),
                              Config.BIG_FORMATTER.format(this.getSoDu()),
                              Config.DATE_FORMATTER.format(this.ngayHetHan));
    }

    public LocalDate getNgayHetHan() {
        return ngayHetHan;
    }

    public void setNgayHetHan(LocalDate ngayHetHan) {
        this.ngayHetHan = ngayHetHan;
    }
}