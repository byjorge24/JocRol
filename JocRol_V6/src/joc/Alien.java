/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import java.util.*;

/**
 *
 * @author alumne
 */
public class Alien extends Player {
    
    public Alien (String name, int attackPoints, int defensePoints, int life, ArrayList<Team> Equips){
        
        super(name, attackPoints, defensePoints, life, Equips);
        
        if (life > 20){
            
            int resultado;
            resultado = attackPoints + 3;
            
            this.setAttackPoints(resultado);
            
            int resultado2;
            resultado2 = defensePoints - 3;
            
            this.setDefensePoints(resultado2);
            
        }
        
        System.out.println("CONSTRUCTOR -> He creat un Alien");
        
    }
    public Alien (String name, int attackPoints, int defensePoints, int life){
        
        super(name, attackPoints, defensePoints, life);
        
        if (life > 20){
            
            int resultado;
            resultado = attackPoints + 3;
            
            this.setAttackPoints(resultado);
            
            int resultado2;
            resultado2 = defensePoints - 3;
            
            this.setDefensePoints(resultado2);
            
        }
        
        System.out.println("CONSTRUCTOR -> He creat un Alien");
        
    }
    
}
