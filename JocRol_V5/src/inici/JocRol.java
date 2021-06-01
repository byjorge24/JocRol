/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import joc.*;

import java.util.*;

import io.*;

/**
 *
 * @author alumne
 */
public class JocRol {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        provaFase();
        
    }
    
    public static void provaFase() {
        
        String blue="\033[34m";
        
        Scanner reader = new Scanner(System.in);
        
        String continuar = "s";
        
        ArrayList<Team> lista1 = new ArrayList();
        
        while ("s".equals(continuar)){
            
            System.out.println(blue + "----WELCOME TO KOMBAT MORTAL XII----");
            System.out.println("");
            System.out.println("1. Play");
            System.out.println("2. Exit");

            int respuesta = Utilidades.leerEntero("Choose an option: ");

            if (respuesta == 1){
                
                System.out.println("----FIGHT MENU----");
                
                /** Creamos equipos **/
                Team equipo1 = new Team("Equipo1");
                Team equipo2 = new Team("Equipo2");
                Team equipo3 = new Team("Equipo3");
                
                /** Creamos varios jugadores **/
                Human human2 = new Human("Paco", 10, 5, 50, lista1);
                Warrior warrior2 = new Warrior("Segismundo", 15, 0, 60, lista1);
                Alien alien2 = new Alien("Miguel", 5, 15, 70, lista1);
                
                /** Añadimos un item a un jugador y comprobamos que funciona correctamente **/
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                
                Item Espada = new Item("Espada", 10, 1);
                
                human2.add(Espada);
                
                System.out.println(human2);
                
                System.out.println("");
                
                System.out.println("----------------------------------------------------");
                
                /** Añadimos jugadores a equipos **/
                equipo1.add(human2);
                equipo1.add(warrior2);
                equipo1.add(alien2);
                equipo2.add(human2);
                equipo2.add(alien2);
                equipo2.add(warrior2);
                equipo3.add(alien2);
                equipo3.add(warrior2);
                equipo3.add(human2);
                
                /** **/
                System.out.println("");
                System.out.println(equipo1);
                System.out.println("");
                System.out.println(equipo2);
                System.out.println("");
                System.out.println(equipo3);
                
                System.out.println("----------------------------------------------------");
                
                /** Imprimimos por pantalla los miembros del equipo **/
                System.out.println("");
                equipo1.getMembers();
                System.out.println("");
                equipo2.getMembers();
                System.out.println("");
                equipo3.getMembers();
                
                System.out.println("----------------------------------------------------");
                
                System.out.println("");
                System.out.println(human2);
                System.out.println("");
                System.out.println(warrior2);
                System.out.println("");
                System.out.println(alien2);
                
                System.out.println("----------------------------------------------------");
                
                while (warrior2.getLife() > 0 || human2.getLife() > 0){
                    
                    human2.attack(warrior2);
                    
                    String respuesta1;
                    respuesta1 = Utilidades.leerTexto("Pulsa 'Enter' para continuar");
                    
                    if (respuesta1.equals("no") || respuesta1.equals("n")){
                        
                        System.out.println(blue + "THANKS FOR PLAYING");
                        System.exit(0);
                        
                    }
                    
                    if (warrior2.getLife() == 0 || human2.getLife() == 0){
                        
                        if (warrior2.getLife() <= 0){
                            
                            System.out.println(warrior2.getName() + " ha muerto!!!");
                            
                        }
                        else if (human2.getLife() <= 0){
                            
                            System.out.println(human2.getName() + " ha muerto!!!");
                            
                        }
                        System.out.println(blue + "THANKS FOR PLAYING");
                        System.exit(0);
                        
                    }
                    
                }
                
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                
                while (alien2.getLife() > 0){
                    
                    warrior2.attack(alien2);
                    
                }
                
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                
                while (human2.getLife() > 0){
                    
                    alien2.attack(human2);
                    
                }
                
                
                
            }        
            
            if (respuesta == 2){
                
                System.out.println(blue + "THANKS FOR PLAYING");
                System.exit(0);
                
            }
            
        }
    }
}
