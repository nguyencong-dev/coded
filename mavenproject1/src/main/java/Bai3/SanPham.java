/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public abstract class SanPham implements Comparable<SanPham>{

    /**
     * @return the maSp
     */
    public int getMaSp() {
        return maSp;
    }

    /**
     * @param maSp the maSp to set
     */
    public void setMaSp(int maSp) {
        this.maSp = maSp;
    }

    /**
     * @return the ten
     */
    public String getTen() {
        return ten;
    }

    /**
     * @param ten the ten to set
     */
    public void setTen(String ten) {
        this.ten = ten;
    }

    /**
     * @return the moTa
     */
    public String getMoTa() {
        return moTa;
    }

    /**
     * @param moTa the moTa to set
     */
    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    /**
     * @return the nhaSX
     */
    public String getNhaSX() {
        return nhaSX;
    }

    /**
     * @param nhaSX the nhaSX to set
     */
    public void setNhaSX(String nhaSX) {
        this.nhaSX = nhaSX;
    }

    /**
     * @return the giaBan
     */
    public double getGiaBan() {
        return giaBan;
    }

    /**
     * @param giaBan the giaBan to set
     */
    public void setGiaBan(double giaBan) {
        this.giaBan = giaBan;
    }

    public static int ma = 0;
    private int maSp = ++ma;
    private String ten;
    private String moTa;
    private String nhaSX;
    private double giaBan;

    public SanPham() {
    }

    public SanPham(String ten, String moTa, String nhaSX, double giaBan) {
        this.ten = ten;
        this.moTa = moTa;
        this.nhaSX = nhaSX;
        this.giaBan = giaBan;
    }

    @Override
    public String toString() {
        return String.format("%d - %s - %s - %s - %.1f\n", this.maSp, this.ten, this.moTa,this.nhaSX, this.giaBan);
    }

    public void nhap() {
        System.out.print("Nhap vao ten: ");
        this.ten = CauHinh.sc.nextLine();
        System.out.print("Nhap vao mota: ");
        this.moTa = CauHinh.sc.nextLine();
        System.out.print("Nhap vao NSX: ");
        this.nhaSX = CauHinh.sc.nextLine();
        System.out.print("Nhap vao gia ban: ");
        this.giaBan = CauHinh.sc.nextDouble();
    }

    @Override
    public int compareTo(SanPham o) {
        return Double.compare(this.giaBan, o.getGiaBan());
    }
}
