/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package LAB4;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public interface NhanVienDAO {

    public void insert(NhanVien nv);

    public void update(int viTri, NhanVien nv);

    public void delete(int viTri);

    public ArrayList<NhanVien> getList();

    public NhanVien getById(int viTri);

}
