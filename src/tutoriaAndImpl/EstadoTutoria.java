/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package tutoriaAndImpl;

/**
 *
 * @author Administrador
 */
public interface EstadoTutoria {
    String getNombre();
    void aceptar(Tutoria tutoria);
    void rechazar(Tutoria tutoria);
    void completar(Tutoria tutoria);
}
