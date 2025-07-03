/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tutoriaAndImpl;
import entidades.Tutor;
import entidades.Estudiante;
import observer.Observer;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Administrador
 */
public class Tutoria {
    private Tutor tutor;
    private Estudiante estudiante;
    private String fecha;
    private EstadoTutoria estado;
    private List<Observer> observers;

    public Tutoria(Tutor tutor, Estudiante estudiante, String fecha) {
        this.tutor = tutor;
        this.estudiante = estudiante;
        this.fecha = fecha;
        this.estado = new Solicitada();
        this.observers = new ArrayList<>();
        observers.add(tutor);
        observers.add(estudiante);
    }
    
    public void cambiarEstado(EstadoTutoria nuevoEstado){
        this.estado = nuevoEstado;
        notificar("Estado cambiado a " + estado.getNombre() + " para tutoria del " + fecha);
    }
    
    public void aceptar(){
        estado.aceptar(this);
    }

    public void rechazar(){
        estado.rechazar(this);
    }

    public void completar(){
        estado.completar(this);
    }

    public void notificar(String mensaje) {
        for (Observer o : observers) {
            o.actualizar(mensaje);
        }
    }

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor){
        this.tutor = tutor;
    }

    public Estudiante getEstudiante(){
        return estudiante;
    }

    public String getFecha(){
        return fecha;
    }

    public void setFecha(String fecha){
        this.fecha = fecha;
    }

    public EstadoTutoria getEstado(){
        return estado;
    }
    
    
}
