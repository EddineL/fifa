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
public class Barrage {
    ArrayList<Pays> p3=new ArrayList();
    public Barrage(ArrayList<Pays> p, Pays p2){
        for(int i=0;i<p.size();i++){
            if(!"Espagne".equals(p.get(i).getNom())){
                p3.add(p.get(i));
            }
        }
        for(int i=0;i<p3.size()-1;i=i+2){
            p3.get(i).getPd().jouermatchAller(p3.get(i).getPd().getlistclub().get(4), p3.get(i+1).getPd().getlistclub().get(4));
            if(p3.get(i).getPd().getlistclub().get(4).getPoint()<p3.get(i+1).getPd().getlistclub().get(4).getPoint()){
                System.out.println(p3.get(i+1).getPd().getlistclub().get(4).getNom()+" remporte le match de barrage face a "+p3.get(i).getPd().getlistclub().get(4).getNom());
                p2.addclub(p3.get(i+1).getPd().getlistclub().get(4));
            }else if(p3.get(i).getPd().getlistclub().get(4).getPoint()>p3.get(i+1).getPd().getlistclub().get(4).getPoint()){
                System.out.println(p3.get(i).getPd().getlistclub().get(4).getNom()+" remporte le match de barrage face a "+p3.get(i+1).getPd().getlistclub().get(4).getNom());
                p2.addclub(p3.get(i).getPd().getlistclub().get(4));
            }else if(p3.get(i).getPd().getlistclub().get(4).getPoint()==p3.get(i+1).getPd().getlistclub().get(4).getPoint()){
                int x=(int)(Math.random());
                if(x==0){
                    System.out.println(p3.get(i).getPd().getlistclub().get(4).getNom()+" remplorte au tir au but");
                    p2.addclub(p3.get(i).getPd().getlistclub().get(4));
                }else if(x==1){
                    System.out.println(p3.get(i+1).getPd().getlistclub().get(4).getNom()+" remplorte au tir au but");
                    p2.addclub(p3.get(i+1).getPd().getlistclub().get(4));
                }
            }
        }
    }
}

