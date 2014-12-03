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

    public int getDivision() {
        return division;
    }

    public void setDivision(int division) {
        this.division = division;
    }

    
    
    
    
    
}
