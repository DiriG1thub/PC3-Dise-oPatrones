/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento;

import java.util.Stack;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class HistoCambios {
    private Stack<MementoTutoria> historial;

    public HistoCambios() {
        historial = new Stack<>();
    }
    
    public void guardarEstado(Tutoria tutoria){
        historial.push(new MementoTutoria(tutoria.getEstado()));
    }
    
    public void deshacer(Tutoria tutoria){
        if(!historial.isEmpty()){
            MementoTutoria mement = historial.pop();
            tutoria.cambiarEstado(mement.getEstado());
            System.out.println("Accion deshacida");
        }else{
            System.out.println("No existen acciones a deshacer");
        }
    }
}
