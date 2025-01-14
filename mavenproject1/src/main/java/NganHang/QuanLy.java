/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NganHang;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class QuanLy {

    private List<TaiKhoan> ls = new ArrayList<>();

    public void them(TaiKhoan... tk) {
        this.ls.addAll(Arrays.asList(tk));
    }

    public void xoa(String id) {
        this.ls.removeIf(s -> s.getSoTkString().contains(id));
    }

    public TaiKhoan timKiem(String id, String ten) {
        return this.ls.stream().filter(s -> s.getSoTkString().contains(id) && s.getTenString().contains(ten)).findFirst().get();
    }

    public void napTien(double soTien, String id, String ten) {
        this.timKiem(id, ten).napTien(soTien);
    }
}
