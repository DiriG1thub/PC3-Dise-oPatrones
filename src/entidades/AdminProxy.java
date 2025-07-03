/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import comnand.Comnand;

/**
 *
 * @author Administrador
 */
public class AdminProxy {
    private Administrador administradorReal;

    public AdminProxy(Administrador administradorReal) {
        this.administradorReal = administradorReal;
    }
    
    public void ejecutarComando(Comnand comando) {
        if (administradorReal.tienePermiso("admin")) {
            comando.ejecutar();
        } else {
            System.out.println("Acceso denegado");
        }
    }
}
