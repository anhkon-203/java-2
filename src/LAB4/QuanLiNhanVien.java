/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAB4;

import buoi2_lt1.Nguoi;
import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QuanLiNhanVien implements NhanVienDAO{
    ArrayList<NhanVien> list;
     public QuanLiNhanVien() {
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(NhanVien nv) {
        this.list.add(nv);
    }

    @Override
    public void update(int viTri, NhanVien nv) {
        this.list.set(viTri, nv);
    }

    @Override
    public void delete(int viTri) {
       this.list.remove(viTri);
    }

    @Override
    public ArrayList<NhanVien> getList() {
       return  this.list;
    }

    @Override
    public NhanVien getById(int viTri) {
         return this.list.get(viTri);
}

    void setList(ArrayList<Nguoi> ds) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

