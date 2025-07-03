/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package comnand;

import tutoriaAndImpl.Rechazada;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class SuspenderComnand implements Comnand{
    private Tutoria tutoria;

    public SuspenderComnand(Tutoria tutoria) {
        this.tutoria = tutoria;
    }

    @Override
    public void ejecutar() {
        tutoria.cambiarEstado(new Rechazada());
        tutoria.notificar("Tutoría suspendida.");
    }
}
