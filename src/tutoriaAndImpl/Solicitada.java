/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriaAndImpl;

/**
 *
 * @author Administrador
 */
public class Solicitada implements EstadoTutoria{
    
    @Override
    public String getNombre() {
        return "Solicitada";
    }

    @Override
    public void aceptar(Tutoria tutoria) {
        tutoria.cambiarEstado(new Aceptada());
    }

    @Override
    public void rechazar(Tutoria tutoria) {
        tutoria.cambiarEstado(new Rechazada());
    }

    @Override
    public void completar(Tutoria tutoria) {
        System.out.println("Error al solicitar tutoria");
    }
    
}
