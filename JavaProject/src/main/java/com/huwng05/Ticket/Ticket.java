/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
public class Ticket {
    private String ma;
    private LocalDate ngayTao;
    private LocalDate ngayHethan;
    private TypeTicket loai;
    public static int num;
    {
        this.ma = String.format("VE%05d", ++num);
    }

    public Ticket(TypeTicket loai) {
        this.ngayTao = LocalDate.now();
        this.loai = loai;
        this.ngayHethan = this.loai.tinhNgayHetHan(this.ngayTao);
    }

    @Override
    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s\n", this.ma,
                this.loai,
                Config.DATE_FOMATTER.format(this.ngayTao),
                Config.DATE_FOMATTER.format(this.ngayHethan),
                Config.BIG_DECIMAL.format(this.loai.tinhGiaVe(this.ngayTao)));
    }
    
   
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public LocalDate getNgayTao() {
        return ngayTao;
    }

    public void setNgayTao(LocalDate ngayTao) {
        this.ngayTao = ngayTao;
    }

    public TypeTicket getLoai() {
        return loai;
    }

    public void setLoai(TypeTicket loai) {
        this.loai = loai;
    }
    
    
    
}
