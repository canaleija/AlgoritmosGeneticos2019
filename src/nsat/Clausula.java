/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nsat;

import java.util.ArrayList;

/**
 *
 * @author Roberto Cruz Leija
 */
public class Clausula {
    
    public static ArrayList<Clausula> clausulas;
    
    private int a;
    private int b;
    private int c;

    public Clausula(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * @return the a
     */
    public int getA() {
        return a;
    }

    /**
     * @return the b
     */
    public int getB() {
        return b;
    }

    /**
     * @return the c
     */
    public int getC() {
        return c;
    }
    
}
