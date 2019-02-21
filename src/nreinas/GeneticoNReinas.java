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
    private Manager manager;

    

    public GeneticoNReinas(Manager manager) {
        this.manager = manager;
        this.poblacionActual = new Poblacion(this.manager.getTamPoblacion(),this.manager.getTamGenotipo());
        
    }
    
    public void evolucionar(){
   
    // generar las itereaciones para las generaciones
    for(int g=1;g<this.manager.getNumGeneraciones();g++){
        // garantizar construir una nueva población
        ArrayList<Individuo> ind;
        // calcular un N
        int n = (int)(this.manager.getTamPoblacion()*this.manager.getpMuestra());
        if (n>0){
        ind = new ArrayList<>();
        ind.add(this.poblacionActual.getMejor());
        
        }else {
        ind = new ArrayList<>();
        }
        for(int i=n; i<this.manager.getTamPoblacion();i++){
            // seleccionamos
            Individuo madre = this.manager.aplicarSeleccion(poblacionActual,0);
            Individuo padre = this.manager.aplicarSeleccion(poblacionActual,1);
            // reproducimos
            Individuo hijo = Cruza.cruzaXMascara(this.manager.getMask(), madre, padre);
            // mutamos 
            // evaluar la probabilidad
            Muta.mutaGen(this.manager.getProbMuta(), hijo);
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
     * @return the manager
     */
    public Manager getManager() {
        return manager;
    }
    
}
