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
public class Team {
    
    private String name;
    private ArrayList<Player> players = new ArrayList();
    private static int contador;
    
    /**
     * Constructor de equipo, que tenemos que pasarle el nombre del equipo
     * @param name 
     */
    public Team(String name){
        
        this.name = name;
        
    }
    
    /**
     * Metodo para añadir un jugador a un equipo
     * @param jugador 
     */
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
    
    /**
     * Metodo para eliminar un jugador de un equipo
     * @param jugador 
     */
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
    
    /**
     * Metodo para ver los miembros de un equipo.
     */
    public void getMembers(){
        
        for (int i = 0; i < getPlayers().size(); i++){
            
            System.out.println(getPlayers().get(i));
            
        }
        
    }
    
    /**
     * Metodo para saver si el nombre de un equipo es igual al que le pasamos
     * @param equip
     * @return Devuelve true o false
     */
    public boolean equals(Team equip){
        
        if (this.getName().equals(equip.getName())){
            
            return true;
            
        }
        else{
            
            return false;
            
        }
    }
    
    /**
     * Metodo toString para imprimir un equipo y sus integrantes
     * @return Devuelve un string donde tenemos toda la información dentro de ese string
     */
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
     * Metodo para coger el nombre del equipo
     * @return the name
     */
    public String getName() {
        return this.name;
    }

    /**
     * Metodo para cambiar el nombre de un equipo
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Metodo para coger jugadores del arraylist de jugadores
     * @return the players
     */
    public ArrayList getPlayers() {
        return this.players;
    }

    /**
     * Metodo para insertar jugadores en el arraylist de jugadores
     * @param players the players to set
     */
    public void setPlayers(ArrayList players) {
        this.players = players;
    }

    /**
     * Metodo para coger el contador, que contiene el numero de veces que pertenece un jugador a un equipo
     * @return the contador
     */
    public static int getContador() {
        return contador;
    }

    /**
     * Metodo para cambiar el contador, que contiene el numero de veces que pertenece un jugador a un equipo
     * @param contador the contador to set
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    
}
