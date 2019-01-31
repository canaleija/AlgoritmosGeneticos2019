/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equiscuadrada;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int genotipo[];
    private int fenotipo;
    private int fitness;

    public Individuo() {
        this.genotipo = generarGenotipoAleatorio();
        // calculamos el fenotipo 
        this.fenotipo = calcularFenotipo();
        this.fitness = this.fenotipo*this.fenotipo;
    }
    public Individuo(int genotipo[]){
        this.genotipo = genotipo.clone();
        this.fenotipo = calcularFenotipo();
        this.fitness = this.fenotipo*this.fenotipo;
    }
    private int[] generarGenotipoAleatorio() {
        int aux [] = new int[12];
        Random ran = new Random();
        for(int x=0; x<aux.length;x++)
            aux[x]= ran.nextInt(2);
        return aux;
    }
    public void actualizarIndividuo(){
     this.fenotipo = calcularFenotipo();
        this.fitness = this.fenotipo*this.fenotipo;
    }

    private int calcularFenotipo() {
      // convertir el arreglo de bits a base 10
      int suma = 0;
      for(int x=0; x<this.genotipo.length;x++){
          if (this.genotipo[x]==1){
            suma+= Math.pow(2,this.genotipo.length-1-x);
          }
      }
      return suma;
    }

    /**
     * @return the genotipo
     */
    public int[] getGenotipo() {
        return genotipo;
    }

    /**
     * @return the fenotipo
     */
    public int getFenotipo() {
        return fenotipo;
    }

    /**
     * @return the fitness
     */
    public int getFitness() {
        return fitness;
    }
    
    
    
}
