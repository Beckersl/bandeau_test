/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author becke
 */
public abstract class Effet {
    protected Bandeau monBandeau;
    protected int nbRep;
    protected String texte;

    public Effet(Bandeau monBandeau, int nbRep, String texte) {
        this.monBandeau = monBandeau;
        this.nbRep = nbRep;
        this.texte = texte;
    }
    
    public void doEffect(){
        
    }

    @Override
    public String toString() {
        return "Effet{" + "nbRep=" + nbRep + ", texte=" + texte + '}';
    }
    
}
