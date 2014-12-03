/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import javax.swing.JFileChooser;

/**
 *
 * @author Dante
 */
public class PromotionClub {
    private ArrayList<Club> list=new ArrayList<Club>();

    public PromotionClub(){
        
    }
    
    public void addClub(Club c) {
        list.add(c);
        
    }
    
    public void loadFileCSV() {
        
        String ligne,nom,div,nation;
        
        
        try {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File("."));
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            int result = fileChooser.showOpenDialog(null);
            if (result == JFileChooser.APPROVE_OPTION) {
                FileInputStream fichier_int = new FileInputStream(fileChooser.getSelectedFile());
                 InputStreamReader inputs = new InputStreamReader(fichier_int,"Latin1");
                BufferedReader input=new BufferedReader(inputs);
                 while ((ligne=input.readLine())!=null) {
                     String[] fields = ligne.split(";");
                     addClub(new Club(fields[0],fields[1],fields[2]));
                 }
                 System.out.println("Liste chargée");
                input.close();
            }
        } catch (Exception exception) {
            System.out.println("Probleme import csv");
        }
    }
    
}
