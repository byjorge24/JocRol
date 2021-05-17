/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 *
 * @author alumne
 */
public class Human extends Player {
    
    public Human(String name, int attackPoints, int defensePoints, int life){
        
        super(name, attackPoints, defensePoints, life);
        
        if (life > 100){
            
            this.setLife(100);
            
        }
        
        System.out.println("CONSTRUCTOR -> He creat un Huma");
        
    }
    
}
