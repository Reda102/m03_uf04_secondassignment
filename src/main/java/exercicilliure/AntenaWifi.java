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
public class AntenaWifi extends Item{
    private double potenciaWifi;

    public AntenaWifi(double potenciaWifi, double precio, String nombre, String discripcion, int id) {
        super(precio, nombre, discripcion, id);
        this.potenciaWifi = potenciaWifi;
    }

    public double getPotenciaWifi() {
        return potenciaWifi;
    }

    public void setPotenciaWifi(double potenciaWifi) {
        this.potenciaWifi = potenciaWifi;
    }

    @Override
    public String toString() {
        return "AntenaWifi{" + "potenciaWifi=" + potenciaWifi + '}';
    }

    
  

    
    
}
