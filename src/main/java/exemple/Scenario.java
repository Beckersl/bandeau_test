/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Color;
import java.awt.Font;
import java.util.ArrayList;

/**
 *
 * @author becke
 */
public class Scenario {
    
    
    private ArrayList<Effet> scenario = new ArrayList<>();
    public Bandeau monBandeau = new Bandeau();
    
    public Scenario(){
        
    }
        
        
        
    public void ajouteEffet(EffetEnum effet,int nbRep, String texte){
        if (effet == EffetEnum.Apparition){
            Apparition effect = new Apparition(monBandeau, nbRep, texte);
            scenario.add(effect);
        }
        else if (effet == EffetEnum.Zoom){
            Zoom effect = new Zoom(monBandeau, nbRep, texte);
            scenario.add(effect);
        }
        else if (effet == EffetEnum.Rotation){
            Rotation effect = new Rotation(monBandeau, nbRep, texte);
            scenario.add(effect);
        }
        
    }
    
    public void executeSenario(){
        
        Font font = monBandeau.getFont();
        Color back = monBandeau.getBackground();
        Color fore = monBandeau.getForeground();
        for (Effet n : scenario){
            n.doEffect();       
        }
        monBandeau.close();
    
    }

    @Override
    public String toString() {
        return "Scenario{" + "scenario=" + scenario + '}';
    }
}
