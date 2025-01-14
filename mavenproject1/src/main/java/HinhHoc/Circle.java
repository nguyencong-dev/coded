/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package KeThua;

/**
 *
 * @author ASUS
 */
public class Circle extends Ellipse {

    public Circle(int r) {
        super(r, r);
    }

    public String toString() {
        return String.format("Hinh Circle\nDien tich: %.1f\nChu vi: %.1f\n",
                this.tinhDienTich(), this.tinhChuVi());
    }
}
