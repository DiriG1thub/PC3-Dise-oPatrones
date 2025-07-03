/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comnand;

import entidades.Tutor;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class AsignarTutorCommand implements Comnand{
    private Tutoria tutoria;
    private Tutor nuevoTutor;

    public AsignarTutorCommand(Tutoria tutoria, Tutor nuevoTutor) {
        this.tutoria = tutoria;
        this.nuevoTutor = nuevoTutor;
    }
    
    @Override
    public void ejecutar() {
        tutoria.setTutor(nuevoTutor);
        tutoria.notificar("Tutor asignado: " + nuevoTutor.getNombre());
    }
    
}
