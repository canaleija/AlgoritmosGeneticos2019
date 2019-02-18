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
public class Individuo {
    
    private int genotipo[];
    private int fitness;
    private int n;

    public Individuo(int n) {
        this.n = n;
        this.genotipo = generarGenotipoAleatorio();
         calcularFitness();
    }
    public Individuo(int genotipo[]){
         this.n = genotipo.length;
         this.genotipo = genotipo.clone();
         calcularFitness();
    }
    private int[] generarGenotipoAleatorio() {
        int aux [] = new int[this.n];
        Random ran = new Random();
        for(int x=0; x<aux.length;x++)
            aux[x]= ran.nextInt(this.n);
        return aux;

    }
    public void actualizarIndividuo(){
    
       calcularFitness();
    }
   

    /**
     * @return the genotipo
     */
    public int[] getGenotipo() {
        return genotipo;
    }


    /**
     * @return the fitness
     */
    public int getFitness() {
        return fitness;
    }

    private void calcularFitness() {
       this.fitness = 0;
      // recorremos el genotipo
      for(int x=0;x<this.n-1;x++){
          for(int y=x+1;y<this.n;y++){
              // evaluamos los ataques
              int a = this.genotipo[x];
              int b = this.genotipo[y];
              int auxx = this.genotipo[x]-x;
              int auxy = this.genotipo[y]-y;
              int aux2x = this.genotipo[x]+x;
              int aux2y = this.genotipo[y]+y;
              if(a==b||auxx==auxy||aux2x==aux2y){
                  this.fitness+=2;
              }
          
          }
       }
            
    }
    
    
    
}
