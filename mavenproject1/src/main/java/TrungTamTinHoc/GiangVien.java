/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamTinHoc;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public abstract class GiangVien {

    /**
     * @return the tienLuong
     */
    public double getTienLuong() {
        return tienLuong;
    }

    /**
     * @param tienLuong the tienLuong to set
     */
    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    /**
     * @return the hoTenString
     */
    public String getHoTenString() {
        return hoTenString;
    }

    /**
     * @param hoTenString the hoTenString to set
     */
    public void setHoTenString(String hoTenString) {
        this.hoTenString = hoTenString;
    }

    /**
     * @return the hamHocString
     */
    public String getHamHocString() {
        return hamHocString;
    }

    /**
     * @param hamHocString the hamHocString to set
     */
    public void setHamHocString(String hamHocString) {
        this.hamHocString = hamHocString;
    }

    /**
     * @return the hocViString
     */
    public String getHocViString() {
        return hocViString;
    }

    /**
     * @param hocViString the hocViString to set
     */
    public void setHocViString(String hocViString) {
        this.hocViString = hocViString;
    }

    /**
     * @return the ngayBatDau
     */
    public LocalDate getNgayBatDau() {
        return ngayBatDau;
    }

    /**
     * @param ngayBatDau the ngayBatDau to set
     */
    public void setNgayBatDau(LocalDate ngayBatDau) {
        this.ngayBatDau = ngayBatDau;
    }
    
    private double tienLuong;
    private String hoTenString, hamHocString, hocViString;
    private LocalDate ngayBatDau = LocalDate.now();

    public GiangVien(String hoTenString, String hamHocString, String hocViString) {
        this.hoTenString = hoTenString;
        this.hamHocString = hamHocString;
        this.hocViString = hocViString;
    }

    public abstract double tienLuong(int soGio);

    public boolean equals(GiangVien obj) {
        return this.getHoTenString() == obj.getHoTenString();
    }

    @Override
    public String toString() {
        return String.format("ho ten: %s\nham hoc: %s\nhoc vi: %s\n ngay bat dau: %s\ntien luong: %.1f\n",
                this.hoTenString,this.hamHocString,this.hocViString,this.ngayBatDau.format(CauHinh.FORMATTER),
                this.tienLuong);
    }
    
    
}
