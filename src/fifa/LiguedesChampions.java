/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fifa;

import java.util.ArrayList;

/**
 *
 * @author Dante
 */
public class LiguedesChampions {
    public LiguedesChampions(ArrayList<Pays> listpays){
        Pays LiguedesChamp=new Pays("LiguedesChamp",32);
        for(int i=0;i<listpays.size();i++){
            for(int j=0;j<4;j++){
                LiguedesChamp.addclub(listpays.get(i).getPd().getlistclub().get(j));
            }
        }
        System.out.println("********LIGUE DES CHAMPIONS********");
        System.out.println("les equipes qualifiées : ");
        for(int i=0;i<LiguedesChamp.getPd().getlistclub().size();i++){
            LiguedesChamp.getPd().getlistclub().get(i).setPoint(0);
            LiguedesChamp.getPd().getlistclub().get(i).setNbBut(0);
            System.out.println(LiguedesChamp.getPd().getlistclub().get(i).getNom());
        }
        //CREATION DES POOLS//
        Pays PoolA=new Pays("POOL A",4);
        Pays PoolB=new Pays("POOL B",4);
        Pays PoolC=new Pays("POOL C",4);
        Pays PoolD=new Pays("POOL D",4);
        Pays PoolE=new Pays("POOL E",4);
        Pays PoolF=new Pays("POOL F",4);
        Pays PoolG=new Pays("POOL G",4);
        Pays PoolH=new Pays("POOL H",4);
        
        for(int i=0;i<LiguedesChamp.getPd().getlistclub().size();i++){
            int j=0;
            
        }
    }
}
