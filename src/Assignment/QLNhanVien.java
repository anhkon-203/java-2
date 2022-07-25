/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Assignment;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QLNhanVien implements NhanVienDAOInterface{
  ArrayList<NhanVien> list;
     public QLNhanVien() {
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
    public NhanVien getById(int viTri) {
       
         return this.list.get(viTri);
    }

    @Override
    public ArrayList<NhanVien> getList() {
        
        return this.list;
          
    }

    @Override
    public void setList(ArrayList<NhanVien> ds) {
       this.list = ds;
    }
    
}
