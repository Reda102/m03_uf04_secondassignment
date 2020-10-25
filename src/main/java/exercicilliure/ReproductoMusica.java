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
public class ReproductoMusica extends Detalle {
    
    private int capacidadReproducto;

    public ReproductoMusica(int capacidadReproducto, int cantidad, double peso, String lugarDeCompra, double precio, String nombre, String discripcion, int id) {
        super(cantidad, peso, lugarDeCompra, precio, nombre, discripcion, id);
        this.capacidadReproducto = capacidadReproducto;
    }

    public int getCapacidadReproducto() {
        return capacidadReproducto;
    }

    public void setCapacidadReproducto(int capacidadReproducto) {
        this.capacidadReproducto = capacidadReproducto;
    }

    @Override
    public String toString() {
        return "ReproductoMusica{" + "capacidadReproducto=" + capacidadReproducto + '}';
    }

   
    
}
