/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Excepcion para cuando añadimos un jugador a un equipo
 * @author alumne
 */
public class AñadirJugadorEquipo extends Exception {
    
    public AñadirJugadorEquipo(String message){
        
        super(message);
        
    }
    
}
