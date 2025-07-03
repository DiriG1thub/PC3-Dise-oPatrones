/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;
import observer.Observer;
/**
 *
 * @author Administrador
 */
public class Estudiante extends Usaurio implements Observer{

    public Estudiante(String nombre, String correo) {
        super(nombre, correo);
    }

    @Override
    public void actualizar(String mensaje) {
        System.out.println("Notificación al estudiante " + nombre + ": " + mensaje);
    }
    
}
