/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLHV;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class QuanLy {

    private List<HocVien> ls = new ArrayList<>();

    public void them(HocVien hv) {
        this.ls.add(hv);
    }

    public void them(HocVien... hv) {
        this.ls.addAll(Arrays.asList(hv));
    }

    public void them() {
        System.out.println("nhap vao ten: ");
        String ten = CauHinh.sc.nextLine();
        System.out.println("nhap vao que quan:");
        String que = CauHinh.sc.nextLine();
        System.out.println("nhap vao ngay sinh:");
        String ns = CauHinh.sc.nextLine();
        this.ls.add(new HocVien(ten, que, ns));
    }
}
