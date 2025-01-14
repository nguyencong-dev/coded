/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

/**
 *
 * @author ASUS
 */
public class PhanSo {

    /**
     * @return the tuSo
     */
    public int getTuSo() {
        return tuSo;
    }

    /**
     * @param tuSo the tuSo to set
     */
    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    /**
     * @return the mauSo
     */
    public int getMauSo() {
        return mauSo;
    }

    /**
     * @param mauSo the mauSo to set
     */
    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }

    private int tuSo, mauSo;
    private static int count = 0;

    public PhanSo() {
        tuSo = 0;
        mauSo = 1;
        count++;
    }

    public PhanSo(int tu, int mau) {
        this.tuSo = tu;
        this.mauSo = mau;
        count++;
    }

    public static int UCLN(int a, int b) {
        int lon, be;
        if (a >= b) {
            lon = a;
            be = b;
        } else {
            lon = b;
            be = a;
        }
        for (int i = be; i >= 1; i--) {
            if (lon % i == 0 && be % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public PhanSo rutGon() {
        int t = this.tuSo / UCLN(this.tuSo, this.mauSo);
        int m = this.mauSo / UCLN(this.tuSo, this.mauSo);
        return new PhanSo(t, m);
    }

    public PhanSo cong(PhanSo p) {
        int t = this.tuSo * p.mauSo + this.mauSo * p.tuSo;
        int m = this.mauSo * p.mauSo;
        return (new PhanSo(t, m)).rutGon();
    }

    public PhanSo tru(PhanSo p) {
        int t = this.tuSo * p.mauSo - this.mauSo * p.tuSo;
        int m = this.tuSo * p.mauSo;
        return (new PhanSo(t, m)).rutGon();
    }

    public PhanSo nhan(PhanSo p) {
        int t = this.tuSo * p.tuSo;
        int m = this.tuSo * p.mauSo;
        return (new PhanSo(t, m)).rutGon();
    }

    public PhanSo chia(PhanSo p) {
        int t = this.tuSo * p.mauSo;
        int m = this.mauSo * p.tuSo;
        return (new PhanSo(t, m)).rutGon();
    }
    public int soSanh(PhanSo p){
       if((int)((this.tuSo/this.mauSo)*1000)==(int)((p.tuSo / p.mauSo)*1000))
           return 0;
       else if((int)((this.tuSo/this.mauSo)*1000) > (int)((p.tuSo / p.mauSo)*1000))
           return 1;
       return -1;
    }
    
    public void hienThi(){
        System.out.println(this.tuSo+"/"+this.mauSo);
    }
}
