/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Excepcion cuando un jugador se ataca a si mismo
 * @author alumne
 */
public class JugadorAtaque extends Exception {
    
    public JugadorAtaque(String message){
        
        super(message);
        
    }
    
}
