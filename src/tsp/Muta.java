/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Muta {
   public static void mutaGen(double prob,Individuo ind){
       double aux = Math.random();
    if(aux<=prob){
        // modificar un bit del genotipo
        Random ran = new Random();
        int posGen = ran.nextInt(ind.getGenotipo().length-1)+1;
        int valor =ind.getGenotipo()[posGen]; 
        int posGen2= ran.nextInt(ind.getGenotipo().length-1)+1;
        ind.getGenotipo()[posGen] = ind.getGenotipo()[posGen2]; 
        ind.getGenotipo()[posGen2] = valor; 
        
        // actualizamos el fenotipo y el fitness
        ind.actualizarIndividuo();
        
    }
       
   }
}
