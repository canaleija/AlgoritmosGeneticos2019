/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tsp;

/**
 *
 * @author Roberto Cruz Leija
 */
public class TSPMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double r1[] = new double[]{0,34.5,22.1,3,0.7};
        double r2[] = new double[]{34.5,0,11,45,895};
        double r3[] = new double[]{22.1,11,0,67.6,333};
        double r4[] = new double[]{3,45,67.6,0,2};
        double r5[] = new double[]{0.7,895,333,2,0};
        
        Herramientas.distancias = new double[][]{r1,r2,r3,r4,r5};
        
        Individuo i1 = new Individuo(5,4);
        Individuo i2 = new Individuo(5,0);
        Individuo i3 = new Individuo(5,2);
        Individuo i4 = new Individuo(5,1);
        Individuo i5 = new Individuo(5,3);
        System.out.println();
    }
    
}
