/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos2019;

import java.util.ArrayList;
import nreinas.GeneticoNReinas;
import nreinas.Individuo;
import nreinas.Manager;
import nreinas.Poblacion;
import nreinas.Seleccion;


/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmosGeneticos2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Manager mana = new Manager(100000, 100, 0.2, 0.2,new Seleccion.TipoSeleccion[]{Seleccion.TipoSeleccion.RANDOM,Seleccion.TipoSeleccion.TORNEO},15);
        GeneticoNReinas gen = new GeneticoNReinas(mana);
        gen.evolucionar();
        System.out.println();
    }
    
}
