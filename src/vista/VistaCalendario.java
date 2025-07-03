/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class VistaCalendario implements VistaTutoria{

    @Override
    public void mostrar(List<Tutoria> tutorias) {
        System.out.println("Vista Calendario de Tutorías:");
        Map<String, List<Tutoria>> fechas = new HashMap<>();

        for (Tutoria t : tutorias){
            fechas.computeIfAbsent(t.getFecha(), k -> new java.util.ArrayList<>()).add(t);
        }

        for (String fecha : fechas.keySet()){
            System.out.println("Fecha: " + fecha);
            for (Tutoria t : fechas.get(fecha)) {
                System.out.println("  Tutoría con " + t.getTutor().getNombre() + " y " + t.getEstudiante().getNombre() 
                + ", Estado: " + t.getEstado().getNombre());
            }
        }
    }
    
}
