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
    String[][] matchs;
    String[][] classement;
    
    Ma_Fenetre(String[][] matchs,String[][] classement){
    this.matchs=matchs;
    this.classement=classement;
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
             this.setContentPane(new vue_res_ligue_des_champions(matchs,classement));
             this.setVisible(true);
        }
        if (e.getSource()==europa) {
             this.setContentPane(new vue_res_europa());
             this.setVisible(true);
        }
    }
}
