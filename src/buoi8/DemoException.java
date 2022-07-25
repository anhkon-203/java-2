/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi8;

import java.util.Scanner;

/**
 *
 * @author anhkon
 */
public class DemoException {

    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        
        for (int i = 0; i < 6; i++) {
            System.out.printf("Nhập giá trị thứ: %d", (i + 1));
            try {
                a[i] = Integer.parseInt(sc.nextLine());
                System.out.println("giá trị vừa nhập: " + a[i]);
            } catch (NumberFormatException e) {
                a = null;
                e.printStackTrace();
            } catch(NullPointerException e){
                System.out.println("Chưa khởi tạo");
                e.printStackTrace();
            } catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Ngoài phạm vi mảng");
                e.printStackTrace();
            }catch(Exception e){
                e.printStackTrace();
            }
            finally{
                System.out.println("Kết thúc xử lí phần tử" + (i+1));
            }
            
        }
        System.out.println("Kết thúc chương trình");
    }
}
