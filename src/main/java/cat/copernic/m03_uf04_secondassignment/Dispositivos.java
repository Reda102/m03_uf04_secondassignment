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
public abstract class Dispositivos implements Conectable {

    private String nombre;
    private String discripcion;
    private double precio;

    public Dispositivos(String nombre, String discripcion, double precio) {
        this.nombre = nombre;
        this.discripcion = discripcion;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDiscripcion() {
        return discripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDiscripcion(String discripcion) {
        this.discripcion = discripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "dispositivos{" + "nombre=" + nombre + ", discripcion=" + discripcion + ", precio=" + precio + '}';
    }

    @Override
    public void conecta() {
        System.out.println("Conectando Dispositivo  ");
    }

    @Override
    public void desconecta() {
        System.out.println("Desconectando Dispositivo  ");
    }

}
