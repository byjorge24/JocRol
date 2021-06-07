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
    public static void main(String[] args){
        // TODO code application logic here
        
        provaFase();
        
    }
    
    public static void provaFase(){
        
        String blue="\033[34m";
        
        Scanner reader = new Scanner(System.in);
        
        String continuar = "s";
        
        ArrayList<Team> equips = new ArrayList();
        ArrayList<Player> jugadors = new ArrayList();
        ArrayList<Human> humanos = new ArrayList();
        ArrayList<Warrior> warriors = new ArrayList();
        ArrayList<Alien> aliens = new ArrayList();
        ArrayList<Item> items = new ArrayList();
        
        while ("s".equals(continuar)){
            
            System.out.println("");
            
            System.out.println(blue + "----WELCOME TO KOMBAT MORTAL XII----");
            
            System.out.println("");
            
            System.out.println("----MENU----");
            System.out.println("1. Configuració");
            System.out.println("2. Jugar");
            System.out.println("3. Eixir");
            
            System.out.println("");
            
            int respuesta = Utilidades.leerEntero("Elige una opción: ");
            
            System.out.println("");
            
            if (respuesta == 1){
                
                System.out.println("");
                
                System.out.println("----CONFIGURACIÓ----");
                System.out.println("1.1 Gestió jugadors");
                System.out.println("1.2 Gestió equips");
                System.out.println("1.3 Gestió objectes");
                System.out.println("1.4 Eixir");
                
                System.out.println("");
                
                String respuesta2 = Utilidades.leerTexto("Elige una opción: ");
                
                if ("1.1".equals(respuesta2)){
                    
                    System.out.println("");
                    
                    System.out.println("----JUGADORS----");
                    System.out.println("1.1.1 Crear jugador");
                    System.out.println("1.1.2 Mostrar jugadors");
                    System.out.println("1.1.3 Esborrar jugador");
                    System.out.println("1.1.4 Assignar jugador a equip");
                    System.out.println("1.1.5 Assignar objecte a jugador");
                    System.out.println("1.1.6 Eixir");
                    
                    System.out.println("");
                    
                    String respuesta3 = Utilidades.leerTexto("Elige una opción: ");
                    
                    if ("1.1.1".equals(respuesta3)){
                        
                        System.out.println("");
                        
                        System.out.println("---TIPUS JUGADORS----");
                        System.out.println("1. Human");
                        System.out.println("2. Warrior");
                        System.out.println("3. Alien");
                        
                        System.out.println("");
                        
                        int tipo = Utilidades.leerEntero("Elige una opcion: ");
                        
                        System.out.println("");
                        
                        String nombre = Utilidades.leerTexto("Introduce el nombre del personaje: ");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            if (jugadors.get(i).getName().equals(nombre)){
                                
                                System.out.println("Ya existe este personaje!!!");
                                
                                while (jugadors.get(i).getName().equals(nombre)){
                                    
                                    nombre = Utilidades.leerTexto("Introduce el nombre del personaje: ");
                                    
                                }
                            }
                        }
                        
                        System.out.println("");
                        
                        int pa = Utilidades.leerEntero("Introduce los PA de " + nombre + ": ");
                        
                        System.out.println("");
                        
                        int pd = Utilidades.leerEntero("Introduce los PD de " + nombre + ": ");
                        
                        while (pd > pa){
                            
                            System.out.println("Los puntos de defensa no pueden ser superiores a los puntos de ataque!!!");
                            
                            pd = Utilidades.leerEntero("Introduce los Pd de " + nombre + ": ");
                            
                        }
                        
                        if ((pd + pa) > 100){
                            
                            pa = 100 - pd;
                            
                        }
                        
                        System.out.println("");
                        
                        int vida = Utilidades.leerEntero("Introduce los PV de " + nombre + ": ");
                        
                        
                        
                        switch (tipo) {
                            case 1:
                                
                                Human humano = new Human(nombre, pa, pd, vida);
                                
                                jugadors.add(humano);
                                
                                humanos.add(humano);
                                
                                break;
                            case 2:
                                
                                Warrior warrior = new Warrior(nombre, pa, pd, vida);
                                
                                jugadors.add(warrior);
                                
                                warriors.add(warrior);
                                
                                break;
                            case 3:
                                
                                Alien alien = new Alien(nombre, pa, pd, vida);
                                
                                jugadors.add(alien);
                                
                                aliens.add(alien);
                                
                                break;
                            default:
                                break;
                        }
                        
                    }
                    else if ("1.1.2".equals(respuesta3)){
                        
                        System.out.println("");
                        
                        System.out.println("----JUGADORS----");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            System.out.println(jugadors.get(i));
                            
                        }
                        
                    }
                    else if ("1.1.3".equals(respuesta3)){
                        
                        System.out.println("----BORRAR JUGADOR----");
                        
                        System.out.println("");
                        
                        System.out.println("---- JUGADORS ----");
                        
                        for (int x = 0; x < jugadors.size(); x++){
                            
                            System.out.println(jugadors.get(x));
                            
                        }
                        
                        String nombreB = Utilidades.leerTexto("Introduce el nombre del jugador:");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            if (jugadors.get(i).getName().equals(nombreB)){
                                
                                jugadors.remove(i);
                                System.out.println("Jugador eliminado correctamente!!!");
                                
                            }
                            
                        }
                        
                    }
                    else if ("1.1.4".equals(respuesta3)){
                        
                        System.out.println("----ASSIGNAR JUGADOR A EQUIP----");
                        
                        System.out.println("");
                        
                        System.out.println("----EQUIPS----");
                        
                        for (int i = 0; i < equips.size(); i++){
                            
                            System.out.println(equips.get(i));
                            
                            if (equips.size() <= 0){
                                
                                System.out.println("No hay ningun equipo!!!");
                                
                            }
                            
                        }
                        
                        System.out.println("");
                        
                        String nomequip = Utilidades.leerTexto("Introduce el nombre del equip: ");
                        
                        System.out.println("");
                        
                        System.out.println("----JUGADORS----");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            System.out.println(jugadors.get(i));
                            
                            System.out.println("");
                            
                            String nomjugador = Utilidades.leerTexto("Introduce el nombre del jugador: ");
                        
                            System.out.println("");
                            
                            
                            for (int x = 0; x < jugadors.size(); x++){

                                if (jugadors.get(x).getName().equals(nomjugador)){

                                    System.out.println("Jugador correcto");
                                    equips.get(i).add(jugadors.get(x));
                                    System.out.println("");
                                    System.out.println("Jugador añadido correctamente!!!");

                                }
                                else {

                                    System.out.println("El jugador no existe!!!");

                                }
                                    
                            }
                            
                        }
                        
                    }
                    else if ("1.1.5".equals(respuesta3)){
                        
                        System.out.println("----ASSIGNAR OBJECTE A JUGADOR----");
                        
                        System.out.println("");
                        
                        System.out.println("----OBJECTES----");
                        for (int i = 0; i < items.size(); i++){
                            
                            System.out.println(items.get(i));
                            
                        }
                        
                        System.out.println("");
                        
                        String itemnombre = Utilidades.leerTexto("Introduce el nombre del item: ");
                        
                        System.out.println("");
                        
                        System.out.println("----JUGADORS----");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            System.out.println(jugadors.get(i));
                            
                        }
                        
                        for (int i = 0; i < items.size(); i++){
                            
                            if (items.get(i).getName().equals(itemnombre)){
                                
                                System.out.println("Item correcto!!!");
                                
                            }
                            
                            for (int x = 0; x < 1; x++){
                                
                                System.out.println("");
                        
                                String jugadornombre = Utilidades.leerTexto("Introduce el nombre del jugador: ");

                                if (jugadors.get(i).getName().equals(jugadornombre)){

                                    System.out.println("!!!Jugador Correcte¡¡¡");
                                    jugadors.get(i).add(items.get(i));
                                }
                            }
                            
                        }
                        
                        
                        
                        
                    }
                    else if ("1.1.6".equals(respuesta3)){
                        
                        
                        
                    }
                    
                }
                else if ("1.2".equals(respuesta2)){
                    
                    System.out.println("");
                    
                    System.out.println("----EQUIPS----");
                    System.out.println("1.2.1 Crear equip");
                    System.out.println("1.2.2 Mostrar equips");
                    System.out.println("1.2.3 Esborrar equip");
                    System.out.println("1.2.4 Assignar equip a jugador");
                    System.out.println("1.2.5 Eixir");
                    
                    System.out.println("");
                    
                    String respuesta4 = Utilidades.leerTexto("Elige una opción: ");
                    
                    System.out.println("");
                    
                    if ("1.2.1".equals(respuesta4)){
                        
                        String nombreE;
                        
                        nombreE = Utilidades.leerTexto("Introduce el nombre del equipo: ");
                        
                        for (int i = 0; i < equips.size(); i++){
                            
                            if (equips.get(i).getName().equals(nombreE)){
                                
                                System.out.println("Ya existe este equipo!!!");
                                
                                while (equips.get(i).getName().equals(nombreE)){
                                    
                                    nombreE = Utilidades.leerTexto("Introduce el nombre del equipo: ");
                                    
                                }
                                
                            }
                            
                        }
                        
                        Team equipo = new Team(nombreE);
                        
                        equips.add(equipo);
                        
                        System.out.println("");
                        
                    }
                    else if ("1.2.2".equals(respuesta4)){
                        
                        System.out.println("----EQUIPS----");
                        
                        for (int i = 0; i < equips.size(); i++){
                            
                            System.out.println(equips.get(i));
                            
                        }
                        
                    }
                    else if ("1.2.3".equals(respuesta4)){
                        
                        String nombreEborrar;
                        
                        nombreEborrar = Utilidades.leerTexto("Introduce el nombre del equipo a borrar: ");
                        
                        for (int i = 0; i < equips.size(); i++){
                            
                            if (equips.get(i).getName().equals(nombreEborrar)){
                                
                                equips.remove(equips.get(i));
                                
                                System.out.println("Equipo eliminado correctamente!!!");
                                
                            }
                            
                        }
                        
                    }
                    else if ("1.2.4".equals(respuesta4)){
                        
                        System.out.println("---- JUGADORS ----");
                        
                        for (int x = 0; x < jugadors.size(); x++){
                            
                            System.out.println(jugadors.get(x));
                            
                        }
                        
                        String nomJ;
                        
                        nomJ = Utilidades.leerTexto("Introduce el nombre del jugador: ");
                        
                        for (int i = 0; i < jugadors.size(); i++){
                            
                            if (jugadors.get(i).getName().equals(nomJ)){
                                
                                System.out.println("Jugador correcte!!!");
                                
                            }
                            
                        }
                        
                        System.out.println("");
                        
                        System.out.println("---- EQUIPOS ----");
                        
                        for (int k = 0;k < equips.size(); k++){
                            
                            System.out.println(equips.get(k));
                            
                        }
                        
                        String nombreEquipo;
                        
                        nombreEquipo = Utilidades.leerTexto("Introduce el nombre del equipo: ");
                        
                        for (int i = 0; i < equips.size(); i++){
                            
                            if (equips.get(i).getName().equals(nombreEquipo)){
                                
                                System.out.println("Equip correcte!!!");
                                
                                System.out.println("");
                                
                                for (int x = 0; x < jugadors.size(); x++){
                                    
                                    if (jugadors.get(x).getName().equals(nomJ)){
                                        
                                        equips.get(i).add(jugadors.get(i));
                                        System.out.println("Añadido correctamente!!!");
                                        System.out.println("");
                                        
                                    }
                                }
                            }
                        }
                    }
                    else if ("1.2.5".equals(respuesta4)){
                        
                        
                        
                    }
                    
                }
                else if ("1.3".equals(respuesta2)){
                    
                    System.out.println("");
                    
                    System.out.println("----OBJECTES----");
                    System.out.println("1.3.1 Crear objecte");
                    System.out.println("1.3.2 Mostrar objectes");
                    System.out.println("1.3.3 Esborrar objecte");
                    System.out.println("1.3.4 Assignar objecte a jugador");
                    System.out.println("1.3.5 Eixir");
                    
                    System.out.println("");
                    
                    String respuesta5 = Utilidades.leerTexto("Elige una opción: ");
                    
                    System.out.println("");
                    
                    if ("1.3.1".equals(respuesta5)){
                        
                        System.out.println("----CREAR ITEM----");
                        
                        System.out.println("");
                        
                        String nombreO;
                        
                        nombreO = Utilidades.leerTexto("Introduce el nombre del Item: ");
                        
                        int ataqueB;
                        
                        ataqueB = Utilidades.leerEntero("Introduce el bonus de ataque del Item: ");
                        
                        int defensaB;
                        
                        defensaB = Utilidades.leerEntero("Introduce el bonus de defensa del Item: ");
                        
                        for (int i = 0; i < items.size(); i++){
                            
                            if (items.get(i).getName().equals(nombreO)){
                                
                                System.out.println("Ya existe este objecto!!!");
                                System.out.println("");
                            }
                        }
                        
                        Item itemA = new Item(nombreO, ataqueB, defensaB);

                        items.add(itemA);

                        System.out.println("Item añadido!!!");
                        System.out.println("");
                        
                    }
                    else if ("1.3.2".equals(respuesta5)){
                        
                        System.out.println("----MOSTRAR ITEMS----");
                        
                        for (int i = 0; i < items.size(); i++){
                            
                            System.out.println(items.get(i));
                            
                        }
                        
                        System.out.println("");
                        
                    }
                    else if ("1.3.3".equals(respuesta5)){
                        
                        System.out.println("----BORRAR ITEM----");
                        
                        String nombreOborrar;
                        
                        nombreOborrar = Utilidades.leerTexto("Introduce el nombre del Item a borrar: ");
                        
                        for (int i = 0; i < items.size(); i++){
                            
                            if (items.get(i).getName().equals(nombreOborrar)){
                                
                                System.out.println("Item correcto!!!");
                                
                                items.remove(items.get(i));
                                
                            }
                            System.out.println("Se ha borrar correctamente el Item " + items.get(i).getName());
                        }
                        
                        System.out.println("");
                        
                    }
                    else if ("1.3.4".equals(respuesta5)){
                        
                        System.out.println("----ASSIGNAR ITEM A JUGADOR----");
                        
                        System.out.println("");
                        
                        System.out.println("---- ITEMS ----");
                        
                        for (int x = 0; x < items.size(); x++){
                            
                            System.out.println(items.get(x));
                            
                        }
                        
                        String nombreIañadir;
                        
                        nombreIañadir = Utilidades.leerTexto("Introduce el nombre del Item: ");
                        
                        for (int i = 0; i < items.size(); i++){
                            
                            if (items.get(i).getName().equals(nombreIañadir)){
                                
                                System.out.println("Item correcto");
                                
                                String nombreJ;
                                
                                nombreJ = Utilidades.leerTexto("Introduce el nombre del jugador: ");
                                
                                for (int x = 0; x < jugadors.size(); x++){
                                    
                                    if (jugadors.get(x).getName().equals(nombreJ)){
                                        
                                        System.out.println("Jugador correcto!!!");
                                        
                                        jugadors.get(x).add(items.get(i));
                                        
                                        System.out.println("");
                                        
                                        System.out.println("Item añadido correctamente a " + jugadors.get(x).getName());
                                        
                                    }
                                    
                                }
                                
                            }
                            
                        }
                        
                    }
                    else if ("1.3.5".equals(respuesta5)){
                        
                        
                        
                    }
                    
                }
                else if ("1.4".equals(respuesta2)){
                    
                    
                }
            }
            else if (respuesta == 2){
                
                System.out.println(blue + "----EL JUEGO HA EMPEZADO----");
                    
                    System.out.println("");
                    
                    boolean jugar = true;
                    
                    while (jugar){
                        
                        System.out.println("");
                        
                        System.out.println("1. Jugar aleatoriamente");
                        
                        System.out.println("2. Jugar Normal");
                        
                        System.out.println("3. Salir");
                        
                        System.out.println("");
                        
                        int eleccion = Utilidades.leerEntero("Elige una opcion: ");
                        
                        if (eleccion == 1){
                            
                            System.out.println("");
                            
                            System.out.println("---- ELIGIENDO LOS JUGADORES ALEATORIAMENTE ----");
                            
                            System.out.println("---- Player 1 ----");
                            
                            Player player3 = null;
                            
                            int random1;
                            
                            int longitud = jugadors.size();
                            
                            Random r = new Random();
                            
                            random1 =  r.nextInt(longitud);
                            
                            for (int i = 0; i < jugadors.size(); i++){
                                
                                if (i == random1){
                                    
                                    player3 = jugadors.get(i);
                                    
                                }
                                
                            }
                            
                            System.out.println("El jugador 1 es: " + player3.getName());
                            
                            System.out.println("---- Player 2 ----");
                            
                            Player player4 = null;
                            
                            int random2;
                            
                            random2 = r.nextInt(longitud);
                            
                            if (random2 == random1){
                                
                                random2 = r.nextInt(longitud);
                                
                            }
                            
                            for (int x = 0; x < jugadors.size(); x++){
                                
                                if (x == random2){
                                    
                                    player4 = jugadors.get(x);
                                    
                                }
                                
                            }
                            
                            System.out.println("El jugador 2 es: " + player4.getName());
                            
                            int vida1 = player3.getLife();
                            
                            int vida2 = player4.getLife();
                            
                            while (player3.getLife() > 0 || player4.getLife() > 0){
                                
                                System.out.println("---------------------------------------------");
                                
                                System.out.println("");
                                
                                player3.attack(player4);
                                
                                System.out.println("---------------------------------------------");
                                
                                System.out.println("");
                                
                                player4.attack(player3);
                                
                                System.out.println("Pulsa Enter para Continuar: ");
                                
                                String continuar1 = "";
                                
                                continuar1 = Utilidades.leerTexto("");
                                
                                if (player3.getLife() <= 0){
                                    
                                System.out.println(player3.getName() + " ha mort!!!");
                                
                                try {
                                    
                                    if (player3.getLife() <= 0);
                                    
                                    
                                }
                                catch (Exception JugadorMort){
                                    
                                    System.out.println("Un jugador mort no pot atacar!!!");
                                    
                                }
                                try {
                                    
                                    if (player4.getLife() <= 0);
                                    
                                }
                                catch (Exception JugadorMort){
                                    
                                    System.out.println("Un jugador mort no pot atacar!!!");
                                    
                                }
                                
                                player3.setLife(vida1);
                                
                                player4.setLife(vida2);
                                
                                System.out.println("");
                                
                                System.out.println(blue + " HA GUANYAT " + player4.getName());
                                
                                System.out.println("");
                                
                                System.out.println(blue + "THANKS FOR PLAYING");
                                break;
                                
                                }
                                else if (player4.getLife() <= 0){

                                    System.out.println(player4.getName() + " ha mort!!!");
                                    
                                    player3.setLife(vida1);
                                    
                                    player4.setLife(vida2);
                                    
                                    System.out.println("");
                                    
                                    System.out.println(blue + " HA GUANYAT " + player3.getName());
                                    
                                    System.out.println("");
                                    
                                    System.out.println(blue + "THANKS FOR PLAYING");
                                    break;

                                } 
                                
                            }
                            try {
                                
                                if (player3.getName().equals(player4.getName()));
                                
                            }
                            catch (Exception JugadorAtaque){
                                
                                System.out.println("Un jugador no puede atacarse a el mismo");
                                
                            }
                            
                        }
                        
                        if (eleccion == 2){
                            
                            System.out.println("---- JUGADORS ----");
                    
                            for (int i = 0; i < jugadors.size(); i++){

                                System.out.println(jugadors.get(i));

                            }
                            
                            Player player1 = null;
                            
                            Player player2 = null;
                            
                            String jugador1 = Utilidades.leerTexto("Player 1: ");
                            
                            String jugador2 = Utilidades.leerTexto("Player2: ");
                            
                            for (int i = 0; i < jugadors.size(); i++){
                                
                                if (jugadors.get(i).getName().equals(jugador1)){
                                    
                                    player1 = jugadors.get(i);
                                    
                                }
                                else {
                                    
                                    System.out.println("El jugador no existeix!!!");
                                    
                                }
                                if (jugadors.get(i).getName().equals(jugador2)){
                                    
                                    player2 = jugadors.get(i);
                                }
                                else {
                                    
                                    System.out.println("El jugador no existeix!!!");
                                    
                                }
                                
                            }
                            
                            int vidaj1 = player1.getLife();
                            
                            int vidaj2 = player2.getLife();
                            
                            while (player1.getLife() > 0 || player2.getLife() > 0){
                                
                                System.out.println("---------------------------------------------");
                                
                                System.out.println("");
                                
                                player1.attack(player2);
                                
                                System.out.println("---------------------------------------------");
                                
                                System.out.println("");
                                
                                player2.attack(player1);
                                
                                try {
                                    
                                    if (player1.getLife() <= 0);
                                    
                                    
                                }
                                catch (Exception JugadorMort){
                                    
                                    System.out.println("Un jugador mort no pot atacar!!!");
                                    
                                }
                                try {
                                    
                                    if (player2.getLife() <= 0);
                                    
                                }
                                catch (Exception JugadorMort){
                                    
                                    System.out.println("Un jugador mort no pot atacar!!!");
                                    
                                }
                                
                                System.out.println("Pulsa Enter para Continuar: ");
                                
                                String continuar2 = "";
                                
                                continuar2 = Utilidades.leerTexto("");
                                
                                if (player1.getLife() <= 0){
                                
                                System.out.println(player1.getName() + " ha mort!!!");
                                
                                player1.setLife(vidaj1);
                                
                                player2.setLife(vidaj2);
                                
                                System.out.println("");
                                
                                System.out.println(blue + "THANKS FOR PLAYING");
                                break;
                                
                                }
                                else if (player2.getLife() <= 0){

                                    System.out.println(player2.getName() + " ha mort!!!");
                                    
                                    player1.setLife(vidaj1);
                                    
                                    player2.setLife(vidaj2);
                                    
                                    System.out.println("");
                                    
                                    System.out.println(blue + "THANKS FOR PLAYING");
                                    break;

                                } 
                            }
                        }
                        if (eleccion == 3){
                            
                            jugar = false;
                            
                        }
                    }
            }
            else if (respuesta == 3){
                
                System.out.println(blue + "THANKS FOR PLAYING");
                System.exit(0);
                
            }
        }
    }
}
