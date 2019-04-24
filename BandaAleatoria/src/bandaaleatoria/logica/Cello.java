/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.logica;

/**
 *
 * @author Estudiantes
 */
public class Cello implements Instrumento{

    @Override
    public void afinar() {
        System.out.println("afinando cello");
    }

    @Override
    public void tocar() {
        System.out.println("tocando cello");
    }
    
}
