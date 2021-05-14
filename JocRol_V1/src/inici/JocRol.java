/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import joc.*;

/**
 *
 * @author alumne
 */
public class JocRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        provaFase();
        
    }
    
    public static void provaFase() {
        
        System.out.println("CREEM UN HUMA");
        
        Human human1 = new Human();
        
        System.out.println("CREEM UN WARRIOR");
        
        Warrior warrior1 = new Warrior();
        
        System.out.println("CREEM UN ALIEN");
        
        Alien alien1 = new Alien();
        
    }
    
}
