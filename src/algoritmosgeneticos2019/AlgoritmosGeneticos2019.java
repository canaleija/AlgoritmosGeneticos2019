/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos2019;

import equiscuadrada.GeneticoX2;
import equiscuadrada.Individuo;
import equiscuadrada.Poblacion;
import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmosGeneticos2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GeneticoX2 x2 = new GeneticoX2(100,50,0.3);
        x2.evolucionar();
    }
    
}
