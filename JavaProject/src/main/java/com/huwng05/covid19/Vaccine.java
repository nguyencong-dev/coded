/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.covid19;

/**
 *
 * @author huwng05
 */
public class Vaccine {
    private String ma;
    private String ten;
    private String xuatXu;
    private String soLuong;
    public static int num;
    {
        this.ma = String.format("VC-%04d", ++num);
    }

    public Vaccine(String ten, String xuatXu, String soLuong) {
        this.ten = ten;
        this.xuatXu = xuatXu;
        this.soLuong = soLuong;
    }
  
}
