/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsat;

import nsat.Individuo;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Muta {
    public static void mutaBit(double prob,Individuo ind){
    // evaluar la probabilidad 
    double aux = Math.random();
    if(aux<=prob){
        // modificar un bit del genotipo
        Random ran = new Random();
        int pos = ran.nextInt(ind.getGenotipo().length);
        if(ind.getGenotipo()[pos]==1){
        ind.getGenotipo()[pos]=0;
        }else{
        ind.getGenotipo()[pos]=1;
        }
        // actualizamos el fenotipo y el fitness
        ind.actualizarIndividuo();
        
    }
    }
}
