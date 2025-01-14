/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author huwng05
 */
public class Manage {
    List<NguoiHoc> list = new ArrayList<>();
    
    public void add(NguoiHoc... p) {
        this.list.addAll(List.of(p));
    }

    @Override
    public String toString() {
        StringBuffer str = new StringBuffer();
        this.list.forEach(p->str.append(p.toString()));
        return str.toString();
    }
    
    public NguoiHoc find(String maNguoiHoc) {
        return this.list.stream().filter(p->p.getMaNguoiHoc().contains(maNguoiHoc))
                .findFirst().orElse(null);
    }
    
    public void muaVe(String maNguoiHoc, TypeTicket loai) {
        int i = this.list.indexOf(this.find(maNguoiHoc));
        if (i != -1) this.list.get(i).muaVe(loai);
    }
    
    public void showListVe(String maNguoiHoc) {
        int i = this.list.indexOf(this.find(maNguoiHoc));
        if (i != -1) System.out.println(this.list.get(i).showListVe());;
    }
    
    public void muaTrongNam(int nam) {
        List<NguoiHoc> arr = this.list.stream().filter(p->p.isYear(nam) == true)
                .collect(Collectors.toList());
        arr.forEach(p->System.out.print(p));
    }
    
    public void sort() {
        Collections.sort(this.list, Comparator.reverseOrder());
    }
}
