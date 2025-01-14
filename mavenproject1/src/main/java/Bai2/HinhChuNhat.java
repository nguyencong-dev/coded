/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class HinhChuNhat {

    /**
     * @return the chieuDai
     */
    public double getChieuDai() {
        return chieuDai;
    }

    /**
     * @param chieuDai the chieuDai to set
     */
    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    /**
     * @return the chieuRong
     */
    public double getChieuRong() {
        return chieuRong;
    }

    /**
     * @param chieuRong the chieuRong to set
     */
    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }
    private double chieuDai, chieuRong;

    public HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public double tinhDienTich() {
        return this.chieuRong * this.chieuDai;
    }

    public double tinhChuVi() {
        return (this.chieuDai + this.chieuRong) * 2;
    }

    @Override
    public String toString() {
        return String.format("Hinh chu nhat\nChieu dai: %.1f\nChieu rong: %.1f\nChu vi: %.1f\nDien tich: %.1f\n",
                this.chieuDai,this.chieuRong,this.tinhDienTich(),this.tinhChuVi());
    }

}
