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
public class Team {
    
    private String name;
    private ArrayList<Player> players = new ArrayList();
    private static int contador;
    
    public Team(String name){
        
        this.name = name;
        
    }
    
    public void add(Player jugador){
        
        this.setContador(0);
        
        for (int i = 0; i <= jugador.getEquips().size(); i++){
            
            this.setContador(this.getContador() + 1);
            
        }
        
            getPlayers().add(jugador);
            
            jugador.getEquips().add(this);
        
        for (int x = 0; x < jugador.getEquips().size(); x++){
            
            try {
            
                if (getPlayers().get(x).equals(jugador));
            
            }
            catch (Exception AñadirJugadorEquipo){
                
                System.out.println("No se puede añadir a un jugador que ya pertenece a un equipo!!!");
                
            }
            
        } 
        
    }
    
    public void remove(Player jugador){
        
        for (int i = 0; i < getPlayers().size(); i++){
            
            if (getPlayers().get(i).equals(jugador)){
                
                getPlayers().remove(jugador);
                
            }
            else {
                
              try {
                  
                  if (getPlayers().get(i) != jugador);
                  
              }
              catch (Exception EliminarJugador){
                  
                  System.out.println("No se puede eliminar a un jugador que no pertenece a este equipo!!!");
                  
              }
                
            }
            
        }
    }
    
    public void getMembers(){
        
        for (int i = 0; i < getPlayers().size(); i++){
            
            System.out.println(getPlayers().get(i));
            
        }
        
    }
    
    public boolean equals(Team equip){
        
        if (this.getName().equals(equip.getName())){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
    }
    
    public String toString(){
        
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("Equip " + this.getName() + ": \n");
        
        for (int i = 0; i < players.size(); i++){
            
            resultado.append("               " + players.get(i).getName() + " AP: " + players.get(i).getAttackPoints() + " /DP: " + players.get(i).getDefensePoints() + " /LP: " + players.get(i).getLife() + "(pertany a " + this.getContador() + " equips) " + "\n");
            
        }
        resultado.append("\n");
        return resultado.toString();
        
    }

    /**
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the players
     */
    public ArrayList getPlayers() {
        return this.players;
    }

    /**
     * @param players the players to set
     */
    public void setPlayers(ArrayList players) {
        this.players = players;
    }

    /**
     * @return the contador
     */
    public static int getContador() {
        return contador;
    }

    /**
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
