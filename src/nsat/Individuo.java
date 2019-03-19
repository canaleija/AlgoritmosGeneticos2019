/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsat;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Individuo {
    
    private int genotipo[];
    private int fitness;

    public Individuo() {
        generarGenotipoAleatorio();
        calcularFitness();
    }
    public Individuo(int genotipo[]){
        this.genotipo = genotipo.clone();
        calcularFitness();
    }
    private void generarGenotipoAleatorio() {
        this.genotipo = new int[100];
        Random ran = new Random();
        for(int x=0; x< this.genotipo.length;x++)
             this.genotipo[x]= ran.nextInt(2);
       
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
        // recorrer las clausulas
        this.fitness = 0;
        for (Clausula c:Tokenizador.clausulas){
            if(verificarClausula(c)){
                this.fitness++;
            } 
        }
    }

    private boolean verificarClausula(Clausula c) {
       return (verificarNeg(c.getA())==1||
             verificarNeg(c.getB())==1||
                 verificarNeg(c.getC())==1);
            
    }

    private int verificarNeg(int a) {
       boolean negacion = false;
       int valor = -1;
       if(a<0){
           a*=-1;
           negacion = true;
           
       }
       if (negacion){
            valor = this.genotipo[a-1];
        if (valor==0){valor = 1;}else{
            valor = 0;
        }
       } else {
            valor = this.genotipo[a-1];
       }
       return valor;
    }
    
    
    
}
