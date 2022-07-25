/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_interface;

/**
 *
 * @author anhkon
 */
public class dog implements Animal{
    @Override
    public void an(){
        System.out.println("Cơm");
    }
    @Override
    public void diChuyen(){
        System.out.println("Chạy");
    }
    @Override
    public void tiengKeu(){
        System.out.println("gâu");
    }
}
