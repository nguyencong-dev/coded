/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiemChung;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class NguoiNuocNgoai extends NguoiDan{

    /**
     * @return the soHoChieu
     */
    public int getSoHoChieu() {
        return soHoChieu;
    }

    /**
     * @param soHoChieu the soHoChieu to set
     */
    public void setSoHoChieu(int soHoChieu) {
        this.soHoChieu = soHoChieu;
    }

    /**
     * @return the quuocTichString
     */
    public String getQuuocTichString() {
        return quuocTichString;
    }

    /**
     * @param quuocTichString the quuocTichString to set
     */
    public void setQuuocTichString(String quuocTichString) {
        this.quuocTichString = quuocTichString;
    }
    private int soHoChieu;
    private String quuocTichString;

    public NguoiNuocNgoai(int saCC, String hocTenString, String gioiTinhString, String soDienThoaiString, LocalDate ngaySinhDate, int soHoChieu, String quuocTichString) {
        super(saCC, hocTenString, gioiTinhString, soDienThoaiString, ngaySinhDate);
        this.soHoChieu = soHoChieu;
        this.quuocTichString = quuocTichString;
    }

    @Override
    public String toString() {
        return String.format("%s\nSo ho chieu: %d\nQuoc tich: %s", super.toString(),this.soHoChieu,this.quuocTichString);
    }
    
    
}
