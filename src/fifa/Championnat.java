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

    public Championnat() {

    }

    public void jouermatchAller(Club a, Club b) {
        if (a.getDivision().equals(b.getDivision())) {
            System.out.println("Match aller ");
            int as = 0, bs = 0;
            as =(int) (Math.random() * 5);
            bs =(int) (Math.random() * 5);
            a.setNbBut(a.getNbBut()+as);
            b.setNbBut(b.getNbBut()+bs);
            System.out.println("Score:" + a.nom + " " + (int) as + "-" + (int) bs + " " + b.nom);
            if (as > bs) {
                a.setPoint(a.getPoint() + 3);
                System.out.println(a.nom + " gagne");
                System.out.println(a.nom + " possede " + a.getPoint());
            } else if (as < bs) {
                b.setPoint(b.getPoint() + 3);
                System.out.println(b.nom + " gagne");
                System.out.println(b.nom + " possede " + b.getPoint());
            } else if (as == bs) {
                a.setPoint(a.getPoint() + 1);
                b.setPoint(b.getPoint() + 1);
                System.out.println("match nul");
                System.out.println(a.nom + " possede " + a.getPoint());
                System.out.println(b.nom + " possede " + b.getPoint());
            }
            System.out.println("Le match est fini!");
        } else {
            System.out.println("Le match est impossible, pas même division");
        }
    }

    public void jouermatchRetour(Club a, Club b) {
        if (a.getDivision().equals(b.getDivision())) {
            System.out.println("Match retour ");
            int as = 0, bs = 0;
            as =(int)(Math.random() * 5);
            bs =(int)(Math.random() * 5);
             a.setNbBut(a.getNbBut()+as);
            b.setNbBut(b.getNbBut()+bs);
            System.out.println("Score:" + a.nom + " " + (int) as + "-" + (int) bs + " " + b.nom);
            
            if (as > bs) {
                a.setPoint(a.getPoint() + 3);
                System.out.println(a.nom + " gagne");
                System.out.println(a.nom + " possede " + a.getPoint());
            } else if (as < bs) {
                b.setPoint(b.getPoint() + 3);
                System.out.println(b.nom + " gagne");
                System.out.println(b.nom + " possede " + b.getPoint());
            } else if (as==bs){
                a.setPoint(a.getPoint() + 1);
                b.setPoint(b.getPoint() + 1);
                System.out.println("match nul");
                System.out.println(a.nom + " possede " + a.getPoint());
                System.out.println(b.nom + " possede " + b.getPoint());
            }
            System.out.println("Le match est fini!");
        } else {
            System.out.println("Le match est impossible, pas même division");
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
     

      public void classement(){
        Collections.sort(this.club,reverseOrder());
        System.out.println("Classement");
        for(int i=0;i<club.size();i++){
        System.out.println(club.get(i).getNom()+" Pts: "+club.get(i).getPoint()+" Buts: "+club.get(i).getNbBut());}
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
        for(int a=0;a<club.size();a++){
         System.out.println(club.get(a).getNom()+" possède "+club.get(a).getPoint()+" points " + "et "+club.get(a).getNbBut()+" buts");
        }
    }
}

    
    

    
  
    
    
    

//
