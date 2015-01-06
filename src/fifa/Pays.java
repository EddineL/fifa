/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

/**
 *
 * @author Nacim
 */
public class Pays {
    
    String nom;
    int nbplaces;
    premiereDivision pd=new premiereDivision();
    
    public Pays(String nom, int nbplaces) {
        this.nom = nom;
        this.nbplaces = nbplaces;
    }
    
    public void addclub(Club c){
        
            pd.club.add(c);
        
    }

    public premiereDivision getPd() {
        return pd;
    }

    public int getNbplaces() {
        return nbplaces;
    }

    public void setNbplaces(int nbplaces) {
        this.nbplaces = nbplaces;
    }
    
    
}
