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
 * Producte que volem comprar
 *
 * precio, descripcion, nombre, id **Usar Excepcion aqui**
 *
 * Se recomienda extender esta clase
 *
 *
 */
public abstract class Item {

    private double precio;
    private String nombre;
    private String discripcion;
    private int id;

    public Item(double precio, String nombre, String discripcion, int id) {
        this.precio = precio;
        this.nombre = nombre;
        if (nombre == " ") {
            throw new NullPointerException("EL nombre no puede estar vacia");
        }
        this.discripcion = discripcion;
        this.id = id;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscripcion() {
        return discripcion;
    }

    public void setDiscripcion(String discripcion) {
        this.discripcion = discripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Item{" + "precio=" + precio + ", nombre=" + nombre + ", discripcion=" + discripcion + ", id=" + id + '}';
    }

}
