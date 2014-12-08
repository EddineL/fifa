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
        if(c.nationalite.equals(this.nom)){
            pd.club.add(c);
        }else{
            System.out.println(c.nom+" n'est pas un club du pays:"+this.nom);
        }
    }

    public premiereDivision getPd() {
        return pd;
    }
    
    
}
