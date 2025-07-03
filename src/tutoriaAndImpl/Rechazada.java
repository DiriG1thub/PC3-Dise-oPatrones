/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriaAndImpl;

/**
 *
 * @author Administrador
 */
public class Rechazada implements EstadoTutoria{

    @Override
    public String getNombre() {
        return "Rechazada";
    }

    @Override
    public void aceptar(Tutoria tutoria) {
        System.out.println("No se puede aceptar una tutoría rechazada.");
    }

    @Override
    public void rechazar(Tutoria tutoria) {
        System.out.println("Tutoria ya está rechazada.");
    }

    @Override
    public void completar(Tutoria tutoria) {
        System.out.println("No se puede completar una tutoria rechazada.");
    }
    
}
