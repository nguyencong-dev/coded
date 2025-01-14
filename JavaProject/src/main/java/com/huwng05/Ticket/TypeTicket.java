/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
enum TypeTicket {
    Thang {
        @Override
        public String toString() {
            return "Thang";
        }

        @Override
        public LocalDate tinhNgayHetHan(LocalDate ngay) {
            return ngay.plusMonths(1);
        }

        @Override
        public BigDecimal tinhGiaVe(LocalDate ngay) {
            if(ngay.getDayOfMonth() < 15) return new BigDecimal("32000");
            return new BigDecimal("50000");
        }
    },
    Nam {
        @Override
        public String toString() {
            return "Nam";
        }

        @Override
        public LocalDate tinhNgayHetHan(LocalDate ngay) {
            return ngay.plusYears(1);
        }

        @Override
        public BigDecimal tinhGiaVe(LocalDate ngay) {
            if(ngay.getDayOfMonth() < 15) return new BigDecimal("100000");
            return new BigDecimal("200000");
        }
    };

    @Override
    public abstract String toString();
    public abstract LocalDate tinhNgayHetHan(LocalDate ngay);
    public abstract BigDecimal tinhGiaVe(LocalDate ngay);
}
