/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.reverseOrder;

/**
 *
 * @author Nacim
 */
public abstract class Championnat {

    protected ArrayList<Club> club = new ArrayList<>();
    protected ArrayList<String[]> m = new ArrayList<>();
    private String[][] matchs;
    private String[][] podium;

    public Championnat() {

    }

    public void jouermatchAller(Club a, Club b) {
        String[] aller=new String[6];
        if (a.getDivision().equals(b.getDivision())) {
            aller[0]="Aller";
            int as = 0, bs = 0;
            as = (int) (Math.random() * 5);
            bs = (int) (Math.random() * 5);
            a.setNbBut(a.getNbBut() + as);
            b.setNbBut(b.getNbBut() + bs);
            aller[1]=a.nom;
            aller[2]=""+(int)as;
            aller[3]=b.nom;
            aller[4]=""+(int)bs;
            
            if (as > bs) {
                a.setPoint(a.getPoint() + 3);
                aller[5]=a.nom;
            } else if (as < bs) {
                b.setPoint(b.getPoint() + 3);
                aller[5]=b.nom;
            } else if (as == bs) {
                a.setPoint(a.getPoint() + 1);
                b.setPoint(b.getPoint() + 1);
                aller[5]="Egalité";
            }
            m.add(aller);
        } 
    }

    public void jouermatchRetour(Club a, Club b) {
        String[] retour=new String[6];
        if (a.getDivision().equals(b.getDivision())) {
            retour[0]="Retour";
            int as = 0, bs = 0;
            as = (int) (Math.random() * 5);
            bs = (int) (Math.random() * 5);
            a.setNbBut(a.getNbBut() + as);
            b.setNbBut(b.getNbBut() + bs);
            retour[1]=a.nom;
            retour[2]=""+(int)as;
            retour[3]=b.nom;
            retour[4]=""+(int)bs;

            if (as > bs) {
                a.setPoint(a.getPoint() + 3);
                retour[5]=a.nom;
            } else if (as < bs) {
                b.setPoint(b.getPoint() + 3);
                retour[5]=b.nom;
            } else if (as == bs) {
                a.setPoint(a.getPoint() + 1);
                b.setPoint(b.getPoint() + 1);
                retour[5]="Egalité";
            }
            m.add(retour);
        }
    }
    
    //CLASSEMENT DE JEAN
  /* public void classement(){
        Collections.sort(this.club,reverseOrder());
        System.out.println("Classement");
        for(int i=0;i<club.size();i++){
        System.out.println(club.get(i).getNom()+" Pts: "+club.get(i).getPoint()+" Buts: "+club.get(i).getNbBut());}
        }
    */

    public void classement() {
        Collections.sort(this.club, reverseOrder());
        matchs = new String[m.size()][6];
        for (int i = 0; i < m.size(); i++) {
            matchs[i][0] = m.get(i)[0];
            matchs[i][1] = m.get(i)[1];
            matchs[i][2] = m.get(i)[2];
            matchs[i][3] = m.get(i)[3];
            matchs[i][4] = m.get(i)[4];
            matchs[i][5] = m.get(i)[5];
        }
        
        podium = new String[club.size()][4];
        for (int i = 0; i < club.size(); i++) {
            podium[i][0] = "" + (i + 1);
            podium[i][1] = club.get(i).getNom();
            podium[i][2] = "" + club.get(i).getPoint();
            podium[i][3] = "" + club.get(i).getNbBut();
        }
        Ma_Fenetre v=new Ma_Fenetre(matchs,podium);
        v.setVisible(true);
        
        
    }

    public ArrayList<Club> getlistclub(){
        return club;
    }
    public void saison() {
        for (int i = 0; i < club.size(); i++) {
            for (int j = i; j < club.size(); j++) {
                if (i != j) {
                    this.jouermatchAller(club.get(i), club.get(j));
                    this.jouermatchRetour(club.get(i), club.get(j));
                }
            }
        }
    }
}

    
    

    
  
    
    
    

//
