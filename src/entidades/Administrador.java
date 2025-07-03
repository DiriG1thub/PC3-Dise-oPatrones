/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author Administrador
 */
public class Administrador extends Usaurio{
    private List<String> permisos;
    
    public Administrador(String nombre, String correo, List<String> asList) {
        super(nombre, correo);
    }
    
    public boolean tienePermiso(String permiso){
        return permisos.contains(permiso);
    }
}
