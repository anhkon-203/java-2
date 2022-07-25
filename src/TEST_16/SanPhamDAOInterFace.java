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
public interface SanPhamDAOInterFace {
    public void insert(sanPham sp);
    public void update(int vitri,sanPham sp);
    public void delete(int vitri);
    public sanPham getById(int vitri);
    public ArrayList<sanPham> getlist();
    public void setList (ArrayList<sanPham> ds);
}
