/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package test23_t6;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QLSV implements SVDAO{
    ArrayList<SinhVien> list;
    public QLSV(){
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(SinhVien sv) {
        this.list.add(sv);
        
    }

    @Override
    public void update(int viTri, SinhVien sv) {
         this.list.set(viTri, sv);
    }
    @Override
    public void delete(int viTri) {
         this.list.remove(viTri);
    }

    @Override
    public SinhVien getById(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public ArrayList<SinhVien> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<SinhVien> ds) {
        this.list = ds;
    }
    
}
