/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        PhanSo[] arr = new PhanSo[3];
//        System.out.println("khoi tao phan tu trong mang:");
//        for (int i = 0; i < 3; i++) {
//            System.out.printf("nhap vao tu so cua phan so %d: ", i + 1);
//            int tu = sc.nextInt();
//            System.out.printf("nhap vao mau so cua phan so %d: ", i + 1);
//            int mau = sc.nextInt();
//            arr[i] = new PhanSo(tu, mau);
//        }
//        PhanSo sum = new PhanSo();
//        for (var x : arr) {
//            x.hienThi();
//            sum = sum.cong(x);
//        }
//        System.out.print("tong cua cac phan so la: ");
//        sum.hienThi();
//        arr[2].rutGon().hienThi();
//        PhanSo p1 = new PhanSo(1, 2);
//        PhanSo p2 = new PhanSo(1, 3);
//        PhanSo p3 = new PhanSo(1, 4);
//        PhanSo p4 = new PhanSo(1, 5);
//        DsPhanSo DS = new DsPhanSo();
//        DS.them(p1);
//        DS.them(p2);
//        DS.them(p3);
//        DS.them(p4);
//        DS.hienThi();
//        PhanSo p5 = new PhanSo(1, 3);
//        DS.xoa(p5);
//        System.out.println("sau khi xoa lan 1:");
//        DS.hienThi();
//        DS.xoa(1, 2);
//        System.out.println("sau khi xoa lan 2:");
//        DS.hienThi();
        Date d = new Date();
        SimpleDateFormat f = new SimpleDateFormat("dd/mm/yyyy");
        System.out.println(f.format(10/10/2024));
    }
}
