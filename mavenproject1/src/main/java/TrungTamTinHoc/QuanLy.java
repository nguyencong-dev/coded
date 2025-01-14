/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamTinHoc;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author ASUS
 */
public class QuanLy {

    private List<GiangVien> ls = new ArrayList<>();

    public void them(GiangVien... gv) {
        this.ls.addAll(Arrays.asList(gv));
    }

    public void xoa(GiangVien gv) {
        this.ls.removeIf(s -> s.equals(gv));
    }

    public List<GiangVien> timKiem(String ten, String hamHoc, String hocVi) {
        return this.ls.stream().filter(s -> s.getHoTenString().toLowerCase().contains(ten.toLowerCase()) && s.getHamHocString().toLowerCase().
                contains(hamHoc.toLowerCase()) && s.getHocViString().toLowerCase().contains(hocVi.toLowerCase())).collect(Collectors.toList());
    }

    public void tinhTienLuong() {
        for (var x : this.ls) {
            System.out.printf("nhap vao so gio lam viec cua giang vien %s: ", x.getHoTenString());
            int soGio = CauHinh.sc.nextInt();
            x.setTienLuong(x.tienLuong(soGio));
        }
        this.ls.sort((a,b) -> -Double.compare(a.getTienLuong(), b.getTienLuong()));
    }
    
    public void hienThi(){
        this.ls.forEach(s->System.out.println(s));
    }
}
