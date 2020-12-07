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
public class Rotation extends Effet {

    public Rotation(Bandeau monBandeau, int nbRep, String texte) {
        super(monBandeau, nbRep, texte);
    }
    
    
    @Override
    public void doEffect(){
        monBandeau.setMessage(texte);
        for (int n = 0; n< nbRep; n++){
        for (int i = 0; i <= 100; i++) {
		monBandeau.setRotation(2*Math.PI*i / 100);
		monBandeau.sleep(100);
        }
	}
    }
}
