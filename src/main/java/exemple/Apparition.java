/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;

/**
 *
 * @author becke
 */
public class Apparition extends Effet{

    public Apparition(Bandeau monBandeau, int nbRep, String texte) {
        super(monBandeau, nbRep, texte);
    }
    
    

    @Override
    public void doEffect(){
        monBandeau.setMessage(texte);
        for (int n = 0; n< nbRep; n++){
        String texteAffiche = "";
        for (int i = 0; i < texte.length(); i++) {
            
            texteAffiche = texteAffiche + texte.charAt(i);
		monBandeau.setMessage(texteAffiche);
                monBandeau.sleep(400);
        }
        }
        monBandeau.sleep(100);
    }
}
