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
public class Fifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
      
        
        Pays p0=new Pays("France",4);
        p0.Ajoutclub(new Club("OL","France",1));
        p0.Ajoutclub(new Club("OM","France",1));
        p0.Ajoutclub(new Club("PSG","France",1));
        p0.Ajoutclub(new Club("Auxerre","France",1));
        Pays p1=new Pays("Espagne",4);
        p1.Ajoutclub(new Club("Real de Madrid","Espagne",1));
        p1.Ajoutclub(new Club("FC Barça","Espagne",1));
        p1.Ajoutclub(new Club("Athletico","Espagne",1));
        p1.Ajoutclub(new Club("FC Valence","Espagne",1));
        Pays p2=new Pays("Allemagne", 4);
        p2.Ajoutclub(new Club("Dortmund","Allemagne",1));
        p2.Ajoutclub(new Club("Bayern Munich","Allemagne",1));
        p2.Ajoutclub(new Club("Frankfurt","Allemagne",1));
        p2.Ajoutclub(new Club("Cologne","Allemagne",1));
        Pays p3=new Pays("Angleterre",4);
        p3.Ajoutclub(new Club("Chelsea","Angleterre",1));
        p3.Ajoutclub(new Club("Arsenal","Angleterre",1));
        p3.Ajoutclub(new Club("Manchester United","Angleterre",1));
        p3.Ajoutclub(new Club("Manchester City","Angleterre",1));
        Pays p4=new Pays("Italie",4);
        p4.Ajoutclub(new Club("AC Milan","Italie",1));
        p4.Ajoutclub(new Club("Inter Milan","Italie",1));
        p4.Ajoutclub(new Club("Juventus Turin","Italie",1));
        p4.Ajoutclub(new Club("Palerme","Italie",1));
       
        p4.pd.saison();
    }
    
   
}
