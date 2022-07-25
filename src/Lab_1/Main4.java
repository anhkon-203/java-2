/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab_1;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class Main4 {

    public static void main(String[] args) {
        Product a[] = new Product[3];
        for (int i = 0; i < 3; i++) {
            if (i != 0) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                double price = scanner.nextDouble();
                a[i] = new Product(name, price);
                a[i].insert();
                a[i].update();
                a[i].delete();
                a[i].select();

            } else {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Nhập tên sản phẩm: ");
                String name = scanner.nextLine();
                System.out.print("Nhập giá sản phẩm: ");
                double price = scanner.nextDouble();
                a[i] = new No_Tax_Product(name, price);
                a[i].insert();
                a[i].update();
                a[i].delete();
                a[i].select();
            }

        }

        for (int i = 0; i < 3; i++) {
            System.out.printf("tên SP: %s - giá SP: %.2f - thuế: %.2f \n", a[i].getName(), a[i].getPrice(), a[i].getImportTax());
        }
    }
}
