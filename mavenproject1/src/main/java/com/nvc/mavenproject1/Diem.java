/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

/**
 *
 * @author ASUS
 */
public class Diem {

    private double tungDo, hoanhDo;

    public Diem() {
        this.tungDo = 0;
        this.hoanhDo = 0;
    }

    public Diem(double hoanh, double tung) {
        this.tungDo = tung;
        this.hoanhDo = hoanh;
    }

    public double getTung() {
        return tungDo;
    }

    public double getHoanh() {
        return hoanhDo;
    }

    public void setDiem(double hoanh, double tung) {
        this.tungDo = tung;
        this.hoanhDo = hoanh;
    }

    public void hienThiDiem() {
        System.out.print("(" + this.hoanhDo + ", " + this.tungDo + ")");
    }

    public double khoangCach(Diem d) {
        return Math.sqrt(Math.pow((this.tungDo - d.tungDo), 2) + Math.pow((this.hoanhDo - d.hoanhDo), 2));
    }
}
