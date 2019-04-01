/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

import java.util.Random;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Herramientas {
    
    public static double distancias [][];
    
    public static void generarDistanciasAletorias(int numCiudades,int limDistancia){
        distancias = new double[numCiudades][numCiudades];
        Random ran = new Random();
        
        for (int x=0; x< numCiudades;x++)
            for(int y=x; y < numCiudades;y++){
              
                double dist = ran.nextInt(limDistancia)+0.1;
                if (x==y) {distancias[x][y]=0;}else{
                distancias[x][y] = dist;
                distancias[y][x] = dist;
                }
               
            }
           
    }
    
    public static void cargarDistancias(double distancias [][]){
        distancias = distancias;
    }
    public static void cargarDistancias(){
    
    }
    
    public static void guardarDistancias(){
    
    }
    
    
}
