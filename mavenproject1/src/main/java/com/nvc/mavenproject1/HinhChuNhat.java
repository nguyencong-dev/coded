/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

/**
 *
 * @author ASUS
 */
public class HinhChuNhat {

    private Diem diemTrenTrai, diemDuoiPhai;

    public HinhChuNhat(Diem trenTrai, Diem duoiPhai) {
        diemTrenTrai = trenTrai;
        diemDuoiPhai = duoiPhai;
    }

    public Diem getDiemTrenTrai() {
        return this.diemTrenTrai;
    }

    public Diem getDiemDuoiPhai() {
        return this.diemDuoiPhai;
    }

    public void setDiem(Diem trenTrai, Diem duoiPhai) {
        this.diemTrenTrai = trenTrai;
        this.diemDuoiPhai = duoiPhai;
    }

    public double chuVi() {
        double chieuRong = this.diemTrenTrai.getTung() - this.diemDuoiPhai.getTung();
        double chieuDai = this.diemDuoiPhai.getHoanh() - this.diemTrenTrai.getHoanh();
        return (chieuDai + chieuRong) * 2;
    }

    public double dienTich() {
        double chieuRong = this.diemTrenTrai.getTung() - this.diemDuoiPhai.getTung();
        double chieuDai = this.diemDuoiPhai.getHoanh() - this.diemTrenTrai.getHoanh();
        return chieuDai * chieuRong;
    }

    public void hienThi(){
        System.out.print("Dien tren trai cua hinh chu nhat la: ");
        this.diemTrenTrai.hienThiDiem();
        System.out.println("");
        System.out.print("Dien duoi phai cua hinh chu nhat la: ");
        this.diemDuoiPhai.hienThiDiem();
        System.out.println("");
        System.out.println("Dien tich HCN la: "+dienTich());
        System.out.println("Chu vi hinh chu nhat la: "+chuVi());
    }
}
