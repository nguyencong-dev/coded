/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author admin
 */
public class QuanLyDanhSach {

    private List<SanPham> ls = new ArrayList<>();

    public void them(SanPham sp) {
        this.ls.add(sp);
    }

    public void them(SanPham... sp) {
        this.ls.addAll(Arrays.asList(sp));
    }

    public void them() {
        SanPham sp1 = new Sach();
        sp1.nhap();
        this.ls.add(sp1);
    }

    public void hienThi() {
        this.ls.forEach(s -> System.out.println(s));
    }

    public SanPham timKiem(int id) {
        return this.ls.stream().filter(s -> s.getMaSp() == id).findFirst().get();
    }

    public List<SanPham> timKiem(String dd) {
        try {
            Class c = Class.forName(dd);
            return this.ls.stream().filter(s -> c.isInstance(s)).collect(Collectors.toList());
        } catch (Exception e) {
            return this.ls.stream().filter(s -> s.getTen().contains(dd)).collect(Collectors.toList());
        }
    }

    public void xoa(int id) {
        this.ls.removeIf(s -> s.getMaSp() == id);
    }

    public void xoa(SanPham sp) {
        this.ls.removeIf(s -> s == sp);
    }

    public void capNhat(int id){
        for(var x: this.ls)
            if(x.getMaSp() == id)
                x.nhap();
    }
    public void sapXep() {
        this.ls.sort((s1, s2) -> s1.compareTo(s2));
    }
}
