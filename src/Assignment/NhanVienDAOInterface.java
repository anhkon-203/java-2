/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Assignment;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface NhanVienDAOInterface {
    public void insert(NhanVien nv);
    public void update(int viTri,NhanVien nv);
    public void delete(int viTri);
    public  NhanVien getById(int viTri);
    public ArrayList<NhanVien> getList();
    public void setList(ArrayList<NhanVien> ds);
}