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
public class Sach extends SanPham {
    private int soTrang;

    public Sach(String tenSanPham, String nhaSanXuat, BigDecimal giaBan, int soTrang) {
        super(tenSanPham, nhaSanXuat, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%5d trang\n", this.soTrang);
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    
}
