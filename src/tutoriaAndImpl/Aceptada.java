/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriaAndImpl;

/**
 *
 * @author Administrador
 */
public class Aceptada implements EstadoTutoria{

    @Override
    public String getNombre() {
        return "Aceptada";
    }

    @Override
    public void aceptar(Tutoria tutoria) {
        System.out.println("Tutoria ya está aceptada.");
    }

    @Override
    public void rechazar(Tutoria tutoria) {
        tutoria.cambiarEstado(new Rechazada());
    }

    @Override
    public void completar(Tutoria tutoria) {
        tutoria.cambiarEstado(new Completada());
    }
    
}
