/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiemChung;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author ASUS
 */
public class QuanLy {

    private List<NguoiDan> nd = new ArrayList<>();
    private List<VacXin> vx = new ArrayList<>();

    public void themNguoiDan(NguoiDan... dans) {
        this.nd.addAll(Arrays.asList(dans));
    }

    public void themVacXin(VacXin... vacXins) {
        this.vx.addAll(Arrays.asList(vacXins));
    }

    public void hienThiVacXin() {
        this.vx.forEach(s -> s.hienThi());
    }

    public void hienThiNguoiNuocNgoai() {
        for (var x : this.nd) {
            if (x instanceof NguoiNuocNgoai) {
                System.out.println(x);
            }
        }
    }

    public void nhapTTTiem(int id, VacXin vx, String diaDiem,String ngayTiem) {
        for (var x : this.nd) {
            if (x.getSoCC() == id) {
                if (x.kiemTraDieuKien()) {
                    x.getMT().add(new MuiTiem(vx, diaDiem,ngayTiem));
                    vx.setSoLuong(vx.getSoLuong() - 1);
                } else {
                    System.out.println("nguoi duoc tiem khong du yeu cau");
                }
                return;
            }
        }
        System.out.println("khong tim thay nguoi can tiem");
    }

    public void hienThi2Mui() {
        for (var x : this.nd) {
            if (x.getMT().size() >= 2) {
                System.out.printf("So can cuoc: %d\nHo ten: %s\n", x.getSoCC(), x.getHoTenString());
                System.out.println("Danh sach cac mui tiem:");
                for(var i : x.getMT()){
                    i.getVX().hienThi();
                    System.out.printf("Ngay tiem: %s\n",i.getNgayTiem().format(CauHinh.FORMATTER));
                }
            }
        }
    }
}
