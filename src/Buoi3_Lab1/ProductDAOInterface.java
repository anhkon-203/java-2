
package Buoi3_Lab1;

import java.util.ArrayList;


public interface ProductDAOInterface {
    public void insert(Product p);
    public void update(int viTri,Product p);
    public void delete(int viTri);
    public ArrayList<Product> getList();
    public Product getById(int viTri);
    
}
