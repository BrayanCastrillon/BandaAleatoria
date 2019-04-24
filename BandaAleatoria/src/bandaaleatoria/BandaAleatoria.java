/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria;

import bandaaleatoria.logica.Banda;

/**
 *
 * @author Estudiantes
 */
public class BandaAleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banda b = new Banda();
        b.crearBanda();
        System.out.println("Afinando la banda:\n");
        b.afinarBanda();
        System.out.println("\ntocando la banda:\n");
        b.tocarBanda();
    }
    
}
