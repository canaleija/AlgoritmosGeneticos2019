/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nreinas;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Manager {
   private int numGeneraciones;
   private int tamPoblacion;
   private double probMuta;
   private double pMuestra;
   private int mask[];
   private Seleccion.TipoSeleccion tipoSeleccion[];
   private int tamGenotipo;
   
    public Manager(int numGeneraciones, int tamPoblacion, double probMuta, double pMuestra, Seleccion.TipoSeleccion[] tipoSeleccion, int tamGenotipo) {
        this.numGeneraciones = numGeneraciones;
        this.tamPoblacion = tamPoblacion;
        this.probMuta = probMuta;
        this.pMuestra = pMuestra;
        this.mask = Cruza.generarMascaraAleatoria(tamGenotipo);
        this.tipoSeleccion = tipoSeleccion;
        this.tamGenotipo = tamGenotipo;
    }

   
   
   public Individuo aplicarSeleccion(Poblacion pobActual, int i){
       Individuo aux = null; 
       // evaluar i
       switch(getTipoSeleccion()[i]){
           case RANDOM:{
             aux = Seleccion.seleccionAleatoria(pobActual);
           break;}
           case TORNEO:{
             aux = Seleccion.seleccionTorneo(pobActual);
           break;}   
           default: aux = null;
           
       }
   return aux;
   }

    /**
     * @return the numGeneraciones
     */
    public int getNumGeneraciones() {
        return numGeneraciones;
    }

    /**
     * @param numGeneraciones the numGeneraciones to set
     */
    public void setNumGeneraciones(int numGeneraciones) {
        this.numGeneraciones = numGeneraciones;
    }

    /**
     * @return the tamPoblacion
     */
    public int getTamPoblacion() {
        return tamPoblacion;
    }

    /**
     * @param tamPoblacion the tamPoblacion to set
     */
    public void setTamPoblacion(int tamPoblacion) {
        this.tamPoblacion = tamPoblacion;
    }

    /**
     * @return the probMuta
     */
    public double getProbMuta() {
        return probMuta;
    }

    /**
     * @param probMuta the probMuta to set
     */
    public void setProbMuta(double probMuta) {
        this.probMuta = probMuta;
    }

    /**
     * @return the pMuestra
     */
    public double getpMuestra() {
        return pMuestra;
    }

    /**
     * @param pMuestra the pMuestra to set
     */
    public void setpMuestra(double pMuestra) {
        this.pMuestra = pMuestra;
    }

    /**
     * @return the mask
     */
    public int[] getMask() {
        return mask;
    }

    /**
     * @param mask the mask to set
     */
    public void setMask(int[] mask) {
        this.mask = mask;
    }

    /**
     * @return the tipoSeleccion
     */
    public Seleccion.TipoSeleccion[] getTipoSeleccion() {
        return tipoSeleccion;
    }

    /**
     * @param tipoSeleccion the tipoSeleccion to set
     */
    public void setTipoSeleccion(Seleccion.TipoSeleccion[] tipoSeleccion) {
        this.tipoSeleccion = tipoSeleccion;
    }

    /**
     * @return the tamGenotipo
     */
    public int getTamGenotipo() {
        return tamGenotipo;
    }

    /**
     * @param tamGenotipo the tamGenotipo to set
     */
    public void setTamGenotipo(int tamGenotipo) {
        this.tamGenotipo = tamGenotipo;
    }
}
