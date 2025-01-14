/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class DsPhanSo {

    private ArrayList<PhanSo> arr = new ArrayList<>();

    public void them(PhanSo p) {
        this.arr.add(p);
    }

    public void hienThi() {
        for (var x : this.arr) {
            x.hienThi();
        }
    }

    public void xoa(PhanSo p) {
        this.arr.remove(p);
    }

    public void xoa(int tu, int mau) {
        PhanSo p = new PhanSo(tu, mau);
        this.arr.remove(p);
    }
}
