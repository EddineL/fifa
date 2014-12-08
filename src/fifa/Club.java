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
public class Club implements Comparable{
    String nom;
    String nationalite;
    int point;
    String division;
    int nbBut;
    
    public Club(String nom, String division, String nation) {
        this.nom=nom;
        this.nationalite= nation;
        this.point = 0;
        this.division = division;
        this.nbBut=0;
    }

    public void setNbBut(int nbBut) {
        this.nbBut = nbBut;
    }

    public int getNbBut() {
        return nbBut;
    }
    
    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public void setNationalite(String nationalite) {
        this.nationalite = nationalite;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNationalite() {
        return nationalite;
    }

    public String getNom() {
        return nom;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    @Override
    public int compareTo(Object t) {
        
      int nombre1 = ((Club) t).getPoint(); 
      int nombre2 = this.getPoint(); 
      if (nombre1 > nombre2){  
          return -1;
      }
      else if(nombre1 == nombre2){
          int n1=((Club)t).getNbBut();
          int n2=this.getNbBut();
          if(n1>n2){
              return -1;
          }
          else if(n1<n2){
              return 1;
          }
      }
      return 0;  }
      
   

    
    
    
}
