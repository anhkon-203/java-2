/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_interface;

/**
 *
 * @author anhkon
 */
public class Bird implements Animal{
    @Override
    public void an(){
        System.out.println("Sâu bọ");
    }
    @Override
    public void diChuyen(){
        System.out.println("Bay");
    }
    @Override
    public void tiengKeu(){
        System.out.println("Hót");
    }
}
