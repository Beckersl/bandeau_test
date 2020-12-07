/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemple;

import bandeau.Bandeau;
import java.awt.Font;

/**
 *
 * @author becke
 */
public class Zoom extends Effet {

    public Zoom(Bandeau monBandeau, int nbRep, String texte) {
        super(monBandeau, nbRep, texte);
    }
    
    @Override
    public void doEffect(){
        monBandeau.setMessage(texte);
        for (int n = 0; n< nbRep; n++){
        for (int i = 5; i < 60 ; i+=5) {
		monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
		monBandeau.sleep(100);
	}
        for (int i = 60; i > 5 ; i-=5) {
		monBandeau.setFont(new Font("Dialog", Font.BOLD, 5+i));
		monBandeau.sleep(100);
	}
        }
    }
}
