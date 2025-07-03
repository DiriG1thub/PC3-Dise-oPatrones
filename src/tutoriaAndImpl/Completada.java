/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriaAndImpl;

/**
 *
 * @author Administrador
 */
public class Completada implements EstadoTutoria{

    @Override
    public String getNombre() {
        return "Completada";
    }

    @Override
    public void aceptar(Tutoria tutoria) {
        System.out.println("La tutoria ya fue completada.");
    }

    @Override
    public void rechazar(Tutoria tutoria) {
        System.out.println("No se puede rechazar una tutoria completada.");
    }

    @Override
    public void completar(Tutoria tutoria) {
        System.out.println("Tutoria ya esta completada.");
    }
    
}
