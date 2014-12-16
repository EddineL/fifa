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
    /*
     public ArrayList<Club> classement(){
     int premier=0;
     int deuxieme=0;
     int troisieme=0;
     int quatrieme=0;
     int cinquieme=0;
     int sixieme=0;
     ArrayList<Club> newlistclub = new ArrayList<>();
        
     for(int i=0;i<club.size();i++){
     for(int j=0;j<club.size();j++){
     if(j!=i){
     if(club.get(i).getPoint()>club.get(j).getPoint()){
     if(i==0){premier++;}
     if(i==1){deuxieme++;}
     if(i==2){troisieme++;}
     if(i==3){quatrieme++;}
     if(i==4){cinquieme++;}
     if(i==5){sixieme++;}
     }
     }
     }
     }
     int[] tab=new int[6];
     tab[0] = premier;
     tab[1] = deuxieme;
     tab[2] = troisieme;
     tab[3] = quatrieme;
     tab[4] = cinquieme;
     tab[5] = sixieme;
        
        
     for(int comp=0;comp<6;comp++){
     for(int p=0;p<5;p++){
     if(tab[p]<tab[p+1]){
     int c=tab[p+1];
     tab[p+1]=tab[p];
     tab[p]=c;
     }
     }
     }
     for(int m=0;m<6;m++){
     if(tab[m]==premier){newlistclub.add(club.get(0));}
     if(tab[m]==deuxieme){newlistclub.add(club.get(1));}
     if(tab[m]==troisieme){newlistclub.add(club.get(2));}
     if(tab[m]==quatrieme){newlistclub.add(club.get(3));}
     if(tab[m]==cinquieme){newlistclub.add(club.get(4));}
     if(tab[m]==sixieme){newlistclub.add(club.get(5));}
     }
        
        
     return newlistclub;
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
        vue_résultat v=new vue_résultat(matchs,podium);
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
