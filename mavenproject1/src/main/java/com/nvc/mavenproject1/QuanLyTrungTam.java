/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

import java.time.LocalDate;
/**
 *
 * @author ASUS
 */
public class QuanLyTrungTam {

    private static int maHV = 0;
    private String hoTen, queQuan;
    private LocalDate date;
    private double diemToan, diemVan, diemAnh;

    public QuanLyTrungTam() {
        maHV++;
        hoTen = null;
        queQuan = null;
        date = LocalDate.now();
    }
}
