/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comnand;

import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class ReprogramarComnand implements Comnand{
    private Tutoria tutoria;
    private String nuevaFecha;

    public ReprogramarComnand(Tutoria tutoria, String nuevaFecha) {
        this.tutoria = tutoria;
        this.nuevaFecha = nuevaFecha;
    }
    
    
    @Override
    public void ejecutar() {
        tutoria.setFecha(nuevaFecha);
        tutoria.notificar("Sesión reprogramada al " + nuevaFecha);
    }
    
}
