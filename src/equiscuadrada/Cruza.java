/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package equiscuadrada;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Cruza {
    
    public static Individuo cruzaXMascara(int mask[], Individuo madre, Individuo padre){
        Individuo hijo1,hijo2;
        int geno1[] = new int[12];
        int geno2[] = new int[12];
    // recorrer la maskara de cruza
    for (int x=0; x<mask.length;x++){
        // 1 madre y 0 padre
        if(mask[x]==1){
            geno1[x]=madre.getGenotipo()[x];
            geno2[x]=padre.getGenotipo()[x];
        
        }else{
            geno1[x]=padre.getGenotipo()[x];
            geno2[x]=madre.getGenotipo()[x];
        }
    }
    hijo1 = new Individuo(geno1);
    hijo2 = new Individuo(geno2);
    
    if (hijo1.getFitness()>hijo2.getFitness()){
        return hijo1;}
    else{return hijo2;}
    
    }
    
}
