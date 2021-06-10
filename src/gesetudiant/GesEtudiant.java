/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gesetudiant;

import gesetudiant.graphique.Accueil;
import gesetudiant.graphique.Authentification;

/**
 *
 * @author hppp
 */
public class GesEtudiant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //AccessDB.obtenirConnection();
        new Authentification().setVisible(true);
    
   }
    
}
