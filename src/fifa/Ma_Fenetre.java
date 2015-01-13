/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package fifa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author Théophile
 */
public class Ma_Fenetre extends JFrame implements ActionListener{
    JMenuBar barre = new JMenuBar();
    JMenuItem ldc = new JMenuItem("Ligue des Champions");
    JMenuItem europa = new JMenuItem("EuropaLeague");
    String[][] matchs_league;
    String[][] classement_league;
    String[][] matchs_europa;
    String[][] classement_europa;
    
    Ma_Fenetre(String[][] matchs,String[][] classement,String[][] matchs_europa,String[][] classement_europa){
    this.matchs_europa=matchs;
    this.classement_europa=classement;
    this.matchs_league=matchs;
    this.classement_league=classement;
    barre.add(ldc);
    barre.add(europa);
    this.setJMenuBar(barre);
    this.add(new vue_res_ligue_des_champions(matchs,classement));
    this.pack();
    this.setResizable(false);
    ldc.addActionListener(this);
    europa.addActionListener(this);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setVisible(true);
    
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==ldc) {
             this.setContentPane(new vue_res_ligue_des_champions(matchs_league,classement_league));
             this.setVisible(true);
        }
        if (e.getSource()==europa) {
             this.setContentPane(new vue_res_europa(matchs_europa,classement_europa));
             this.setVisible(true);
        }
    }
}
