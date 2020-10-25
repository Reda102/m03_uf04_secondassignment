/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

/**
 *
 * @author pep
 *
 * id, cantidad, Item (propiedad de item)
 *
 */
public class Detalle extends Item {

    private int cantidad;
    private double peso;
    private String lugarDeCompra;

    public Detalle(int cantidad, double peso, String lugarDeCompra, double precio, String nombre, String discripcion, int id) {
        super(precio, nombre, discripcion, id);
        this.cantidad = cantidad;
        this.peso = peso;
        this.lugarDeCompra = lugarDeCompra;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getLugarDeCompra() {
        return lugarDeCompra;
    }

    public void setLugarDeCompra(String lugarDeCompra) {
        this.lugarDeCompra = lugarDeCompra;
    }

    @Override
    public String toString() {
        return "Detalle{" + "cantidad=" + cantidad + ", peso=" + peso + ", lugarDeCompra=" + lugarDeCompra + '}';
    }

}
