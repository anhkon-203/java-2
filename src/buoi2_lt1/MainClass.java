package buoi2_lt1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NguoiDAOInterface qlds = new QuanLyDanhSach();
        
        while (true) {
            MainClass.menu();
            int chon = Integer.parseInt( sc.nextLine() );
            
            if (chon == 0) {
                break;
            }
            
            switch (chon) {
                case 1:
                    System.out.println("Nhập tên:");
                    String hoTen = sc.nextLine();
                    System.out.println("Nhập địa chỉ:");
                    String diaChi = sc.nextLine();
                    System.out.println("Nhập giới tính(1-Nam,0-Nữ):");
                    int gt = Integer.parseInt( sc.nextLine() );

                    Nguoi n = new Nguoi(hoTen, gt, diaChi);
                    qlds.insert(n);
                    break;
                case 2:
                    ArrayList<Nguoi> ds = qlds.getList();

                    for (Nguoi nguoi: ds) {
                        System.out.println(nguoi.xuatThongTin());
                    }

                    break;
                case 3:
                    SinhVien sv = new SinhVien("PH1", "UDPM",
                        "Ng Van A", 1, "HN");
                    
                    System.out.println( sv.xuatThongTin() );
                    
                    qlds.insert(sv);
                    break;
                default:
                    System.out.println("Không hợp lệ");
                    break;
            }
        }
    }

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("Nhập:");
        System.out.println("\t1. Thêm đối tượng");
        System.out.println("\t2. Xuất danh sách");
        System.out.println("\t3. Thêm Sinh Viên");
        System.out.println("\t0. Thoát");
        System.out.println("-----------------------");
    }
}
