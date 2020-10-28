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
public class Detalle {

    private int id;
    private Item item;
    private int cantidad;

    public Detalle(int id, Item item, int cantidad) {
        this.id = id;
        this.item = item;
        this.cantidad = cantidad;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Detalle{" + "id=" + id + ", item=" + item + ", cantidad=" + cantidad + '}';
    }
}
