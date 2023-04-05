/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectoayudantia1;

import java.io.*;
import java.util.*;

/**
 *
 * @author Estudiante
 */
public class ProyectoAyudantia1 {

    /**
     * @param args the command line arguments
     */
    
    //variables locales
    BufferedReader ff = new BufferedReader (new InputStreamReader(System.in));
    private HashMap <String,Equipo> mapaEquipo = new Hashmap();
    
    public static void main(String[] args) throws IOException{
        BufferedReader le = new BufferedReader (new InputStreamReader(System.in));
        boolean salir = true;
        int opcion = 0;
        ProyectoAyudantia1 pa = new ProyectoAyudantia1();
        
        while (true){
            System.out.println("1. Ingresar equipo ");
            System.out.println("2. Ingresar jugador a equipo");
            System.out.println("3. Mostrar datos del equipos");
            System.out.println("0. Salir");
            System.out.println("Ingrese opcion: ");
            opcion = Integer.parseInt(le.readLine());
            switch (opcion){
                case 1:{
                    pa.crearEquipo();
                    break;
                }
                case 2:{
                    pa.ingresarJugador();
                    break;
                }
                case 3:{
                    break;
                }
                case 0:{
                    salir = false;
                    break;
                }
            }
        }
        // TODO code application logic here
    }
    
    public void crearEquipo() throws IOException{
        System.out.println("Ingrese nombre del equipo:");
        String nombreEquipo = ff.readLine();
        System.out.println("Ingrese goles del equipo:");
        int goles = Integer.parseInt(ff.readLine());
        Equipo equipo = new Equipo(nombreEquipo, goles);
        mapaEquipo.put(nombreEquipo, equipo);
        
    }
    
    public void ingresarJugador() throws IOException{
        System.out.println("Ingrese nombre del equipo:");
        String nombreEquipo = ff.readLine();
        Equipo equipo = mapaEquipo.get(nombreEquipo);
        if(equipo == null) 
        {
            System.out.println("Equipo no existe");
            return;
        }
            
        System.out.println("Ingrese nombre del jugador:");
        String nombreJugador = ff.readLine();
        System.out.println("Ingrese velocidad:");
        double velocidad = Integer.parseInt(ff.readLine());
        System.out.println("Ingrese altura:");
        double altura = Integer.parseInt(ff.readLine());
        System.out.println("Ingrese goles del equipo:");
        int goles = Integer.parseInt(ff.readLine());
        Jugador jugador = new Jugador(nombreJugador, velocidad, altura, goles);
        
        equipo.anadirJugador(jugador);
    }
}
