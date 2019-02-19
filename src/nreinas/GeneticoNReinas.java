/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;


import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Roberto Cruz Leija
 */
public class GeneticoNReinas {
    // parametros
    private Poblacion poblacionActual;
    private int numG,tamP;
    private double pMuta;
    private int n;
    private double porMuestra;
    

    public GeneticoNReinas(int numG, int tamP, double pMuta, int n) {
        this.numG = numG;
        this.tamP = tamP;
        this.pMuta = pMuta;
        this.poblacionActual = new Poblacion(tamP,n);
        this.n = n;
    }
    
    public void evolucionar(){
    int mascara[] = Cruza.generarMascaraAleatoria(n);
    // generar las itereaciones para las generaciones
    for(int g=1;g<this.numG;g++){
        // garantizar construir una nueva población
        ArrayList<Individuo> ind;
        // calcular un N
        int n = (int)(this.tamP*this.porMuestra);
        if (n>0){
        n = 1;
        ind = new ArrayList<>();
        ind.add(this.poblacionActual.getMejor());
        
        }else {
        ind = new ArrayList<>();
        }
        for(int i=n; i<this.tamP;i++){
            // seleccionamos
            Individuo madre = Seleccion.seleccionAleatoria(this.poblacionActual);
            Individuo padre = Seleccion.seleccionAleatoria(this.poblacionActual);
            // reproducimos
            Individuo hijo = Cruza.cruzaXMascara(mascara, madre, padre);
            // mutamos 
            // evaluar la probabilidad
            Muta.mutaGen(pMuta, hijo);
            // agregamos
            ind.add(hijo);
        }
        // actualizamos la nueva población
        this.poblacionActual = new Poblacion(ind);
      //System.out.println(g);
      // pedimos el mejor a la poblacion 
    Individuo mejor  = this.poblacionActual.getMejor();
    int f = mejor.getFitness();
    System.out.println("g: "+g+" f:"+f);
    if(f==0){
        
        System.out.println("g: "+g+" "+Arrays.toString(mejor.getGenotipo()));
    
        break;
    }
    }
    // pedimos el mejor a la poblacion 
//    Individuo mejor  = this.poblacionActual.getMejor();
//    System.out.println(mejor.getFitness());
    //System.out.println(Arrays.toString(mejor.getGenotipo()));
    }

    /**
     * @param porMuestra the porMuestra to set
     */
    public void setPorMuestra(double porMuestra) {
        this.porMuestra = porMuestra;
    }
    
}
