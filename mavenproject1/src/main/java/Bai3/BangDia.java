/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public class BangDia extends SanPham{
    private double soPhut;

    public BangDia() {
    }

    public BangDia(double soPhut, String ten, String moTa, String nhaSX, double giaBan) {
        super(ten, moTa, nhaSX, giaBan);
        this.soPhut = soPhut;
    }

    @Override
    public String toString() {
        return String.format("%s%.1f phut\n", super.toString());
    }
    
    public void nhap(){
        super.nhap();
        System.out.print("nhap so trang: ");
        this.soPhut = CauHinh.sc.nextDouble();
    }
}
