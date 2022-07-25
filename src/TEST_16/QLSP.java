/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST_16;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QLSP implements SanPhamDAOInterFace{
    ArrayList<sanPham> list;
    public QLSP(){
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(sanPham sp) {
        this.list.add(sp);
    }

    @Override
    public void update(int vitri, sanPham sp) {
       this.list.set(vitri, sp);
    }

    @Override
    public void delete(int vitri) {
        this.list.remove(vitri);
    }

    @Override
    public sanPham getById(int vitri) {
      return  this.list.get(vitri);
    }

    @Override
    public ArrayList<sanPham> getlist() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<sanPham> ds) {
       this.list = ds;
    }
}


