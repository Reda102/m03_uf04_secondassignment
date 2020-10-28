/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

import exercicilliure.AntenaWifi;
import exercicilliure.CarritoDeLaCompra;
import exercicilliure.Detalle;
import exercicilliure.Item;
import exercicilliure.Pendrive;
import exercicilliure.ReproductoMusica;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {

    public static void main(String[] args) {
        /**
         * Dispositivos dispo1 = new Ordenador("Alienware", "Alien al poder",
         * 720.0); dispo1.conecta();
         *
         * Dispositivos dispo2 = new TerminalDeVenta("Terminal", "El mundo en
         * tus manos", 1720.0); dispo2.conecta();
         *
         * dispo1.desconecta(); dispo2.desconecta();
         *
         *
         * *
         */
        CarritoDeLaCompra p = new CarritoDeLaCompra();

        Item Producto1 = new AntenaWifi(30.0, 5.5, "ALFA", "La señal en tu mano", 1);
        Item Producto2 = new Pendrive(300, 15.0, "KINGSTON", "TU USB", 2);
        Item Producto3 = new ReproductoMusica(200, 30.5, "IPAD", "la musica en tu bolsillo", 3);

       /** p.añade(Producto1);
        p.añade((Detalle) Producto2);
        p.añade((Detalle) Producto3);

        p.elimina((Detalle) Producto3);  */

        p.checkout();

    }

}
