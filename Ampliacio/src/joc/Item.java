/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;

/**
 * @version 1.1
 * @author alumne
 */
public class Item {
    
    private static String name;
    private static int attackBonus;
    private static int defenseBonus;
    
    /**
     * Constructor de item al que tenemos que pasarle los parametros necesarios
     * @param name
     * @param attackBonus
     * @param defenseBonus 
     */
    public Item(String name, int attackBonus, int defenseBonus){
        
        this.name = name;
        this.attackBonus = attackBonus;
        this.defenseBonus = defenseBonus;
        
    }

    /**
     * Metodo toString que imprime el item de un jugador
     * @return Devuelve el item de un jugador
     */
    public String toString(){
        
        return ("Item: " + this.name + " / " + this.attackBonus + " / " + this.defenseBonus);
        
    }
    
    /**
     * Metodo para coger el nombre de un jugador
     * @return the name
     */
    public static String getName() {
        return name;
    }

    /**
     * Metodo para cambiar el nombre de un jugador
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Meotodo para coger el ataque de un jugador
     * @return the attackBonus
     */
    public static int getAttackBonus() {
        return attackBonus;
    }

    /**
     * Metodo para cambiar el ataque de un jugador
     * @param attackBonus the attackBonus to set
     */
    public void setAttackBonus(int attackBonus) {
        this.attackBonus = attackBonus;
    }

    /**
     * Metodo para coger la defensa de un jugador
     * @return the defenseBonus
     */
    public static int getDefenseBonus() {
        return defenseBonus;
    }

    /**
     * Metodo para cambiar la defensa de un jugador
     * @param defenseBonus the defenseBonus to set
     */
    public void setDefenseBonus(int defenseBonus) {
        this.defenseBonus = defenseBonus;
    }
    
}
