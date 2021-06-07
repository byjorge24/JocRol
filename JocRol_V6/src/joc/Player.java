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
public abstract class Player {
    
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;
    private ArrayList<Team> equips = new ArrayList();
    private ArrayList<Item> Items = new ArrayList();
    
    public Player(String name, int attackPoints, int defensePoints, int life, ArrayList<Team> Equips){
        
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        this.equips = Equips;
        
    }
    
    public Player(String name, int attackPoints, int defensePoints, int life){
        
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        
    }
    
    
    
    public void attack(Player jugador){
        
        System.out.println("");
        
        /** ABANS DEL ATAC **/
        System.out.println("Attacker: " + this.getName() + " AP: " + this.getAttackPoints() + " /DP: " + this.getDefensePoints() + " /LP: " + this.getLife());
        System.out.println("Attacked: " + jugador.getName() + " AP: " + jugador.getAttackPoints() + " /DP: " + jugador.getDefensePoints() + " /LP: " + jugador.getLife());
        
        System.out.println("");
        
        /** ATAC **/
        if (jugador.getLife() > 0 && this.getLife() > 0){
            
            jugador.hit(getAttackPoints());
            
        }
        
        System.out.println("");
        
        if (jugador.getLife() > 0 && this.getLife() > 0){
            
            this.hit(getAttackPoints());
            
        }
        
        System.out.println("");
        
        /** DESPRES DEL ATAC **/
        System.out.println("Attacker: " + this.getName() + " AP: " + this.getAttackPoints() + " /DP: " + this.getDefensePoints() + " /LP: " + this.getLife());
        System.out.println("Attacked: " + jugador.getName() + " AP: " + jugador.getAttackPoints() + " /DP: " + jugador.getDefensePoints() + " /LP: " + jugador.getLife());
        
        System.out.println("");
        
    }
    
    protected void hit(int attackPoints){
        
        int resultado1;
        resultado1 = attackPoints - this.getDefensePoints();
        
        if (resultado1 <= -1){
            
            resultado1 = 0;
            
        }
        
        int resultado2;
        
        resultado2 = this.getLife() - resultado1;
        
        System.out.println(this.getName() + " is hit with " + attackPoints + " points and defends himself with " + this.getDefensePoints() + " . Lifes: " + this.getLife() + " - " + resultado1 + " = " + resultado2);
        
        
        this.setLife(resultado2);
        
    }
    
    public void add(Item item){
        
        Items.add(item);
        
        this.setAttackPoints(attackPoints + Item.getAttackBonus());
        
        this.setDefensePoints(defensePoints + Item.getDefenseBonus());
        
    }
    
    public void remove(Item item){
        
        Items.remove(item);
        
        this.setAttackPoints(attackPoints - Item.getAttackBonus());
        
        this.setDefensePoints(defensePoints + Item.getDefenseBonus());
        
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        
        int nveces = 0;
        
        for (int i = 0; i < equips.size(); i++){
            
            if (this.equips.get(i).equals(equips.get(i))){
                
                nveces = nveces + 1;
                
            }
            
        }
        
        return (this.getName() + " PA: " + this.getAttackPoints() + " / " + " PD: " + this.getDefensePoints() + " / " + " PV: " + this.getLife() + " (pertany a " + nveces + " equips) " + " \n "  +  this.verItems());
        
    }
    
    public String verItems(){
        
        for (int x = 0; x < Items.size(); x++){
            
            System.out.println(this.Items.get(x));
            
        }
        return "";
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the attackPoints
     */
    public int getAttackPoints() {
        return attackPoints;
    }

    /**
     * @param attackPoints the attackPoints to set
     */
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * @return the defensePoints
     */
    public int getDefensePoints() {
        return defensePoints;
    }

    /**
     * @param defensePoints the defensePoints to set
     */
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    /**
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * @return the equips
     */
    public ArrayList<Team> getEquips() {
        return equips;
    }

    /**
     * @param equips the equips to set
     */
    public void setEquips(ArrayList<Team> equips) {
        this.equips = equips;
    }
    
    
    
}
