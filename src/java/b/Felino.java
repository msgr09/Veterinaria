/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author Marlon gonzalez
 */
public class Felino extends Animal {
    private String toxoplasmosis;
    
    
    public Felino(String nombre,String raza,String color,String edad,String toxoplasmosis){
        super(nombre, raza, color, edad);
        this.toxoplasmosis=toxoplasmosis;
    }
    @Override
    public String listarDatos(){
        return super.listarDatos()+"Toxoplasmosis: "+toxoplasmosis;
    }

    
    public String getToxoplasmosis() {
        return toxoplasmosis;
    }

    public void setToxoplasmosis(String toxoplasmosis) {
        this.toxoplasmosis = toxoplasmosis;
    }
    /*
    public String toString(){
      return("Nombre: "+nombre+"Raza: "+raza+"Color: "+color+"Edad: "+edad+"Toxoplasmosis");

    }
*/
}

