/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public abstract class TaiKhoan {

    /**
     * @return the tenString
     */
    public String getTenString() {
        return tenString;
    }

    /**
     * @param tenString the tenString to set
     */
    public void setTenString(String tenString) {
        this.tenString = tenString;
    }

    /**
     * @return the soTkString
     */
    public String getSoTkString() {
        return soTkString;
    }

    /**
     * @param soTkString the soTkString to set
     */
    public void setSoTkString(String soTkString) {
        this.soTkString = soTkString;
    }

    /**
     * @return the soDtString
     */
    public String getSoDtString() {
        return soDtString;
    }

    /**
     * @param soDtString the soDtString to set
     */
    public void setSoDtString(String soDtString) {
        this.soDtString = soDtString;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the soTien
     */
    public double getSoTien() {
        return soTien;
    }

    /**
     * @param soTien the soTien to set
     */
    public void setSoTien(double soTien) {
        this.soTien = soTien;
    }

    /**
     * @return the ngayTaoDate
     */
    public LocalDate getNgayTaoDate() {
        return ngayTaoDate;
    }

    /**
     * @param ngayTaoDate the ngayTaoDate to set
     */
    public void setNgayTaoDate(LocalDate ngayTaoDate) {
        this.ngayTaoDate = ngayTaoDate;
    }

    /**
     * @return the trangThai
     */
    public boolean isTrangThai() {
        return trangThai;
    }

    /**
     * @param trangThai the trangThai to set
     */
    public void setTrangThai(boolean trangThai) {
        this.trangThai = trangThai;
    }

    private static int dem = 0;
    private String tenString, soTkString, soDtString, email;
    private double soTien;
    private LocalDate ngayTaoDate;
    private boolean trangThai;

    {
        setSoTkString(String.format("%06d", dem++));
        setNgayTaoDate(LocalDate.now());
    }

    public TaiKhoan(String tenString, String soDtString, String email, double soTien, boolean trangThai) {
        this.tenString = tenString;
        this.soDtString = soDtString;
        this.email = email;
        this.soTien = soTien;
        this.trangThai = trangThai;
    }

    public void hienThi() {
        System.out.printf("Ten tk: %s\nSo tai khoan: %s\nNgay tao: %s\nEmail: %s\nSo tien: %.1f\nSo dien thoai: ",
                this.tenString, this.soTkString, this.ngayTaoDate.format(CauHinh.FOMATTER), this.email,
                this.soTien, this.soDtString);
    }

    public void napTien(double soTien) {
        if (isDaoHan() == true) {
            this.soTien += soTien;
        }
    }

    public void rutTien(double soTien) {
        if (isDaoHan() == true && this.soTien > soTien) {
            this.soTien -= soTien;
        }
    }

    public abstract boolean isDaoHan();
}
