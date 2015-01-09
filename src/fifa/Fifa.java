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
public class Fifa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PromotionClub p = new PromotionClub();
        p.loadFileCSV();
        ArrayList<Pays> pays = new ArrayList<>();
        Pays France = new Pays("France", 4);
        Pays Angleterre = new Pays("Angleterre", 4);
        Pays Espagne = new Pays("Espagne", 4);
        Pays Italie = new Pays("Italie", 4);
        Pays Ecosse = new Pays("Ecosse", 4);
        Pays PaysBas = new Pays("Pays-Bas", 4);
        Pays Portugal = new Pays("Portugal", 4);
        Pays Allemagne = new Pays("Allemagne", 4);
        pays.add(France);
        pays.add(Angleterre);
        pays.add(Espagne);
        pays.add(Italie);
        pays.add(Ecosse);
        pays.add(PaysBas);
        pays.add(Portugal);
        pays.add(Allemagne);
        p.clubparPays(pays);
        France.getPd().saison();
     
        France.getPd().classement();

    }

}
//----------------------PARTIE JEAN ---------------------//
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package fifa;

//import java.util.ArrayList;

/**
 *
 * @author Dante
 */
//public class fifa {

    /**
     * @param args the command line arguments
     */
    /*public static void main(String[] args) {
        PromotionClub p = new PromotionClub();
        p.loadFileCSV();
        ArrayList<Pays> pays = new ArrayList<>();
        Pays France = new Pays("France", 4);
        Pays Angleterre = new Pays("Angleterre", 4);
        Pays Espagne = new Pays("Espagne", 4);
        Pays Italie = new Pays("Italie", 4);
        Pays Ecosse = new Pays("Ecosse", 4);
        Pays PaysBas = new Pays("Pays-Bas", 4);
        Pays Portugal = new Pays("Portugal", 4);
        Pays Allemagne = new Pays("Allemagne", 4);
        Pays Autriche = new Pays("Autriche",4);
        pays.add(France);
        pays.add(Angleterre);
        pays.add(Espagne);
        pays.add(Italie);
        pays.add(Ecosse);
        pays.add(PaysBas);
        pays.add(Portugal);
        pays.add(Allemagne);
        pays.add(Autriche);
        p.clubparPays(pays);
        
        // ********SAISON********//*
        for(int i=0;i<pays.size();i++){
            System.out.println("SAISON DE : "+pays.get(i).getNom());
            pays.get(i).getPd().saison();
            pays.get(i).getPd().classement();
            System.out.println("-----------");
        }
        for(int i=0;i<pays.size();i++){
            for(int j=0;j<5;j++){
                pays.get(i).getPd().getlistclub().get(j).setPoint(0);
                pays.get(i).getPd().getlistclub().get(j).setNbBut(0);
            }
        }
        
        //********FIN SAISON********//*
        
        //********MATCH DE BARRAGE********//*
        Pays Barrage = new Pays("Barrage",4);
        Barrage Bar = new Barrage(pays,Barrage);
        System.out.println("**EQUIPE QUALIFIE APRES LES BARRAGES**");
        for(int i=0;i<Barrage.getPd().getlistclub().size();i++){
            System.out.println(Barrage.getPd().getlistclub().get(i).getNom());
        }
        pays.add(Barrage);
        //********FIN BARRAGE******//*
        
        //******** LIGUE DES CHAMPIONS********/
 /*       LiguedesChampions L=new LiguedesChampions(pays,3);
        
        
    }

}*/
