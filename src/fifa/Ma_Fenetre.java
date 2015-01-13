/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifa;

import javax.swing.JFrame;

/**
 *
 * @author Théophile
 */
public class Ma_Fenetre extends JFrame{
    
    Ma_Fenetre(String[][] matchs,String[][] classement){
    this.add(new vue_res_ligue_des_champions(matchs,classement));
    this.pack();
    this.setResizable(false);
    }
}
