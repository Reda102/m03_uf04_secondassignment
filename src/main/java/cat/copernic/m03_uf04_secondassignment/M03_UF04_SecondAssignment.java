/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.copernic.m03_uf04_secondassignment;

/**
 *
 * @author pep
 */
public class M03_UF04_SecondAssignment {

    public static void main(String[] args) {
        Dispositivos dispo1 = new Ordenador("Alienware", "Alien al poder", 720.0);
        dispo1.conecta();

        Dispositivos dispo2 = new TerminalDeVenta("Terminal", "El mundo en tus manos", 1720.0);
        dispo2.conecta();

        dispo1.desconecta();
        dispo2.desconecta();
    }

}
