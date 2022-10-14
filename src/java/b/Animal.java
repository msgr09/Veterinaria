/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b;

/**
 *
 * @author Marlon gonzalez
 */
public class Animal {
    protected String nombre,raza,color;
    protected String edad;
    
    public Animal(){
        
    }
    public Animal(String nombre,String raza,String color,String edad){
        this.nombre=nombre;
        this.raza=raza;
        this.color=color;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }
   /* public String toString(){
        return("Nombre: "+nombre+"Raza: "+raza+"Color: "+color+"Edad: "+edad);
    }
   */

    public String  listarDatos() {
     return this.getClass().getSimpleName()+"\nNombre: "+nombre+"\nRaza: "+raza+"\nColor: "+color+"\nEdad: "+edad;
    }
}
