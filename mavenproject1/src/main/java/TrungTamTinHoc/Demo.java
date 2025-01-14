/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamTinHoc;

/**
 *
 * @author ASUS
 */
public class Demo {

    public static void main(String[] args) {
        GiangVien gv1 = new GVCoHuu(2000, 3, "Nguyen Van A", "Dai Hoc", "Thac Si");
        GiangVien gv2 = new GVCoHuu(5000, 5, "Nguyen Van B", "Dai Hoc", "Tien Si");
        GiangVien gv3 = new GVThinhGiang("OU", "Nguyen Van C", "Dai Hoc", "Cu Nhan");
        GiangVien gv4 = new GVThinhGiang("VNU-UEL", "Nguyen Van D", "Dai Hoc", "Giao Su");
        QuanLy ql = new QuanLy();
        ql.them(gv1,gv2,gv3,gv4);
        ql.hienThi();
        ql.timKiem("Nguyen Van A", "Dai Hoc", "Thac Si").forEach(s->System.out.println(s));
        ql.tinhTienLuong();
        ql.hienThi();
        ql.xoa(gv4);
        System.out.println("================");
        ql.hienThi();
    }
}
