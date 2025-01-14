/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai2;

/**
 *
 * @author ASUS
 */
public class Test {

    public static void main(String[] args) throws Exception {
        //        HinhCHuNhat hcn = new HinhCHuNhat(3, 5);
        //        System.out.println(hcn.toString());
        //        HinhCHuNhat hv = new HinhVuong(4);
        //        System.out.println(hv.toString());
        TamGiac tg = new TamGiac(3, 4, 5);
        System.out.println(tg.toString());
        TamGiac tgc = new TamGiacCan(4, 5);
        System.out.println(tgc.toString());
        TamGiac tgd = new TamGiacDeu(3);
        System.out.println(tgd.toString());
    }
}
