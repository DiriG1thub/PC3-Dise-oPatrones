/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.List;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class VistaLista implements VistaTutoria{

    @Override
    public void mostrar(List<Tutoria> tutorias) {
        System.out.println("Vista: lista de Tutorías:");
        for (Tutoria t : tutorias){
            System.out.println("Tutoría con " + t.getTutor().getNombre() + " y " + t.getEstudiante().getNombre() 
                + ", Fecha: " + t.getFecha() + ", Estado: " + t.getEstado().getNombre());
        }
    }
    
}
