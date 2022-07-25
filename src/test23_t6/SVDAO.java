/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package test23_t6;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface SVDAO {
    public void insert(SinhVien sv);
    public void update(int viTri,SinhVien sv);
    public void delete(int viTri);
    public SinhVien getById(int viTri);
    public ArrayList<SinhVien> getList();
    public void setList(ArrayList<SinhVien> ds);
}
