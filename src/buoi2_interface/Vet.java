/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package buoi2_interface;

/**
 *
 * @author anhkon
 */
public class Vet implements Pet{

    @Override
    public void spa() {
        System.out.println("-------------");
    }

    @Override
    public void an() {
        System.out.println("Hạt");
    }

    @Override
    public void diChuyen() {
        System.out.println("Bay");
    }

    @Override
    public void tiengKeu() {
        System.out.println("NHẠI");
    }
    
}
