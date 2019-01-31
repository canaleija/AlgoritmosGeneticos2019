/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equiscuadrada;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Poblacion {
    private ArrayList<Individuo> indivduos;

    public Poblacion(int numInd) {
        this.indivduos = new ArrayList<>();
        for(int x=0; x<numInd;x++)
            this.indivduos.add(new Individuo());
        
    }
    public Poblacion(ArrayList<Individuo> aux){
        this.indivduos = aux;
    }
    
    public ArrayList<Individuo> getNMejores(int n){
        return null;
    }
    public ArrayList<Individuo> getMuestraAleatoria(int n){
     return null;
    }
    public Individuo getMejor(){
     return null;
    }

    /**
     * @return the indivduos
     */
    public ArrayList<Individuo> getIndivduos() {
        return indivduos;
    }
    
    
}
