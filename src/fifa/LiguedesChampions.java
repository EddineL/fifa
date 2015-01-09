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
    public LiguedesChampions(ArrayList<Pays> listpays, int nb){
        Pays LiguedesChamp=new Pays("LiguedesChamp",32);
        for(int i=0;i<listpays.size();i++){
            if("Espagne".equals(listpays.get(i).getNom())){
                for(int p=0;p<4;p++){
                    LiguedesChamp.addclub(listpays.get(i).getPd().getlistclub().get(p));
                }
            }else if("Barrage".equals(listpays.get(i).getNom())){
                for(int k=0;k<4;k++){
                    LiguedesChamp.addclub(listpays.get(i).getPd().getlistclub().get(k));
                }   
            }else{
                for(int j=0;j<nb;j++){
                    LiguedesChamp.addclub(listpays.get(i).getPd().getlistclub().get(j));
                }
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
        Pays PoolA=new Pays("POOL A",0);
        Pays PoolB=new Pays("POOL B",0);
        Pays PoolC=new Pays("POOL C",0);
        Pays PoolD=new Pays("POOL D",0);
        Pays PoolE=new Pays("POOL E",0);
        Pays PoolF=new Pays("POOL F",0);
        Pays PoolG=new Pays("POOL G",0);
        Pays PoolH=new Pays("POOL H",0);
        
        for(int i=0;i<32;i++){
            int compteur=0;
            while(compteur!=1){
                int x=(int)(Math.random()*8);
                if(x==0 && PoolA.getNbplaces()!=4){
                    PoolA.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolA.setNbplaces(PoolA.getNbplaces()+1);
                }else if(x==1 && PoolB.getNbplaces()!=4){
                    PoolB.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolB.setNbplaces(PoolB.getNbplaces()+1);
                }else if(x==2 && PoolC.getNbplaces()!=4){
                    PoolC.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolC.setNbplaces(PoolC.getNbplaces()+1);
                }else if(x==3 && PoolD.getNbplaces()!=4){
                    PoolD.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolD.setNbplaces(PoolD.getNbplaces()+1);
                }else if(x==4 && PoolE.getNbplaces()!=4){
                    PoolE.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolE.setNbplaces(PoolE.getNbplaces()+1);
                }else if(x==5 && PoolF.getNbplaces()!=4){
                    PoolF.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolF.setNbplaces(PoolF.getNbplaces()+1);
                }else if(x==6 && PoolG.getNbplaces()!=4){
                    PoolG.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolG.setNbplaces(PoolG.getNbplaces()+1);
                }else if(x==7 && PoolH.getNbplaces()!=4){
                    PoolH.addclub(LiguedesChamp.getPd().getlistclub().get(i));
                    compteur++;
                    PoolH.setNbplaces(PoolH.getNbplaces()+1);
                }
            }
        }
        
        System.out.println("******CONSTITUTION DES POOL******");
        
        for(int i=0;i<8;i++){
            if(i==0){
                System.out.println("** Pool A : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolA.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==1){
                System.out.println("** Pool B : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolB.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==2){
                System.out.println("** Pool C : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolC.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==3){
                System.out.println("** Pool D : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolD.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==4){
                System.out.println("** Pool E : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolE.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==5){
                System.out.println("** Pool F : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolF.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==6){
                System.out.println("** Pool G : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolG.getPd().getlistclub().get(j).getNom());
                }
            }else if(i==7){
                System.out.println("** Pool H : **");
                for(int j=0;j<4;j++){
                    System.out.println(PoolH.getPd().getlistclub().get(j).getNom());
                }
            }
        }
        
      // FIN CREATION DE POOL //
        
        //Match de pool//
        System.out.println("****** RESULTATS DE CHAQUE POOL ******");
        for(int i=0;i<8;i++){
            if(i==0){
                PoolA.getPd().saison();
                PoolA.getPd().classement();
            }else if(i==1){
                PoolB.getPd().saison();
                PoolB.getPd().classement();
            }else if(i==2){
                PoolC.getPd().saison();
                PoolC.getPd().classement();
            }else if(i==3){
                PoolD.getPd().saison();
                PoolD.getPd().classement();
            }else if(i==4){
                PoolE.getPd().saison();
                PoolE.getPd().classement();
            }else if(i==5){
                PoolF.getPd().saison();
                PoolF.getPd().classement();
            }else if(i==6){
                PoolG.getPd().saison();
                PoolG.getPd().classement();
            }else if(i==7){
                PoolH.getPd().saison();
                PoolH.getPd().classement();
            }
            
        }
        
        ArrayList<Pays> listPool=new ArrayList<Pays>();
        listPool.add(PoolA);
        listPool.add(PoolB);
        listPool.add(PoolC);
        listPool.add(PoolD);
        listPool.add(PoolE);
        listPool.add(PoolF);
        listPool.add(PoolG);
        listPool.add(PoolH);
        
        Pays etapefinal=new Pays("etapefinal",16);
        for(int i=0;i<listPool.size();i++){
            for(int j=0;j<2;j++){
                etapefinal.addclub(listPool.get(i).getPd().getlistclub().get(j));
            }
        }
        for(int i=0;i<etapefinal.getPd().getlistclub().size();i++){
            etapefinal.getPd().getlistclub().get(i).setPoint(0);
            etapefinal.getPd().getlistclub().get(i).setNbBut(0);
        }
        
        System.out.println("****** LES EQUIPE QUALIFIEES POUR LA PHASE FINAL : ******");
        for(int i=0;i<etapefinal.getPd().getlistclub().size();i++){
            System.out.println(etapefinal.getPd().getlistclub().get(i).getNom());
        }
        
        // 8eme de FINALE ---------------------//
        
        System.out.println("****** RESULTAT 8eme de FINALE ******");
        Pays quartdefinal=new Pays("quartdefinal",8);
        for(int i=0;i<etapefinal.getPd().getlistclub().size()-1;i=i+2){
            etapefinal.getPd().jouermatchAller(etapefinal.getPd().getlistclub().get(i), etapefinal.getPd().getlistclub().get(i+1));
            if(etapefinal.getPd().getlistclub().get(i).getPoint()>etapefinal.getPd().getlistclub().get(i+1).getPoint()){
                quartdefinal.addclub(etapefinal.getPd().getlistclub().get(i));
            }else if(etapefinal.getPd().getlistclub().get(i).getPoint()<etapefinal.getPd().getlistclub().get(i+1).getPoint()){
                quartdefinal.addclub(etapefinal.getPd().getlistclub().get(i+1));
            }
            else if(etapefinal.getPd().getlistclub().get(i).getPoint()==etapefinal.getPd().getlistclub().get(i+1).getPoint()){
                //TIR AU BUT
                int x=(int)(Math.random());
                if(x==1){
                    System.out.println(etapefinal.getPd().getlistclub().get(i).getNom()+" gagne au tir au but");
                    quartdefinal.addclub(etapefinal.getPd().getlistclub().get(i));
                }else{
                    System.out.println(etapefinal.getPd().getlistclub().get(i+1).getNom()+" gagne au tir au but");
                    quartdefinal.addclub(etapefinal.getPd().getlistclub().get(i+1));
                }
            }
        }
        
        for(int i=0;i<8;i++){
            quartdefinal.getPd().getlistclub().get(i).setPoint(0);
            quartdefinal.getPd().getlistclub().get(i).setNbBut(0);
        }
        
        //Quart de final -------------------------//
        System.out.println("******* EQUIPE EN QUART DE FINAL : ******");
        for(int i=0;i<quartdefinal.getPd().getlistclub().size();i++){
            System.out.println(quartdefinal.getPd().getlistclub().get(i).getNom());
        }
        
        System.out.println("****** RESULTAT QUART de FINALE ******");
        Pays demifinal=new Pays("demifinal",4);
        for(int i=0;i<(quartdefinal.getPd().getlistclub().size()-1);i=i+2){
            quartdefinal.getPd().jouermatchAller(quartdefinal.getPd().getlistclub().get(i), quartdefinal.getPd().getlistclub().get(i+1));
            if(quartdefinal.getPd().getlistclub().get(i).getPoint()>quartdefinal.getPd().getlistclub().get(i+1).getPoint()){
                demifinal.addclub(quartdefinal.getPd().getlistclub().get(i));
            }else if(quartdefinal.getPd().getlistclub().get(i).getPoint()<quartdefinal.getPd().getlistclub().get(i+1).getPoint()){
                demifinal.addclub(quartdefinal.getPd().getlistclub().get(i+1));
            }
            if(quartdefinal.getPd().getlistclub().get(i).getPoint()==quartdefinal.getPd().getlistclub().get(i+1).getPoint()){
                //TIR AU BUT
                int x=(int)(Math.random());
                if(x==1){
                    System.out.println(quartdefinal.getPd().getlistclub().get(i).getNom()+" gagne au tir au but");
                    demifinal.addclub(quartdefinal.getPd().getlistclub().get(i));
                }else{
                    System.out.println(quartdefinal.getPd().getlistclub().get(i+1).getNom()+" gagne au tir au but");
                    demifinal.addclub(quartdefinal.getPd().getlistclub().get(i+1));
                }
            }
        }
        
        for(int i=0;i<4;i++){
            demifinal.getPd().getlistclub().get(i).setPoint(0);
            demifinal.getPd().getlistclub().get(i).setNbBut(0);
        }
        
        //DEMI FINAL -----------------//
        System.out.println("****** EQUIPE EN DEMI FINAL *******");
        for(int i=0;i<demifinal.getPd().getlistclub().size();i++){
            System.out.println(demifinal.getPd().getlistclub().get(i).getNom());
        }
        System.out.println("****** RESULTAT DEMI FINALE ******");
        Pays finale=new Pays("finale",2);
        for(int i=0;i<(demifinal.getPd().getlistclub().size()-1);i=i+2){
            demifinal.getPd().jouermatchAller(demifinal.getPd().getlistclub().get(i), demifinal.getPd().getlistclub().get(i+1));
            if(demifinal.getPd().getlistclub().get(i).getPoint()>demifinal.getPd().getlistclub().get(i+1).getPoint()){
                finale.addclub(demifinal.getPd().getlistclub().get(i));
            }else if(demifinal.getPd().getlistclub().get(i).getPoint()<demifinal.getPd().getlistclub().get(i+1).getPoint()){
                finale.addclub(demifinal.getPd().getlistclub().get(i+1));
            }
            if(demifinal.getPd().getlistclub().get(i).getPoint()==demifinal.getPd().getlistclub().get(i+1).getPoint()){
                //TIR AU BUT
                int x=(int)(Math.random());
                if(x==1){
                    System.out.println(demifinal.getPd().getlistclub().get(i).getNom()+" gagne au tir au but");
                    finale.addclub(demifinal.getPd().getlistclub().get(i));
                }else{
                    System.out.println(demifinal.getPd().getlistclub().get(i+1).getNom()+" gagne au tir au but");
                    finale.addclub(demifinal.getPd().getlistclub().get(i+1));
                }
            }
        }
        
        for(int i=0;i<2;i++){
            finale.getPd().getlistclub().get(i).setPoint(0);
            finale.getPd().getlistclub().get(i).setNbBut(0);
        }
        
        //******FINALE******//
        System.out.println("****** EQUIPE EN FINAL *******");
        for(int i=0;i<finale.getPd().getlistclub().size();i++){
            System.out.println(finale.getPd().getlistclub().get(i).getNom());
        }
        System.out.println("****** RESULTAT FINALE ******");
        Pays Vainqueur=new Pays("Vainqueur",1);
        finale.getPd().jouermatchAller(finale.getPd().getlistclub().get(0), finale.getPd().getlistclub().get(1));
        if(finale.getPd().getlistclub().get(0).getPoint()>finale.getPd().getlistclub().get(1).getPoint()){
            Vainqueur.addclub(finale.getPd().getlistclub().get(0));
        }else if(finale.getPd().getlistclub().get(0).getPoint()<finale.getPd().getlistclub().get(1).getPoint()){
            Vainqueur.addclub(finale.getPd().getlistclub().get(1));
        }
        if(finale.getPd().getlistclub().get(0).getPoint()==finale.getPd().getlistclub().get(1).getPoint()){
            //TIR AU BUT
            int x=(int)(Math.random());
            if(x==1){
                System.out.println(finale.getPd().getlistclub().get(0).getNom()+" gagne au tir au but");
                Vainqueur.addclub(finale.getPd().getlistclub().get(0));
            }else{
                System.out.println(finale.getPd().getlistclub().get(1).getNom()+" gagne au tir au but");
                Vainqueur.addclub(finale.getPd().getlistclub().get(1));               
            }
        }
        System.out.println("***********************************************");    
        System.out.println("LE VAINQUEUR EST "+Vainqueur.getPd().getlistclub().get(0).getNom()); 
    }
}
