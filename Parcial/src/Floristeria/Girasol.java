/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Floristeria;

/**
 *
 * @author UDEC-3009013
 */

import javax.swing.JOptionPane;


public class Girasol extends Flor{
    
    //Atributos
    private String Espinas;
    //constructor

    public Girasol(String Espinas, String Especie, String Color, String Tamaño, String Precio) {
        super(Especie, Color, Tamaño, Precio);
        this.Espinas = Espinas;
    }

     public void Leer2(){
          Precio = JOptionPane.showInputDialog(" Ingrese El precio del Girasol ");
        Color = JOptionPane.showInputDialog(" Cual es el color de la rosa. ");
         Especie = JOptionPane.showInputDialog(" Cual Es la Especie del Girazol  ");
         Espinas = JOptionPane.showInputDialog(" La Rosa tiene Espinas si o no ");
       Tamaño = JOptionPane.showInputDialog(" Ingrese El Tamaño de la Rosa ");
     }
    
    public void mdatos1(){
        JOptionPane.showMessageDialog(null,"Especie de la Rosa : "+getEspecie()+" \n La Rosa "+Espinas+" Espinas. "+"\n Color de la Rosa es: "+getColor()+" el Tamaño de laRosa es:"+getTamaño()+" El precio de la Rosa es: "+getPrecio());
    }
}
