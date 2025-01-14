/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.library;

import java.math.BigDecimal;

/**
 *
 * @author huwng05
 */
public class BangDia extends SanPham {
    private int thoiGian;

    public BangDia(String tenSanPham, String nhaSanXuat, BigDecimal giaBan, int thoiGian) {
        super(tenSanPham, nhaSanXuat, giaBan);
        this.thoiGian = thoiGian;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%5d phut\n", this.thoiGian);
    }

    public int getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(int thoiGian) {
        this.thoiGian = thoiGian;
    }
    
}
