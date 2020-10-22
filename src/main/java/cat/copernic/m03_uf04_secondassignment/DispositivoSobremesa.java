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
public abstract class DispositivoSobremesa extends Dispositivos implements Conectable {

    public DispositivoSobremesa(String nombre, String discripcion, double precio) {
        super(nombre, discripcion, precio);
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando Dispositivo sobremesa");
    }

    @Override
    public void conecta() {
        System.out.println("Conectando Dispositivo sobremesa");
    }

}
