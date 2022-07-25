package buoi2_lt1;

// Data Access Object

import java.util.ArrayList;

public interface NguoiDAOInterface {
    public void insert(Nguoi nguoi);
    public void update(int viTri, Nguoi nguoi);
    public void delete(int viTri);
    public ArrayList<Nguoi> getList();
    public Nguoi getByIndex(int viTri);
}
