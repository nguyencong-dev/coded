/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.huwng05.library;

import java.math.BigDecimal;
import java.util.List;

/**
 *
 * @author huwng05
 */
public class main {
    public static void main(String[] args) {
        String strMenu = "====OPTION====\n";
        strMenu += "1. Them san pham\n";
        strMenu += "2. Xoa san pham\n";
        strMenu += "3. Cap nhap\n";
        strMenu += "4. Tim\n";
        strMenu += "5. Sap xep\n";
        strMenu += "6. Xem danh sach\n";
        strMenu += "7. Thoat\n";
        strMenu += "Your option: ";
        QLSP products = new QLSP("src/main/resources/SanPham.txt");
        while (true) {
            System.out.print(strMenu);
            int choose = Integer.parseInt(Config.SC.nextLine());
            switch (choose) {
                case 1:
                    products.loadFile();
                    products.show();
                    List<SanPham> tmp = products.find("","com.huwng05.library.Sach");
                    tmp.forEach(a->System.out.print(a));
                    break;
                default:
                    throw new AssertionError();
            }
        }
    }
}
