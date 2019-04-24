/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaleatoria.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {

    ArrayList<Musico> musicos = new ArrayList();

    public void crearBanda() {
        Random r = new Random();
        int cantidad = r.nextInt(20);
        for (int i = 0; i < cantidad; i++) {
            musicos.add(new Musico());
        }
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.asignarInstrumento(this.generarInstrumento(r.nextInt(9)));
        }
        int cont = musicos.size();
        System.out.println("La cantidad de músicos es: " + cont);
    }

    public void afinarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.afinarInstrumento();

        }
    }

    public void tocarBanda() {
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.tocarInstrumento();

        }
    }

    private Instrumento generarInstrumento(int aleatorio) {
        switch (aleatorio) {
            case 1:
                return new Guitarra();
            case 2:
                return new Guacharaca();
            case 3:
                return new Bateria();
            case 4:
                return new Cello();
            case 5:
                return new Flauta();
            case 6:
                return new Bajo();
            case 7:
                return new Piano();
            case 8:
                return new Theremin();
            default:
                return new Violin();
        }
    }

}
