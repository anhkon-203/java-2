/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test_21thg6;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class Quan_Li_San_Pham implements SPDAO{
    ArrayList<sanPham> list;
    public Quan_Li_San_Pham (){
        this.list = new ArrayList<>();
    }
    
    @Override
    public void insert(sanPham sp) {
       this.list.add(sp);
    }

    @Override
    public void update(int viTri, sanPham sp) {
        this.list.set(viTri, sp);
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
    }

    @Override
    public sanPham getbyID(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public ArrayList<sanPham> getList() {
        return this.list;
    }
    @Override
    public void setList(ArrayList<sanPham> ds) {
        this.list = ds;
    }
    
}
