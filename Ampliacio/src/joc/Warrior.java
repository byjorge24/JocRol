/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import joc.Human;

import java.util.*;

/**
 * @version 1.1
 * @author alumne
 */
public class Warrior extends Human {
    
    /**
     * Constructor de Warrior que tenemos que pasarle los parametros necesarios
     * @param name
     * @param attackPoints
     * @param defensePoints
     * @param life
     * @param Equips 
     */
    public Warrior(String name, int attackPoints, int defensePoints, int life, ArrayList<Team> Equips){
        
        super(name, attackPoints, defensePoints, life, Equips);
        
        if (attackPoints < 5){
            
            this.setAttackPoints(0);
            
        }
        
        System.out.println("CONSTRUCTOR -> He creat un Warrior");
        
    }
    
    /**
     * Constructor de Warrior que tenemos que pasarle los parametros necesarios pero sin el arraylist de equipos
     * @param name
     * @param attackPoints
     * @param defensePoints
     * @param life 
     */
    public Warrior(String name, int attackPoints, int defensePoints, int life){
        
        super(name, attackPoints, defensePoints, life);
        
        if (attackPoints < 5){
            
            this.setAttackPoints(0);
            
        }
        
        System.out.println("CONSTRUCTOR -> He creat un Warrior");
        
    }
    
}
