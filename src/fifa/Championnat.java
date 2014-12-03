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
    
    public void jouermatch(Club a, Club b){
        if(a.getDivision()==b.getDivision()){
            System.out.println("Meme division");
        double as=0.0, bs=0.0;
        as = Math.random()*5;
        bs = Math.random()*5;
        System.out.println("Il y a :"+(int)as+"-"+(int)bs);
        if(as>bs){
            a.setPoint(a.getPoint()+3);
            System.out.println("a gagne");
            System.out.println("a possede "+a.getPoint());
        }else if(as<bs){
            b.setPoint(b.getPoint()+3);
            System.out.println("b gagne");
            System.out.println("b possede "+b.getPoint());
        }else{
            a.setPoint(a.getPoint()+1);
            b.setPoint(b.getPoint()+1);
            System.out.println("match nul");
            System.out.println("a possede"+a.getPoint());
            System.out.println("b possede"+b.getPoint());
        }
        System.out.println("Le match est fini!");
        }else{
            System.out.println("Le match est impossible, pas même division");
        }
    }
    
    public void classement(){
        for(int i=0;i<club.size();i++){
            
        }
        
    
    }
    public void ajouter1(Club c){
        
        if(c.getDivision()=="un"){
            this.club.add(c);
        }else{
            System.out.println("Ce club ne peut pas être ajouté");
        }
    }
    
    public void ajouter2(Club c){
        if(c.getDivision()=="deux"){
            this.club.add(c);
        }else{
            System.out.println("Ce club ne peut pas être ajouté");
        }
    }
    
    
    
}
