/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_interface;

/**
 *
 * @author anhkon
 */
public class cat implements Animal{
   @Override
    public void an(){
        System.out.println("Cá,cơm,gà");
    }
    @Override
    public void diChuyen(){
        System.out.println("Chạy, nhảy");
    }
    @Override
    public void tiengKeu(){
        System.out.println("Meo");
    }
}
