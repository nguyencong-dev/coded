/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.Ticket;

import java.time.LocalDate;

/**
 *
 * @author huwng05
 */
public class main {
    public static void main(String[] args) {
        NguoiHoc p1 = new NguoiHoc("Nguyen Dinh Hung", "29/06/2005");
        NguoiHoc p2 = new NguoiHoc("Nguyen Dinh Mac", "27/03/2004");
        NguoiHoc p3 = new NguoiHoc("Nguyen Dinh Kung", "24/07/2005");
        Manage sinhVien = new Manage();
        sinhVien.add(p1,p2,p3);
        System.out.println(sinhVien);
        System.out.println("===============");
        sinhVien.muaVe("STU00001", TypeTicket.Nam);
        sinhVien.muaVe("STU00001", TypeTicket.Thang);
        sinhVien.muaVe("STU00002", TypeTicket.Nam);
        sinhVien.showListVe("STU00001");
        System.out.println("===============");
        sinhVien.muaTrongNam(2024);
        System.out.println("===============");
        sinhVien.sort();
        System.out.println(sinhVien);
    }
}
