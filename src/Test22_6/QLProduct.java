/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Test22_6;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QLProduct implements ProductDAO{
    ArrayList<Product> list;
    public QLProduct(){
        this.list = new ArrayList<>();
    }
    @Override
    public void insert(Product p) {
      this.list.add(p);
    }
    @Override
    public void update(int viTri, Product p) {
        this.list.set(viTri, p);
        
    }

    @Override
    public void delete(int viTri) {
        this.list.remove(viTri);
     
    }
   

    @Override
    public Product getById(int viTri) {
        return this.list.get(viTri);
          }

    @Override
    public ArrayList<Product> getList() {
        return this.list;
    }

    @Override
    public void setList(ArrayList<Product> ds) {
        this.list = ds;
    }
    
}
