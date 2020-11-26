/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Floristeria;


public class Flor {
    
    //Atributos
    String Especie, Color, Tamaño,Precio;
    //Atributos

    public Flor(String Especie, String Color, String Tamaño, String Precio) {
        this.Especie = Especie;
        this.Color = Color;
        this.Tamaño = Tamaño;
        this.Precio = Precio;
    }

    public String getEspecie() {
        return Especie;
    }

    public String getColor() {
        return Color;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public String getPrecio() {
        return Precio;
    }
 

      
    
}
