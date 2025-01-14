/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiemChung;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NguoiDan {

    /**
     * @return the MT
     */
    public List<MuiTiem> getMT() {
        return MT;
    }

    /**
     * @param MT the MT to set
     */
    public void setMT(List<MuiTiem> MT) {
        this.MT = MT;
    }

    /**
     * @return the soCC
     */
    public int getSoCC() {
        return soCC;
    }

    /**
     * @param soCC the soCC to set
     */
    public void setSoCC(int soCC) {
        this.soCC = soCC;
    }

    /**
     * @return the hoTenString
     */
    public String getHoTenString() {
        return hoTenString;
    }

    /**
     * @param hoTenString the hoTenString to set
     */
    public void setHoTenString(String hoTenString) {
        this.hoTenString = hoTenString;
    }

    /**
     * @return the gioiTinhString
     */
    public String getGioiTinhString() {
        return gioiTinhString;
    }

    /**
     * @param gioiTinhString the gioiTinhString to set
     */
    public void setGioiTinhString(String gioiTinhString) {
        this.gioiTinhString = gioiTinhString;
    }

    /**
     * @return the soDienThoaiString
     */
    public String getSoDienThoaiString() {
        return soDienThoaiString;
    }

    /**
     * @param soDienThoaiString the soDienThoaiString to set
     */
    public void setSoDienThoaiString(String soDienThoaiString) {
        this.soDienThoaiString = soDienThoaiString;
    }

    /**
     * @return the ngaySinhDate
     */
    public LocalDate getNgaySinhDate() {
        return ngaySinhDate;
    }

    /**
     * @param ngaySinhDate the ngaySinhDate to set
     */
    public void setNgaySinhDate(LocalDate ngaySinhDate) {
        this.ngaySinhDate = ngaySinhDate;
    }
    private int soCC;
    private String hoTenString, gioiTinhString, soDienThoaiString;
    private LocalDate ngaySinhDate;
    private List<MuiTiem> MT = new ArrayList<>();

    public NguoiDan(int saCC, String hocTenString, String gioiTinhString, String soDienThoaiString, LocalDate ngaySinhDate) {
        this.soCC = saCC;
        this.hoTenString = hocTenString;
        this.gioiTinhString = gioiTinhString;
        this.soDienThoaiString = soDienThoaiString;
        this.ngaySinhDate = ngaySinhDate;
    }

    public boolean kiemTraDieuKien() {
        if (this.MT.size() >= 3) {
            return false;
        }
        if (this.MT.isEmpty()) {
            return true;
        }
        MuiTiem muiCuoi = this.MT.get(MT.size() - 1);
        LocalDate ngayTiemCuoi = muiCuoi.getNgayTiem();
        long khoangCach = ChronoUnit.MONTHS.between(ngayTiemCuoi, LocalDate.now());
        return khoangCach >= 3;
    }

    @Override
    public String toString() {
        return String.format("So can cuoc: %d\nHo ten: %s\nGioi tinh: %s\nSo dien thoai: %s\nNgay Sinh: %s",
                this.soCC, this.hoTenString, this.gioiTinhString, this.soDienThoaiString, this.ngaySinhDate.format(CauHinh.FORMATTER));
    }

}
