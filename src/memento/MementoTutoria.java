/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import tutoriaAndImpl.EstadoTutoria;

/**
 *
 * @author Administrador
 */
class MementoTutoria {
    private EstadoTutoria estado;

    public MementoTutoria(EstadoTutoria estado) {
        this.estado = estado;
    }

    public EstadoTutoria getEstado() {
        return estado;
    }
    
    
}
