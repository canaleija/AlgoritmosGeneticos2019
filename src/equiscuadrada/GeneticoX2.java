/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equiscuadrada;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoX2 {
    // parametros
    private Poblacion poblacionActual;
    private int numG,tamP;
    private double pMuta;

    public GeneticoX2(int numG, int tamP, double pMuta) {
        this.numG = numG;
        this.tamP = tamP;
        this.pMuta = pMuta;
        this.poblacionActual = new Poblacion(tamP);
    }
    
    public void evolucionar(){
    // generar las itereaciones para las generaciones
    for(int g=1;g<this.numG;g++){
        // garantizar construir una nueva población
        ArrayList<Individuo> ind = new ArrayList<>();
        for(int i=0; i<this.tamP;i++){
            // seleccionamos
            Individuo madre = Seleccion.seleccionAleatoria(this.poblacionActual);
            Individuo padre = Seleccion.seleccionAleatoria(this.poblacionActual);
            // reproducimos
            Individuo hijo = Cruza.cruzaXMascara(new int[]{1,1,1,1,1,1,0,0,0,0,0,0}, madre, padre);
            // mutamos 
                // evaluar la probabilidad
            Muta.mutaBit(pMuta, hijo);
            // agregamos
            ind.add(hijo);
        }
        // actualizamos la nueva población
        this.poblacionActual = new Poblacion(ind);
      System.out.println(g);
    }
    // pedimos el mejor a la poblacion 
    Individuo mejor  = this.poblacionActual.getMejor();
    System.out.println(mejor.getFenotipo());
    System.out.println(mejor.getFitness());
    System.out.println(Arrays.toString(mejor.getGenotipo()));
    }
    
}
