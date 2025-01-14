/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TrungTamTinHoc;

import java.time.Duration;
import java.time.LocalDate;

/**
 *
 * @author ASUS
 */
public class GVThinhGiang extends GiangVien {

    /**
     * @return the noiCongTacString
     */
    public String getNoiCongTacString() {
        return noiCongTacString;
    }

    /**
     * @param noiCongTacString the noiCongTacString to set
     */
    public void setNoiCongTacString(String noiCongTacString) {
        this.noiCongTacString = noiCongTacString;
    }

    private String noiCongTacString;

    public GVThinhGiang(String noiCongTacString, String hoTenString, String hamHocString, String hocViString) {
        super(hoTenString, hamHocString, hocViString);
        this.noiCongTacString = noiCongTacString;
    }

    @Override
     public double tienLuong(int soGio) {
        return soGio*90000;
    }
    
     @Override
    public String toString() {
        return String.format("Giang vien thinh giang\n%s\n", super.toString());
    }
}
