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
public class Tablet extends DispositivosMobiles {

    public Tablet(String nombre, String discripcion, double precio) {
        super(nombre, discripcion, precio);
    }

    @Override
    void reset() {
        System.out.println("La tablet se esta reseteando!!!");
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando la Tablet... ");
    }

    @Override
    public void conecta() {
        System.out.println("Conectando la Tablet... ");
    }
    
    
}
