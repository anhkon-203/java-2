/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test23_t6;

import java.io.Serializable;

/**
 *
 * @author anhkon
 */
public class SinhVien implements Serializable{
    private String tenSP;
    private String maSp;
    private String danhMuc;
    private int tinhTrang;
    private double donGia;

    public SinhVien() {
    }

    public SinhVien(String tenSP, String maSp, String danhMuc, int tinhTrang, double donGia) {
        this.tenSP = tenSP;
        this.maSp = maSp;
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

    public String getMaSp() {
        return maSp;
    }

    public void setMaSp(String maSp) {
        this.maSp = maSp;
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

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
