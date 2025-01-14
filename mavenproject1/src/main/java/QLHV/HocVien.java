/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QLHV;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS
 */
public class HocVien {

    /**
     * @return the count
     */
    public static int getCount() {
        return count;
    }

    /**
     * @param aCount the count to set
     */
    public static void setCount(int aCount) {
        count = aCount;
    }

    /**
     * @return the maSo
     */
    public int getMaSo() {
        return maSo;
    }

    /**
     * @param maSo the maSo to set
     */
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }

    /**
     * @return the hoTen
     */
    public String getHoTen() {
        return hoTen;
    }

    /**
     * @param hoTen the hoTen to set
     */
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    /**
     * @return the queQuan
     */
    public String getQueQuan() {
        return queQuan;
    }

    /**
     * @param queQuan the queQuan to set
     */
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    /**
     * @return the ngaySinh
     */
    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    /**
     * @param ngaySinh the ngaySinh to set
     */
    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    /**
     * @return the diem
     */
    public double[] getDiem() {
        return diem;
    }

    /**
     * @param diem the diem to set
     */
    public void setDiem(double[] diem) {
        this.diem = diem;
    }

    private static int count = 0;
    private int maSo = count++;
    private String hoTen, queQuan;
    private LocalDate ngaySinh;
    private double[] diem;

    public HocVien(String hoTen, String queQuan, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = ngaySinh;
    }

    public HocVien(String hoTen, String queQuan, String ngaySinh) {
        this.hoTen = hoTen;
        this.queQuan = queQuan;
        this.ngaySinh = LocalDate.parse(ngaySinh, CauHinh.FOMATER);
    }

    public double trungBinh() {
        double tong = 0;
        for (var x : this.getDiem()) {
            tong += x;
        }
        return tong / this.getDiem().length;
    }

    public boolean isHocBong() {
        if (this.trungBinh() >= 8.0) {
            for (var x : this.getDiem()) {
                if (x < 8.0) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

}
