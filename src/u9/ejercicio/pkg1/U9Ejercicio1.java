/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package u9.ejercicio.pkg1;

import Entidades.Animal;
import Entidades.Caballo;
import Entidades.Gato;
import Entidades.Perro;

/**
 *
 * @author eliam
 */
public class U9Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Animal perro=new Perro("Stich", "Carnivoro", 15, "Doberman");
       perro.Alimentarse();
       Perro perro1=new Perro("Teddy", "Croquetas", 10, "Chihuahua");
       perro1.Alimentarse();
       
       Animal gato= new Gato("Pelusa", "Galletas",15, "Siames");
       gato.Alimentarse();
       
       Animal caballo=new Caballo("Spark","Pasto", 25, "Fino");
    }
    
}
