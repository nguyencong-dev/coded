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
public class SanPham implements Comparable<SanPham>{
    private String maSanPham;
    private String tenSanPham;
    private String nhaSanXuat;
    private BigDecimal giaBan;
    public static int soLuong;
    {
        this.maSanPham = String.format("SP-%04d",++soLuong);
    }

    public SanPham(String tenSanPham, String nhaSanXuat, BigDecimal giaBan) {
        this.tenSanPham = tenSanPham;
        this.nhaSanXuat = nhaSanXuat;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return String.format("%s\t%25s\t%-20s\t%10s\t",
                this.maSanPham,
                this.tenSanPham,
                this.nhaSanXuat,
                Config.MONEY_FORMATER.format(this.giaBan));
    }

    @Override
    public int compareTo(SanPham t) {
       return this.giaBan.compareTo(t.giaBan);
    }

    public String getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(String maSanPham) {
        this.maSanPham = maSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public BigDecimal getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(BigDecimal giaBan) {
        this.giaBan = giaBan;
    }
}
