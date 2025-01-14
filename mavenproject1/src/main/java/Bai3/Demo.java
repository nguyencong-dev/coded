/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author admin
 */
public class Demo {

    public static void main(String[] args) {
        QuanLyDanhSach ql = new QuanLyDanhSach();
        System.out.print("====================================\n");
        SanPham s1 = new Sach("OOPs", "OU Book", "OU", 40, 10);
        SanPham s2 = new Sach("CSDL", "OU Book", "OU", 30, 20);
        SanPham s3 = new Sach("MMT", "OU Book", "OU", 20, 50);
        SanPham s4 = new Sach("OOP", "OU Book", "OU", 50, 90);
        SanPham s5 = new Sach("CTDL", "OU Book", "OU", 10, 110);
        ql.them(s1, s2, s3, s4, s5);
        ql.hienThi();
        System.out.print("====================================\n");
        System.out.println("=====tu khoa");
        ql.timKiem("M").forEach(s -> System.out.println(s));
        System.out.println("=====class");
        ql.timKiem("Bai3.Sach").forEach(s -> System.out.println(s));
        System.out.print("====================================\n");
        ql.sapXep();
        ql.hienThi();
        System.out.print("====================================\n");
        ql.capNhat(2);
        ql.hienThi();
        System.out.print("====================================\n");
    }
}
