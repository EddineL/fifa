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
        PromotionClub p=new PromotionClub();
        p.loadFileCSV();
        Pays p1 = new Pays("France", 4);
        p1.addclub(new Club("OL", "France", "1"));
        p1.addclub(new Club("OM", "France", "1"));
        p1.addclub(new Club("PSG", "France", "1"));
        p1.addclub(new Club("Auxerre", "France", "1"));
        Pays p2 = new Pays("Angleterre", 4);
        p2.addclub(new Club("Chelsea", "Angleterre", "1"));
        p2.addclub(new Club("Arsenal", "Angleterre", "1"));
        p2.addclub(new Club("Manchester United", "Angleterre", "1"));
        p2.addclub(new Club("Manchester City", "Angleterre", "1"));
        Pays p3 = new Pays("Espagne", 4);
        p3.addclub(new Club("Real de Madrid", "Espagne", "1"));
        p3.addclub(new Club("FC Barça", "Espagne", "1"));
        p3.addclub(new Club("Athletico", "Espagne", "1"));
        p3.addclub(new Club("FC Valence", "Espagne", "1"));
        Pays p4 = new Pays("Italie", 4);
        p4.addclub(new Club("AC Milan", "Italie", "1"));
        p4.addclub(new Club("Inter Milan", "Italie", "1"));
        p4.addclub(new Club("Juventus Turin", "Italie", "1"));
        p4.addclub(new Club("Palerme", "Italie", "1"));
        Pays p5 = new Pays("Ecosse", 4);
        Pays p6 = new Pays("Pays-Bas", 4);
        Pays p7 = new Pays("Portugal", 4);
        Pays p8 = new Pays("Allemagne", 4);
        p8.addclub(new Club("Dortmund", "Allemagne", "1"));
        p8.addclub(new Club("Bayern Munich", "Allemagne", "1"));
        p8.addclub(new Club("Frankfurt", "Allemagne", "1"));
        p8.addclub(new Club("Cologne", "Allemagne", "1"));
        p4.pd.saison();

    }

}
