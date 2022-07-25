/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_21thg6;

import java.io.Serializable;

/**
 *
 * @author anhkon
 */
public class sanPham  implements Serializable{

    private String tenSp;
    private String maSp;
    private String danhMuc;
    private int tinhTrang;
    private double donGia;

    public sanPham() {
    }

    public sanPham(String tenSp, String maSp, String danhMuc, int tinhTrang, double donGia) {
        this.tenSp = tenSp;
        this.maSp = maSp;
        this.danhMuc = danhMuc;
        this.tinhTrang = tinhTrang;
        this.donGia = donGia;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
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
