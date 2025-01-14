/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ticket;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class NguoiHoc {

    /**
     * @return the maNguoiHoc
     */
    public String getMaNguoiHoc() {
        return maNguoiHoc;
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
    private String maNguoiHoc;
    private String hoTen;
    private LocalDate ngaySinh;
    public static int num;
    
    {
        this.maNguoiHoc = String.format("STU%05d", ++num);
    }
}
