/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

import joc.Human;

/**
 *
 * @author alumne
 */
public class Warrior extends Human {
    
    public Warrior(String name, int attackPoints, int defensePoints, int life){
        
        super(name, attackPoints, defensePoints, life);
        
        System.out.println("CONSTRUCTOR -> He creat un Warrior");
        
    }
    
}
