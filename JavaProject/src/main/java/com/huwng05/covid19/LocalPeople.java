/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.covid19;

/**
 *
 * @author huwng05
 */
public class LocalPeople extends People {
    private String cccd;

    public LocalPeople(String hoTen, String soDienThoai, String ngaySinh, String CCCD) {
        super(hoTen, soDienThoai, ngaySinh);
        this.cccd = CCCD;
    }
}
