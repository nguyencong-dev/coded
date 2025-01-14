/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.covid19;

/**
 *
 * @author huwng05
 */
public class ForeignPeople extends People {
    private String hoChieu;
    private String quocTich;

    public ForeignPeople( String hoTen, String soDienThoai, String ngaySinh, 
            String hoChieu, String quocTich) {
        super(hoTen, soDienThoai, ngaySinh);
        this.hoChieu = hoChieu;
        this.quocTich = quocTich;
    }

    
}
