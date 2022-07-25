/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST_16;

import java.io.Serializable;

/**
 *
 * @author anhkon
 */
public class sanPham implements Serializable{
    private String tenSP;
    private String maSP;
    private String danhMuc;
    private int tinhTrang;
    private int donGia;

    public sanPham() {
    }

    public sanPham(String tenSP, String maSP, String danhMuc, int tinhTrang, int donGia) {
        this.tenSP = tenSP;
        this.maSP = maSP;
        this.danhMuc = danhMuc;
        this.tinhTrang = tinhTrang;
        this.donGia = donGia;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getDanhMuc() {
        return danhMuc;
    }

    public void setDanhMuc(String danhMuc) {
        this.danhMuc = danhMuc;
    }

    public int getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(int tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }
    
}
