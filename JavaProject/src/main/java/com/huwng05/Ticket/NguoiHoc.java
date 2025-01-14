/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 *
 * @author huwng05
 */
public class NguoiHoc implements Comparable<NguoiHoc>{
    private String maNguoiHoc;
    private String hoTen;
    private LocalDate ngaySinh;
    private List<Ticket> listVe = new ArrayList<>();
    public static int num;
    {
        this.maNguoiHoc = String.format("STU%05d", ++num);
    }

    public NguoiHoc(String hoTen, LocalDate ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
    }

    
    public NguoiHoc(String hoTen, String ngaySinh) {
        this.hoTen = hoTen;
        this.ngaySinh = LocalDate.parse(ngaySinh, Config.DATE_FOMATTER);
    }

    @Override
    public String toString() {
        return String.format("%s\t%-25s\t%s\n", this.maNguoiHoc, this.hoTen,
                Config.DATE_FOMATTER.format(this.ngaySinh));
    }
    
    public void muaVe(TypeTicket type) {
        this.listVe.add(new Ticket(type));
    }
    
    public boolean isYear(int nam) {
        List<Ticket> arr = this.listVe.stream().filter(v->v.getNgayTao().getYear() == nam).collect(Collectors.toList());
        if(arr.size() != 0) return true;
        else return false;
    }

    @Override
    public int compareTo(NguoiHoc t) {
        int i = Integer.compare(this.ngaySinh.getYear(), t.ngaySinh.getYear());
        if (i != 0 ) return i;
        String a = this.hoTen.trim().split(" ")[this.hoTen.split(" ").length -1];
        String b = t.hoTen.trim().split(" ")[t.hoTen.split(" ").length -1];
        return Integer.compare((int) a.charAt(0), (int) b.charAt(0));
    }
    
    public String showListVe() {
        StringBuffer str = new StringBuffer();
        this.listVe.forEach(v->str.append(v.toString()));
        return str.toString();
    }
    
    public List<Ticket> getListVe() {
        return listVe;
    }

    public void setListVe(List<Ticket> listVe) {
        this.listVe = listVe;
    }
   
    public String getMaNguoiHoc() {
        return maNguoiHoc;
    }

    public void setMaNguoiHoc(String maNguoiHoc) {
        this.maNguoiHoc = maNguoiHoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
