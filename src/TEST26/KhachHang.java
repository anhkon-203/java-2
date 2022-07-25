/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST26;

import java.io.Serializable;

/**
 *
 * @author anhkon
 */
public class KhachHang  implements Serializable{
    private String ten;
    private int gioiTinh;
    private int Tuoi;

    public KhachHang() {
    }

    public KhachHang(String ten, int gioiTinh, int Tuoi) {
        this.ten = ten;
        this.gioiTinh = gioiTinh;
        this.Tuoi = Tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getTuoi() {
        return Tuoi;
    }

    public void setTuoi(int Tuoi) {
        this.Tuoi = Tuoi;
    }
    public String trangThai(int tuoi){
        tuoi = getTuoi();
        if (tuoi >=18) {
          return "Thành Niên";
        } else {
            return "Vị Thành Niên";
        }
        
    }
}
