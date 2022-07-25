/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package TEST26;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface DAOKhachHang {
    public void insert(KhachHang kh);
    public void update(int viTri, KhachHang kh);
    public KhachHang getById(int viTri);
    public ArrayList<KhachHang> getList();
    public void setList(ArrayList<KhachHang> ds);
    
}
