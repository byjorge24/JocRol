/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joc;


import java.util.*;
/**
 * @version 1.1
 * @author alumne
 */
public abstract class Player {
    
    private String name;
    private int attackPoints;
    private int defensePoints;
    private int life;
    private ArrayList<Team> equips = new ArrayList();
    private ArrayList<Item> Items = new ArrayList();
    
    /**
     * Constructor de Player al que tenemos que pasarle los parametros necesarios
     * @param name
     * @param attackPoints
     * @param defensePoints
     * @param life
     * @param Equips 
     */
    public Player(String name, int attackPoints, int defensePoints, int life, ArrayList<Team> Equips){
        
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        this.equips = Equips;
        
    }
    
    /**
     * Meotodo de Player pero si el arraylist de equipos
     * @param name
     * @param attackPoints
     * @param defensePoints
     * @param life 
     */
    public Player(String name, int attackPoints, int defensePoints, int life){
        
        this.name = name;
        this.attackPoints = attackPoints;
        this.defensePoints = defensePoints;
        this.life = life;
        
    }
    
    
    /**
     * Metodo attack que sirve para golpear a un jugador
     * @param jugador 
     */
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
    
    /**
     * Metodo hit que hace los calculos del ataque de un jugador, este metodo es llamado por el metodo attack para poder atacar a un jugador
     * @param attackPoints 
     */
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
    
    /**
     * Metodo para añadir un item a un jugador, que luego recalcula el ataque y la defensa del propio jugador.
     * @param item 
     */
    public void add(Item item){
        
        Items.add(item);
        
        this.setAttackPoints(attackPoints + Item.getAttackBonus());
        
        this.setDefensePoints(defensePoints + Item.getDefenseBonus());
        
    }
   
    /**
     * Metodo para eliminar un item a un jugadorm, que luego reacalcula el ataque y la defensa del propio jugador.
     * @param item 
     */
    public void remove(Item item){
        
        Items.remove(item);
        
        this.setAttackPoints(attackPoints - Item.getAttackBonus());
        
        this.setDefensePoints(defensePoints + Item.getDefenseBonus());
        
    }
    
    /**
     * Metodo toString para imprimir un jugador y que nos aparezca en pantalla toda la información
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
    
    /**
     * Metodo para ver los items de un jugador
     * @return Devuelve los items del jugador
     */
    public String verItems(){
        
        for (int x = 0; x < Items.size(); x++){
            
            System.out.println(this.Items.get(x));
            
        }
        return "";
    }
    
    /**
     * Metodo para coger el nombre del jugador
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Metodo para cambiar el nombre del jugador
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para coger el ataque de un jugador
     * @return the attackPoints
     */
    public int getAttackPoints() {
        return attackPoints;
    }

    /**
     * Metodo para cambiar el ataque de un jugador
     * @param attackPoints the attackPoints to set
     */
    public void setAttackPoints(int attackPoints) {
        this.attackPoints = attackPoints;
    }

    /**
     * Metodo para coger la defensa de un jugador
     * @return the defensePoints
     */
    public int getDefensePoints() {
        return defensePoints;
    }

    /**
     * Metodo para cambiar la defensa de un jugador
     * @param defensePoints the defensePoints to set
     */
    public void setDefensePoints(int defensePoints) {
        this.defensePoints = defensePoints;
    }

    /**
     * Metodo para coger la vida de un jugador
     * @return the life
     */
    public int getLife() {
        return life;
    }

    /**
     * Metodo para cambiar la vida de un jugador
     * @param life the life to set
     */
    public void setLife(int life) {
        this.life = life;
    }

    /**
     * Metodo para coger los equipos del arraylist equips
     * @return the equips
     */
    public ArrayList<Team> getEquips() {
        return equips;
    }

    /**
     * Metodo para cambiar los equipos del arraylist equips
     * @param equips the equips to set
     */
    public void setEquips(ArrayList<Team> equips) {
        this.equips = equips;
    }
    
    
    
}
