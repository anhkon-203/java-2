/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3_Lab1;

import java.util.ArrayList;

/**
 *
 * @author anhkon
 */
public class QuanLiProduct implements ProductDAOInterface {

    ArrayList<Product> list;

    public QuanLiProduct() {
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
    public ArrayList<Product> getList() {

        return this.list;

    }

    @Override
    public Product getById(int viTri) {
        return this.list.get(viTri);
    }

    public void insert(Product product, double i) {
    }

}
