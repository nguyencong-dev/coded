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
public class MuiTiem {

    /**
     * @return the VX
     */
    public VacXin getVX() {
        return VX;
    }

    /**
     * @param VX the VX to set
     */
    public void setVX(VacXin VX) {
        this.VX = VX;
    }

    /**
     * @return the ngayTiem
     */
    public LocalDate getNgayTiem() {
        return ngayTiem;
    }

    /**
     * @param ngayTiem the ngayTiem to set
     */
    public void setNgayTiem(LocalDate ngayTiem) {
        this.ngayTiem = ngayTiem;
    }

    /**
     * @return the diaDiemString
     */
    public String getDiaDiemString() {
        return diaDiemString;
    }

    /**
     * @param diaDiemString the diaDiemString to set
     */
    public void setDiaDiemString(String diaDiemString) {
        this.diaDiemString = diaDiemString;
    }
    private VacXin VX;
    private LocalDate ngayTiem;
    private String diaDiemString;

    public MuiTiem(VacXin VX, String diaDiemString,String ngayTiem) {
        this.VX = VX;
        this.diaDiemString = diaDiemString;
        this.ngayTiem = LocalDate.parse(ngayTiem, CauHinh.FORMATTER);
    }
    
}
