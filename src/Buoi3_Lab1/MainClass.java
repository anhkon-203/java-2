/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Buoi3_Lab1;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class MainClass {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLiProduct qlp = new QuanLiProduct();
        while (true) {
            MainClass.menu();
            int chon = Integer.parseInt(sc.nextLine());
            if (chon == 0) {
                break;
            }
            switch (chon) {
                case 1:
                    System.out.println("Nhập tên sản phẩm:");
                    String name = sc.nextLine();
                    System.out.println("Nhập giá sản phẩn");
                    String price = sc.nextLine();

                    Product p = new Product("Hoa",2000);
                   qlp.insert(p);
                    break;

                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                default:
                    System.out.println("Chức năng sai!");
            }
        }
    }

    public static void menu() {
        System.out.println("-----------------------");
        System.out.println("Nhập:");
        System.out.println("\t1. Thêm sản phẩm");
        System.out.println("\t2. Cập nhật sản phẩm");
        System.out.println("\t3. Xoá sản phẩm");
        System.out.println("\t4. Xuất danh sách sản phẩm");
        System.out.println("\t5. Tìm sản phẩm theo vị trí");
        System.out.println("\t0. Thoát");
        System.out.println("-----------------------");
    }
}
