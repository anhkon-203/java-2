/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Test_21thg6;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface SPDAO {
    public void insert(sanPham sp);
    public void update(int viTri,sanPham sp);
    public void delete(int viTri);
    public sanPham getbyID(int viTri);
    public ArrayList<sanPham> getList();
    public void setList(ArrayList<sanPham> ds);
}
