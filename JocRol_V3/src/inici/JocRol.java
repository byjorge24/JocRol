/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inici;

import joc.*;

import java.util.*;

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
        
        while ("s".equals(continuar)){
            
            System.out.println(blue + "----WELCOME TO KOMBAT MORTAL XII----");
            System.out.println("");
            System.out.println("1. Play");
            System.out.println("2. Create Player");
            System.out.println("3. Exit");

            int respuesta;
            System.out.print("Choose an option: ");
            respuesta = reader.nextInt();

            if (respuesta == 1){
                
                System.out.println("----FIGHT MENU----");
                
                Human human2 = new Human("Paco", 10, 5, 200);
                Warrior warrior2 = new Warrior("Segismundo", 15, 0, 60);
                Alien alien2 = new Alien("Miguel", 5, 15, 70);
                
                human2.attack(warrior2);
                
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                
                warrior2.attack(alien2);
                
                System.out.println("---------------------------------------------");
                
                System.out.println("");
                
                alien2.attack(human2);
                
            }

            if (respuesta == 2){

                System.out.println("----PLAYER MENU----");
                System.out.println("1. Human");
                System.out.println("2. Warrior");
                System.out.println("3. Alien");

                int elige;
                System.out.print("Choose an option: ");
                elige = reader.nextInt();

                if (elige == 1){

                    String nombre;
                    int puntosA;
                    int puntosD;
                    int puntosV;

                    System.out.print("Write the name of the human: ");
                    nombre = reader.nextLine();
                    nombre = reader.nextLine();

                    System.out.println("");

                    System.out.println("Write the Attack Points of the human: ");
                    puntosA = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Defense Points of the human: ");
                    puntosD = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Life Points of the human: ");
                    puntosV = reader.nextInt();

                    Human human1 = new Human(nombre, puntosA, puntosD, puntosV);
                    
                }

                if (elige == 2){

                    String nombre;
                    int puntosA;
                    int puntosD;
                    int puntosV;

                    System.out.print("Write the name of the Warrior: ");
                    nombre = reader.nextLine();
                    nombre = reader.nextLine();
                    
                    System.out.println("");

                    System.out.println("Write the Attack Points of the Warrior: ");
                    puntosA = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Defense Points of the Warrior: ");
                    puntosD = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Life Points of the Warrior: ");
                    puntosV = reader.nextInt();

                    Warrior warrior1 = new Warrior(nombre, puntosA, puntosD, puntosV);
                    
                }

                if (elige == 3){

                    String nombre;
                    int puntosA;
                    int puntosD;
                    int puntosV;

                    System.out.print("Write the name of the Alien: ");
                    nombre = reader.nextLine();
                    nombre = reader.nextLine();
                    
                    System.out.println("");

                    System.out.println("Write the Attack Points of the Alien: ");
                    puntosA = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Defense Points of the Alien: ");
                    puntosD = reader.nextInt();

                    System.out.println("");

                    System.out.println("Write the Life Points of the Alien: ");
                    puntosV = reader.nextInt();

                    Alien alien1 = new Alien(nombre, puntosA, puntosD, puntosV);
                    
                }
            }
            
            if (respuesta == 3){
                
                System.out.println(blue + "THANKS FOR PLAYING");
                System.exit(0);
                
            }
            
        }
    }
}
