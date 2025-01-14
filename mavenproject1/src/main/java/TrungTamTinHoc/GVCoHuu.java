/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamTinHoc;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class GVCoHuu extends GiangVien {

    /**
     * @return the luongCoBan
     */
    public double getLuongCoBan() {
        return luongCoBan;
    }

    /**
     * @param luongCoBan the luongCoBan to set
     */
    public void setLuongCoBan(double luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    /**
     * @return the heSoLuong
     */
    public int getHeSoLuong() {
        return heSoLuong;
    }

    /**
     * @param heSoLuong the heSoLuong to set
     */
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    private double luongCoBan;
    private int heSoLuong;

    public GVCoHuu(double luongCoBan, int heSoLuong, String hoTenString, String hamHocString, String hocViString) {
        super(hoTenString, hamHocString, hocViString);
        this.luongCoBan = luongCoBan;
        this.heSoLuong = heSoLuong;
    }

    @Override
    public double tienLuong(int soGio) {
        return soGio*90000+this.getLuongCoBan()*this.heSoLuong;
    }

    @Override
    public String toString() {
        return String.format("Giang vien co huu\n%s\n", super.toString());
    }

   
    
    
}
