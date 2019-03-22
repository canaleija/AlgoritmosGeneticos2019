/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsat;

import nsat.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoNSAT {
    // parametros
    private Poblacion poblacionActual;
    private int numG,tamP;
    private double pMuta;

    public GeneticoNSAT(int numG, int tamP, double pMuta) {
        this.numG = numG;
        this.tamP = tamP;
        this.pMuta = pMuta;
        this.poblacionActual = new Poblacion(tamP);
        //mejor();
    }
    
    public void evolucionar(){
    int mask[] = Cruza.generarMascaraAleatoria(100);
    Individuo mejor = null;
    // generar las itereaciones para las generaciones
    for(int g=1;g<this.numG;g++){
        // garantizar construir una nueva población
        ArrayList<Individuo> ind = new ArrayList<>();
        for(int i=0; i<this.tamP;i++){
            // seleccionamos
            Individuo madre = Seleccion.seleccionTorneo(this.poblacionActual);
            Individuo padre = Seleccion.seleccionAleatoria(this.poblacionActual);
            
            // reproducimos
            Individuo hijo = Cruza.cruzaXMascara(mask, madre, padre);
            // mutamos 
                // evaluar la probabilidad
            Muta.mutaBit(pMuta, hijo);
            // agregamos
            ind.add(hijo);
        }
        // actualizamos la nueva población
        this.poblacionActual = new Poblacion(ind);
       // pedimos el mejor a la poblacion 
       mejor  = this.poblacionActual.getMejor();
   
        System.out.println(g+": "+mejor.getFitness());
    }
    
    System.out.println(mejor.getFitness());
    System.out.println(Arrays.toString(mejor.getGenotipo()));
    }

    private void mejor() {
       Individuo i = new Individuo(new int[]{0, 0, 0, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 0, 1, 1, 1, 0});
       this.poblacionActual.getIndivduos().add(i);
    }
    
}
