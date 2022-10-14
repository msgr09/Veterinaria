/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marlon gonzalez
 */
public class Veterinario {
   
    private List<Animal>lista;
    
    
    public Veterinario(){
        lista=new ArrayList<>();
    }
    public void registrar(Animal a){
        lista.add(a);
    }
    public List<Animal> getLista(){
        return lista;
    }
    public static String size() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    /*Canino A1=new Canino("Matias","Chihuahua","negro",3,5);
    
    ArrayList lista = new ArrayList();
    lista.
    */
}
