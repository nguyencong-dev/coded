/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package NganHang;

import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public enum KyHan {
    MOT_TUAN(7) {
        @Override
        public LocalDate tinhDaoHan(LocalDate start) {
            return start.plusDays(this.khoangThoiGianDate);
        }
    },
    MOT_THANG(1) {
        @Override
        public LocalDate tinhDaoHan(LocalDate start) {
            return start.plusMonths(this.khoangThoiGianDate);
        }
    },
    MOT_NAM(1) {
        @Override
        public LocalDate tinhDaoHan(LocalDate start) {
            return start.plusYears(this.khoangThoiGianDate);
        }
    };
    
    protected int khoangThoiGianDate;

    private KyHan(int khoangThoiGianDate) {
        this.khoangThoiGianDate = khoangThoiGianDate;
    }
    
    public abstract LocalDate tinhDaoHan(LocalDate start);
}
