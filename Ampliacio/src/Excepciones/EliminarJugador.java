/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 * Excepcion para cuando eliminamos un jugador que no esta en el equipo
 * @author alumne
 */
public class EliminarJugador extends Exception {
    
    public EliminarJugador(String message){
        
        super(message);
        
    }
    
}
