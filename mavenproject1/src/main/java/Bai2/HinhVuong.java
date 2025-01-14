/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class HinhVuong extends HinhChuNhat{

    public HinhVuong(double canh) {
        super(canh, canh);
    }
    
    public String toString() {
        return String.format("Hinh vuong\nCanh: %.1f\nDien tich: %.1f\nChu vi: %.1f\n",super.getChieuDai() ,this.tinhDienTich(), this.tinhChuVi());
    }
}
