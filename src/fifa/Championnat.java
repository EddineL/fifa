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
public abstract class Championnat {
    
    protected ArrayList<Club> club = new ArrayList<>();
    
    public Championnat() {
        
    }
    
    public void jouermatchAller(Club a, Club b){
        if(a.getDivision()==b.getDivision()){
            System.out.println("Match aller ");
        double as=0.0, bs=0.0;
        as = Math.random()*5;
        bs = Math.random()*5;
        System.out.println("Score:"+a.nom+" "+(int)as+"-"+(int)bs+" "+b.nom);
        if(as>bs){
            a.setPoint(a.getPoint()+3);
            System.out.println(a.nom+" gagne");
            System.out.println(a.nom+" possede "+a.getPoint());
        }else if(as<bs){
            b.setPoint(b.getPoint()+3);
            System.out.println(b.nom+" gagne");
            System.out.println(b.nom+" possede "+b.getPoint());
        }else if(as==bs){
            a.setPoint(a.getPoint()+1);
            b.setPoint(b.getPoint()+1);
            System.out.println("match nul");
            System.out.println(a.nom+" possede"+a.getPoint());
            System.out.println(b.nom+" possede"+b.getPoint());
        }
        System.out.println("Le match est fini!");
        }else{
            System.out.println("Le match est impossible, pas même division");
        }
    }
    public void jouermatchRetour(Club a, Club b){
        if(a.getDivision()==b.getDivision()){
            System.out.println("Match retour ");
        double as=0.0, bs=0.0;
        as = Math.random()*5;
        bs = Math.random()*5;
        System.out.println("Score:"+a.nom+" "+(int)as+"-"+(int)bs+" "+b.nom);
        if(as>bs){
            a.setPoint(a.getPoint()+3);
            System.out.println(a.nom+" gagne");
            System.out.println(a.nom+" possede "+a.getPoint());
        }else if(as<bs){
            b.setPoint(b.getPoint()+3);
            System.out.println(b.nom+" gagne");
            System.out.println(b.nom+" possede "+b.getPoint());
        }else{
            a.setPoint(a.getPoint()+1);
            b.setPoint(b.getPoint()+1);
            System.out.println("match nul");
            System.out.println(a.nom+" possede"+a.getPoint());
            System.out.println(b.nom+" possede"+b.getPoint());
        }
        System.out.println("Le match est fini!");
        }else{
            System.out.println("Le match est impossible, pas même division");
        }
    }
    public void classement(){
            
            }

    public void saison(){
        for(int i=0;i<club.size();i++){
            for(int j=i;j<club.size();j++){
                if(i!=j){
                    this.jouermatchAller(club.get(i), club.get(j)); 
                    this.jouermatchRetour(club.get(i), club.get(j));
                }
        }
    }
    
    public void ajouter2(Club c){
        if(c.getDivision()=="2"){
            this.club.add(c);
        }else{
            System.out.println("Ce club ne peut pas être ajouté");
        }
    }
    
    
    
}
//
