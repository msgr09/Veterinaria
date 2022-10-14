/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author Marlon gonzalez
 */
public class Canino extends Animal {
    private String entreno;
    
    
    public Canino(String nombre,String raza,String color,String  edad,String entreno){
        super(nombre, raza, color, edad);
        this.entreno=entreno;
        
    }
    @Override
    public String listarDatos(){
        return super.listarDatos()+"Entreno: " +entreno;
    }
     
    public String getEntreno() {
        return entreno;
    }

    public void setEntreno(String entreno) {
        this.entreno = entreno;
    }
    
    
    
}
