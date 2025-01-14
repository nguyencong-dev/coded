/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TiemChung;

/**
 *
 * @author ASUS
 */
public class VacXin {

    /**
     * @return the maVX
     */
    public int getMaVX() {
        return maVX;
    }

    /**
     * @param maVX the maVX to set
     */
    public void setMaVX(int maVX) {
        this.maVX = maVX;
    }

    /**
     * @return the tenVX
     */
    public String getTenVX() {
        return tenVX;
    }

    /**
     * @param tenVX the tenVX to set
     */
    public void setTenVX(String tenVX) {
        this.tenVX = tenVX;
    }

    /**
     * @return the xuatXuString
     */
    public String getXuatXuString() {
        return xuatXuString;
    }

    /**
     * @param xuatXuString the xuatXuString to set
     */
    public void setXuatXuString(String xuatXuString) {
        this.xuatXuString = xuatXuString;
    }

    /**
     * @return the soLuong
     */
    public int getSoLuong() {
        return soLuong;
    }

    /**
     * @param soLuong the soLuong to set
     */
    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    private static int count = 0;
    private int maVX = ++count;
    private String tenVX, xuatXuString;
    private int soLuong;

    public VacXin(String xuatXuString, int soLuong, String tenVX) {
        this.tenVX = tenVX;
        this.xuatXuString = xuatXuString;
        this.soLuong = soLuong;
    }
    
    public void hienThi(){
        System.out.printf("Ten Vac Xin :%s\nMa Vac Xin: %d\nXuat xu: %s\nSo luong: %d\n",
                this.getTenVX(),this.getMaVX(),this.getXuatXuString(),this.getSoLuong());
    }
}
