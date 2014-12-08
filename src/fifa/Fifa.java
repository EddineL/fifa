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

    }

}
