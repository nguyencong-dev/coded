/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nvc.mavenproject1;

/**
 *
 * @author ASUS
 */
public class DoanThang {

    private Diem d1, d2;

    public DoanThang(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public void setDiem(Diem d1, Diem d2) {
        this.d1 = d1;
        this.d2 = d2;
    }

    public Diem getDiem1() {
        return d1;
    }

    public Diem getDiem2() {
        return d2;
    }

    public void hienThiDoanThang() {
        System.out.print("[");
        this.d1.hienThiDiem();
        System.out.print(", ");
        this.d2.hienThiDiem();
        System.out.print("]");
    }
    
    public double doDaiDoanThang(){
       return this.d1.khoangCach(this.d2);
    }
    
    public Diem trungDiem(){
        Diem tmp1 = new Diem(((this.d1.getHoanh()+this.d2.getHoanh())/2),((this.d1.getTung()+this.d2.getTung())/2));
        return tmp1;
    }
    
    public boolean kiemTraSongSong(DoanThang CD){
       double kq1 = (this.d1.getHoanh()-this.d2.getHoanh())/(this.d1.getTung()-this.d2.getTung());
       double kq2 = (CD.d1.getHoanh()-CD.d2.getHoanh())/(CD.d1.getTung()-CD.d2.getTung());
       return kq1 == kq2;
    }
}
