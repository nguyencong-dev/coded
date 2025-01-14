/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

/**
 *
 * @author ASUS
 */
public class KhongKyHan extends TaiKhoan{

    public KhongKyHan(String tenString, String soDtString, String email, double soTien, boolean trangThai) {
        super(tenString, soDtString, email, soTien, trangThai);
    }

    @Override
    public void hienThi() {
        super.hienThi(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("TAI KHOAN KHONG KY HAN");
    }

    @Override
    public boolean isDaoHan() {
        return false;
    }

    
}
