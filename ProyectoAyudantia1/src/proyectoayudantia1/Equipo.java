/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyectoayudantia1;

/**
 *
 * @author Estudiante
 */

import java.util.*;

public class Equipo {
    private String nombreEquipo;
    private ArrayList <Jugador> listaJugadores;
    private int goles;

    public Equipo(String nombreEquipo, int goles) {
        this.nombreEquipo = nombreEquipo;
        this.goles = goles;
    }

    public String getNombreEquipo() {
        return nombreEquipo;
    }

    public void setNombreEquipo(String nombreEquipo) {
        this.nombreEquipo = nombreEquipo;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public void anadirJugador(Jugador jugador){
        this.listaJugadores.add(jugador);
    }
}
