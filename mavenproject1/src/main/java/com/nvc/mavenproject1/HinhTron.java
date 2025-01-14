/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

/**
 *
 * @author ASUS
 */
public class HinhTron {

    public static final double PI = 3.14;

    /**
     * @return the toaDoTam
     */
    public Diem getToaDoTam() {
        return toaDoTam;
    }

    /**
     * @param toaDoTam the toaDoTam to set
     */
    public void setToaDoTam(Diem toaDoTam) {
        this.toaDoTam = toaDoTam;
    }

    /**
     * @return the banKinh
     */
    public double getBanKinh() {
        return banKinh;
    }

    /**
     * @param banKinh the banKinh to set
     */
    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }

    private Diem toaDoTam;
    private double banKinh;

    public HinhTron(Diem O, double r) {
        toaDoTam = O;
        banKinh = r;
    }

    public double dienTich() {
        return this.banKinh * this.banKinh * PI;
    }

    public double chuVi() {
        return this.banKinh * 2 * PI;
    }

    public void viTriTuongDoiD(Diem A) {
        double d = this.toaDoTam.khoangCach(A);
        if (((int) (d * 100)) > ((int) (this.banKinh * 100))) {
            System.out.println("Nam ngoai duong tron");
        } else if (((int) (d * 100)) == ((int) (this.banKinh * 100))) {
            System.out.println("Nam tren duong tron");
        } else {
            System.out.println("nam trong duong tron");
        }
    }

    public void viTriTuongDoiO(HinhTron I) {
        double d = this.toaDoTam.khoangCach(I.toaDoTam);
        if (((int) (d * 100)) >= ((int) ((this.banKinh + I.banKinh) * 100))) {
            System.out.println("Hai duong tron roi nhau");
        } else if (d < (this.banKinh + I.banKinh) && d > this.banKinh && d > I.banKinh) {
            System.out.println("Hai duong tron giao nhau tai hai diem");
        } else if (d < this.banKinh) {
            System.out.println("Duong tron 1 nam trong duong tron 2");
        } else if (d < I.banKinh) {
            System.out.println("Duong tron 2 nam trong duong tron 1");
        }
    }
}
