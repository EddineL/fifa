/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.util.ArrayList;

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
    public void Ajoutclub(Club c){
        if(c.nation.equals(this.nom)){
    pd.club.add(c);
    }
        else{
               System.out.println(c.nom+" n'est pas un club du pays:"+this.nom);
        }
    }
}
