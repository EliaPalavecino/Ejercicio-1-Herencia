/*
Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendra como atributos el nombre, alimento, edad y raza del Animal.
Crear un metodo en la clase Animal a traves del cual cada clase hija debera mostrar luego un mensaje por pantalla informando de que se alimenta.La clase Main esta determinado.   
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
