/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

/**
 *
 * @author Reda
 */
public class Pendrive extends Detalle{
    //Gb del Pendrive
    private int capacidadMemoria; 

    public Pendrive(int capacidadMemoria, int cantidad, double peso, String lugarDeCompra, double precio, String nombre, String discripcion, int id) {
        super(cantidad, peso, lugarDeCompra, precio, nombre, discripcion, id);
        this.capacidadMemoria = capacidadMemoria;
    }

    public int getCapacidadMemoria() {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria) {
        this.capacidadMemoria = capacidadMemoria;
    }

    @Override
    public String toString() {
        return "Pendrive{" + "capacidadMemoria=" + capacidadMemoria + '}';
    }

  
    
}
