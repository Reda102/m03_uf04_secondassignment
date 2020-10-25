/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicilliure;

import exercicilliure.AntenaWifi;
import java.util.ArrayList;

/**
 *
 * @author pep
 *
 * Implementa una ejercicio original con:
 *
 * Herencia
 *
 * Polimorfismo
 *
 * Intefaces
 *
 * Propiedades, etc.
 *
 *
 * Opcionalmente, usa este ejemplo para tu desarrollo.
 *
 * Fecha limite entrega Domingo 25 a las 12 de la noche.
 *
 *
 * No olvides implementar y verificar checkout()
 *
 */
public class CarritoDeLaCompra implements Finalizable {

    private ArrayList<Detalle> carrito = new ArrayList<>();

    public void añade(Detalle detalle) {
        carrito.add(detalle);
        System.out.println("Entrada al carrito");
    }

    public void elimina(Detalle detalle) {
        carrito.remove(detalle);
        System.out.println("Salida del carrito");
    }

    @Override
    public double checkout() {//total
        System.out.println("Compra terminada");
        return 1.0;
        
    }

}
