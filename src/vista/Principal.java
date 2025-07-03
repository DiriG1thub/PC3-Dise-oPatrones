/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vista;

import comnand.ReprogramarComnand;
import entidades.AdminProxy;
import entidades.Administrador;
import entidades.Estudiante;
import entidades.Tutor;
import java.util.Arrays;
import java.util.List;
import memento.HistoCambios;
import tutoriaAndImpl.Tutoria;

/**
 *
 * @author Administrador
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear usuarios
        Tutor tutor = new Tutor("Carlos", "carlos@uni.edu");
        Estudiante estudiante = new Estudiante("Ana", "ana@uni.edu");
        Administrador admin = new Administrador("Luis", "luis@uni.edu", Arrays.asList("admin"));
        AdminProxy adminProxy = new AdminProxy(admin);

        // Crear tutoría
        Tutoria tutoria = new Tutoria(tutor, estudiante, "2025-07-10");

        // Crear historial para undo
        HistoCambios historial = new HistoCambios();

        // Mostrar estado inicial
        System.out.println("Estado inicial: " + tutoria.getEstado().getNombre());

        // Guardar y cambiar estado a aceptada
        historial.guardarEstado(tutoria);
        tutoria.aceptar();

        // Guardar y reprogramar sesión
        historial.guardarEstado(tutoria);
        adminProxy.ejecutarComando(new ReprogramarComnand(tutoria, "2025-07-12"));

        // Mostrar tutorías con vista lista
        List<Tutoria> tutorias = Arrays.asList(tutoria);
        VistaTutoria vistaLista = new VistaLista();
        vistaLista.mostrar(tutorias);

        // Deshacer último cambio y mostrar de nuevo
        System.out.println("Revirtiendo último cambio...");
        historial.deshacer(tutoria);
        vistaLista.mostrar(tutorias);
    }
    
}
