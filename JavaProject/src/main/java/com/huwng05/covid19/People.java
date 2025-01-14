/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.covid19;

import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
public abstract class People {
    protected String hoTen;
    protected String soDienThoai;
    protected LocalDate ngaySinh;
  
    public People(String hoTen, String soDienThoai, String ngaySinh) {
        this.hoTen = hoTen;
        this.soDienThoai = soDienThoai;
        this.ngaySinh = LocalDate.parse(ngaySinh, Config.DATE_FORMATTER);
    }
    
}
