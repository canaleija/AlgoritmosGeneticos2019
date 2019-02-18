/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
// TODO: PROGRAMAR LAS MUTAS
public class Muta {
    
  
    
    public static void mutaGen(double prob,Individuo ind){
    // evaluar la probabilidad 
    double aux = Math.random();
    if(aux<=prob){
        // modificar un bit del genotipo
        Random ran = new Random();
        int posGen = ran.nextInt(ind.getGenotipo().length);
        int posR = ran.nextInt(ind.getGenotipo().length);
        ind.getGenotipo()[posGen]=posR;
        // actualizamos el fenotipo y el fitness
        ind.actualizarIndividuo();
        
    }
    }
}
