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
public class CoKyHan extends TaiKhoan{

    private LocalDate ngayDaoHan;
    private KyHan KH;
    public CoKyHan(String tenString, String soDtString, String email, double soTien, boolean trangThai, KyHan KH) {
       super(tenString, soDtString, email, soTien, trangThai);
       this.KH = KH;
       this.ngayDaoHan = KH.tinhDaoHan(ngayDaoHan);
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("TAI KHOAN CO KI HAN");
    }

    @Override
    public void napTien(double soTien) {
        if(this.ngayDaoHan == LocalDate.now())
              super.napTien(soTien);
        else
            System.out.println("KHONG PHAI NGAY DAO HAN");
    }    

    @Override
    public boolean isDaoHan() {
        return this.ngayDaoHan == LocalDate.now();
    }
    
}
