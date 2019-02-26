/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Manager {
    
    private String id;
    private int nG;
    private boolean ejecucion;
    private ArrayList<GeneticoNReinas> geneticos;
    private ArrayList<Configuracion> configuraciones;
    private int reinas;
    public Manager (String id, int reinas){
        this.reinas = reinas;
        this.nG = 0;
        this.ejecucion = false;
        this.geneticos = new ArrayList<>();
        this.configuraciones = new ArrayList<>();
        this.id = id;
    }
    public void generarGeneticos(ArrayList<Configuracion> configuraciones){
    // crear los geneticos en base a las configuraciones
    this.nG = configuraciones.size();
    for (int x=0; x<nG;x++){
        this.configuraciones.add(configuraciones.get(x));
        GeneticoNReinas gen = new GeneticoNReinas(configuraciones.get(x));
        this.geneticos.add(gen);
    }
    }
    public void generarGeneticos(int nG){
    // crear los geneticos en base a las configuraciones
    for (int x=0; x<nG;x++){
        this.configuraciones.add(new Configuracion(this.reinas));
        GeneticoNReinas gen = new GeneticoNReinas(configuraciones.get(x));
        this.geneticos.add(gen);
    }
    }
    public void ejecutarGeneticos(){
    // ejecutar los geneticos en un hilo diferente
    for (GeneticoNReinas aux: this.geneticos){
    Thread hilo = new Thread(aux);
    hilo.start();
    }
    this.ejecucion = true;
    }
    
    
}
