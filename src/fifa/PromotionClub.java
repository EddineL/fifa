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
    private final ArrayList<Club> listClub;

    public PromotionClub(){
        listClub = new ArrayList<>();
    }
    
    public void addClub(Club c) {
        listClub.add(c);
        
    }

    public ArrayList<Club> getList() {
        return listClub;
    }
    
    public void clubparPays(ArrayList<Pays> pays){
        for (Club c : listClub) {
            switch (c.getNationalite()) {
                case "France":
                    pays.get(0).addclub(c);
                    break;
                case "Angleterre":
                    pays.get(1).addclub(c);
                    break;
                case "Espagne":
                    pays.get(2).addclub(c);
                    break;
                case "Italie":
                    pays.get(3).addclub(c);
                    break;
                case "Ecosse":
                    pays.get(4).addclub(c);
                    break;
                case "Pays-Bas":
                    pays.get(5).addclub(c);
                    break;
                case "Portugal":
                    pays.get(6).addclub(c);
                    break;
                case "Allemagne":
                    pays.get(7).addclub(c);
                    break;
            }
        }
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
