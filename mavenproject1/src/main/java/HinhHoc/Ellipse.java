/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author ASUS
 */
public class Ellipse {

    /**
     * @return the bkTrucLon
     */
    public double getBkTrucLon() {
        return bkTrucLon;
    }

    /**
     * @param bkTrucLon the bkTrucLon to set
     */
    public void setBkTrucLon(double bkTrucLon) {
        this.bkTrucLon = bkTrucLon;
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

    private double bkTrucLon, bkTrucBe;

    public Ellipse(double bkTrucLon, double bkTrucBe) {
        this.bkTrucLon = bkTrucLon;
        this.bkTrucBe = bkTrucBe;
    }

    public double tinhDienTich() {
        return CauHinh.PI * this.getBkTrucLon() * this.getBkTrucBe();
    }

    public double tinhChuVi() {
        return 2 * CauHinh.PI * Math.sqrt((Math.pow(this.getBkTrucBe(), 2) + Math.pow(this.getBkTrucLon(), 2)) / 2);
    }

    public String toString() {
        return String.format("Hinh Ellipse\nDien tich: %.1f\nChu vi: %.1f\n",
                this.tinhDienTich(), this.tinhChuVi());
    }
}
