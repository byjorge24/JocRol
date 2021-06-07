/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Excepcion cuando un jugador muere no puede atacar
 * @author alumne
 */
public class JugadorMort extends Exception {
    
    public JugadorMort(String message){
        
        super(message);
        
    }
    
    public JugadorMort(){
        
        super("");
        
    }
    
}
