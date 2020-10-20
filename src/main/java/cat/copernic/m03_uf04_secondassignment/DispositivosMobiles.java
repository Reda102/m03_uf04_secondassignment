/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author Reda
 */
public abstract class DispositivosMobiles extends Dispositivos {

    public DispositivosMobiles(String nombre, String discripcion, double precio) {
        super(nombre, discripcion, precio);
    }

    abstract void reset();

    @Override
    public void desconecta() {
        System.out.println("Desconectando dispositivos móbiles");
    }

    @Override
    public void conecta() {
        System.out.println("Conectando dispositivos móbiles");
    }
    
}
