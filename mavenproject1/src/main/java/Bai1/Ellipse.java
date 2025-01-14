/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

/**
 *
 * @author admin
 */
public class Ellipse {

    /**
     * @return the bkTruclon
     */
    public double getBkTruclon() {
        return bkTruclon;
    }

    /**
     * @param bkTruclon the bkTruclon to set
     */
    public void setBkTruclon(double bkTruclon) {
        this.bkTruclon = bkTruclon;
    }

    /**
     * @return the bkTrucBe
     */
    public double getBkTrucBe() {
        return bkTrucBe;
    }

    /**
     * @param bkTrucBe the bkTrucBe to set
     */
    public void setBkTrucBe(double bkTrucBe) {
        this.bkTrucBe = bkTrucBe;
    }

    public static double PI = 3.14;
    private double bkTruclon;
    private double bkTrucBe;

    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTruclon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }

    public double tinhDienTich() {
        return PI * this.getBkTrucBe() * this.getBkTruclon();
    }

    public double tinhChuVi() {
        return 2 * PI * Math.sqrt((Math.pow(this.bkTrucBe, 2) + Math.pow(this.bkTruclon, 2)) / 2);
    }

    @Override
    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f\n", this.tinhDienTich(), this.tinhChuVi());
    }

}
