/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.doranco.week11tpcomposite;

/**
 *
 * @author JiJi
 */
public class Week11TpComposite {

    public static void main(String[] args) {
        
        Forme tri = new Triangle();
        Forme tri1 = new Triangle();
        
        Forme cer = new Cercle();
        Forme cer1 = new Cercle();
        
        Forme car = new Carre();
        Forme car1 = new Carre();
        
        Dessiner dessiner = new Dessiner();
        dessiner.add(cer);
        dessiner.add(tri);
        dessiner.add(tri1);
        
        dessiner.dessiner("rouge");
        
        dessiner.clear();
        
        
        dessiner.add(car);
        dessiner.add(car1);
        
        dessiner.dessiner("vert");
        
        
        
    }
}
