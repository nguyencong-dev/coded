/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author admin
 */
public class Demo {
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat(2, 3);
        System.out.print(hcn);
        HinhChuNhat hv = new HinhVuong(2);
        System.out.print(hv);
        
        try {
            TamGiac tg = new TamGiac(3, 4, 5);
            TamGiac tgc = new TamGiacCan(3, 2);
            TamGiac tgd = new TamGiacDeu(3);
            System.out.println(tg);
            System.out.println(tgc);
            System.out.println(tgd);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            ex.printStackTrace();
        }
        
    }
}
