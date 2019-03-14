/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algoritmosgeneticos2019;

import java.util.ArrayList;
import nreinas.Configuracion;
import nreinas.Manager;
import nreinas.Seleccion;
import nsat.Clausula;
import nsat.Individuo;


/**
 *
 * @author Roberto Cruz Leija
 */
public class AlgoritmosGeneticos2019 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // configuraciones 
//        ArrayList<Configuracion> configuraciones = new ArrayList<>();
//        Configuracion c1 = new Configuracion(50000, 20, 0.2, 0.1, new Seleccion.TipoSeleccion[]{Seleccion.TipoSeleccion.RANDOM,Seleccion.TipoSeleccion.TORNEO}, 60);
//        Configuracion c2 = new Configuracion(50000, 50, 0.2, 0.1, new Seleccion.TipoSeleccion[]{Seleccion.TipoSeleccion.RANDOM,Seleccion.TipoSeleccion.TORNEO}, 60);
//        
//        configuraciones.add(c1);
//        configuraciones.add(c2);
//        // manager
//        Manager m = new Manager("Manager1",c1.getTamGenotipo());
//        m.generarGeneticos(configuraciones);
//        m.ejecutarGeneticos();

        Clausula.clausulas = new ArrayList<>();
        Clausula.clausulas.add(new Clausula(-1, 5, 3));
        Clausula.clausulas.add(new Clausula(1, -5, -2));
        Clausula.clausulas.add(new Clausula(8, 4, -9));
        Clausula.clausulas.add(new Clausula(10, -7, 6));
        Clausula.clausulas.add(new Clausula(4, -10, -3));
        
       // Individuo i = new Individuo(new int[]{1,1,1,1,1,1,1,1,1,1});
        Individuo i2 = new Individuo(new int[]{1,1,0,0,1,1,1,1,0,0});
       // Individuo i3 = new Individuo(new int[]{0,0,0,0,0,1,1,0,0,0});
        
        System.out.println();
        
        
    }
    
}
