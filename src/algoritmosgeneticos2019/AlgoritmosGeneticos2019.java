/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos2019;

import java.util.ArrayList;
import nreinas.GeneticoNReinas;
import nreinas.Individuo;
import nreinas.Poblacion;


/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmosGeneticos2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneticoNReinas gen = new GeneticoNReinas(10,100, 0.2,10);
        //gen.setPorMuestra(0.2);
        gen.evolucionar();
        System.out.println();
    }
    
}
