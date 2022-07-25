/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi2_lt1;

import java.io.Serializable;

/**
 *
 * @author tiennh
 */
public class SinhVien extends Nguoi implements Serializable{
    private String maSv;
    private String chuyenNganh;

    public SinhVien() {
    }

    public SinhVien(String maSv, String chuyenNganh, 
        String hoTen, int gioiTinh, String diaChi) {
        super(hoTen, gioiTinh, diaChi);
        this.maSv = maSv;
        this.chuyenNganh = chuyenNganh;
    }

    public String getMaSv() {
        return maSv;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
    
    @Override
    public String xuatThongTin()
    {
        return super.xuatThongTin() + "-" + this.maSv +
            "-" + this.chuyenNganh;
    }
}
