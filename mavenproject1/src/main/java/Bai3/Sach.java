/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

/**
 *
 * @author admin
 */
public class Sach extends SanPham {

    /**
     * @return the soTrang
     */
    public int getSoTrang() {
        return soTrang;
    }

    /**
     * @param soTrang the soTrang to set
     */
    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    private int soTrang;

    public Sach() {
    }

    public Sach(String ten, String moTa, String nhaSX, double giaBan,int soTrang) {
        super(ten, moTa, nhaSX, giaBan);
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return String.format("%s%d trang\n", super.toString(), this.getSoTrang());
    }

    public void nhap(){
        super.nhap();
        System.out.print("nhap so trang: ");
        this.setSoTrang(CauHinh.sc.nextInt());
    }

}
