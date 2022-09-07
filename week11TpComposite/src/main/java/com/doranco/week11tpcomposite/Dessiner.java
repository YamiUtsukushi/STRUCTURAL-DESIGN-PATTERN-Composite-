/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.doranco.week11tpcomposite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JiJi
 */
public class Dessiner implements Forme{
    
    private List<Forme> formes = new ArrayList<>();
    
    @Override
    public void dessiner(String couleurDessin) {
       
        for(Forme forme : formes){
        
            forme.dessiner(couleurDessin);
        }
    }
    
    public void add(Forme f){
    
        this.formes.add(f);
    }
    
    public void clear(){
    
        System.out.println("Suppresion de toutes les formes dessinées");
        this.formes.clear();
       
    }
}
