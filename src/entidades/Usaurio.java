/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Administrador
 */
public abstract class Usaurio {
    String nombre;
     String correo;
    
    
    public Usaurio(String nombre, String correo) {
        this.nombre = nombre;
        this.correo = correo;
    }
    
    public String getNombre() {
        return nombre;
    }
    
}
