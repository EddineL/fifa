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
public class Club{
    String nom;
    String nation;
    int point;
    int division;

    public Club(String nom,String nation, int division) {
        this.nom=nom;
        this.nation = nation;
        this.point = 0;
        this.division = division;
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

    public Club(String nom, String division, String nationalite ) {
        
        this.division = division;
        this.nationalite = nationalite;
        this.nom = nom;
    }


    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    
    
    
}
