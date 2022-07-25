/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TEST26;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QLKH implements DAOKhachHang{
    ArrayList<KhachHang> list;
    public QLKH(){
        this.list = new ArrayList<>();
    }

    @Override
    public void insert(KhachHang kh) {
        this.list.add(kh);
        
    }

    @Override
    public void update(int viTri, KhachHang kh) {
        this.list.set(viTri, kh);
    }

    @Override
    public KhachHang getById(int viTri) {
        return this.list.get(viTri);
    }

    @Override
    public ArrayList<KhachHang> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<KhachHang> ds) {
        this.list = ds;
    }
   
}
