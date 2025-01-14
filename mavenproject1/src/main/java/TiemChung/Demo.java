/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiemChung;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author ASUS
 */
public class Demo {

    public static void main(String[] args) {
        NguoiDan nd1 = new NguoiDan(1, "Nguyen Van A", "Nam", "111111", LocalDate.now());
        NguoiDan nd2 = new NguoiDan(2, "Nguyen Van B", "NU", "111112", LocalDate.now());
        NguoiDan nd3 = new NguoiDan(3, "Nguyen Van C", "NU", "111113", LocalDate.now());
        NguoiDan nd4 = new NguoiNuocNgoai(4, "Nguyen Van D", "Nam", "111114", LocalDate.now(), 1234, "Trung Quoc");
        NguoiDan nd5 = new NguoiNuocNgoai(5, "Nguyen Thi E", "Nu", "1111112", LocalDate.now(), 123456, "Lao");
        QuanLy ql = new QuanLy();
        ql.themNguoiDan(nd1, nd2, nd3, nd4, nd5);
        ql.hienThiNguoiNuocNgoai();
        VacXin vc1 = new VacXin("My", 20, "Anphal");
        VacXin vc2 = new VacXin("Canada", 50, "Beta");
        VacXin vc3 = new VacXin("Nhat Ban", 30, "Delta");
        ql.themVacXin(vc1, vc2, vc3);
        System.out.println("==========================");
        ql.hienThiVacXin();
        System.out.println("==========================");
        ql.nhapTTTiem(1, vc1, "Binh Duong", "01/01/2024");
        ql.nhapTTTiem(1, vc2, "Binh Duong", "01/04/2024");
        ql.nhapTTTiem(1, vc3, "Binh Duong", "01/10/2024");
        ql.hienThi2Mui();
    }
}
