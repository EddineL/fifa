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
        Pays p1 = new Pays("France", 4);
        Pays p2 = new Pays("Angleterre", 4);
        Pays p3 = new Pays("Espagne", 4);
        Pays p4 = new Pays("Italie", 4);
        Pays p5 = new Pays("Ecosse", 4);
        Pays p6 = new Pays("Pays-Bas", 4);
        Pays p7 = new Pays("Portugal", 4);
        Pays p8 = new Pays("Allemagne", 4);
        pays.add(p1);
        pays.add(p2);
        pays.add(p3);
        pays.add(p4);
        pays.add(p5);
        pays.add(p6);
        pays.add(p7);
        pays.add(p8);
        p.clubparPays(pays);
        p1.getPd().saison();

    }

}
