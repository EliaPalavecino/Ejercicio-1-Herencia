/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author eliam
 */
public class Caballo extends Animal{
    
    public Caballo(String nombre, String alimento, Integer edad, String razaDelAnimal) {
        super(nombre, alimento, edad, razaDelAnimal);
    }
 @Override
 public void Alimentarse(){
     System.out.println("Caballo "+nombre+" se alimenta de "+alimento);
 }   
}
