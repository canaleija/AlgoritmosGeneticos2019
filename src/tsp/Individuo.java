/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;


import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int genotipo[];
    private double fitness;
    private int n;
    private int ci;
    

    public Individuo(int n, int ci) {
        this.n = n;
        this.ci = ci;
        generarGenotipoAleatorio();
         calcularFitness();
    }
    public Individuo(int genotipo[]){
         this.n = genotipo.length;
         this.ci = genotipo[0];
         this.genotipo = genotipo.clone();
         calcularFitness();
    }
    private void generarGenotipoAleatorio() {
       this.genotipo = new int[this.n];
        ArrayList<Integer> lista = new ArrayList<>();
        Random ran = new Random();
        // inicializar 
       
        for(int x=0; x<this.genotipo.length;x++){
            if(x!=this.ci)
            lista.add(x);
        }
         this.genotipo[0]=this.ci;
        for(int x=1; x<this.genotipo.length;x++){
             int i = ran.nextInt(lista.size());
             this.genotipo[x]=lista.remove(i);
        }
        
       
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
    public double getFitness() {
        return fitness;
    }

    private void calcularFitness() {
       int ultima = this.genotipo[this.n-1];
       int primera = this.genotipo[0];
       this.fitness = Herramientas.distancias[primera][ultima];
      // recorremos el genotipo
      for(int x=0;x<this.n-1;x++){
         this.fitness += Herramientas.distancias[this.genotipo[x]][this.genotipo[x+1]];
      
      }
     }
     
}
