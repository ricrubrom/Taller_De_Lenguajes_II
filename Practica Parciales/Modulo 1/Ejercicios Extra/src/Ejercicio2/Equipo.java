package Ejercicio2;

import java.util.LinkedList;

public class Equipo {
    private LinkedList<Jugador> jugadores;

    public Equipo() {
        jugadores = new LinkedList<Jugador>();
    }

    public void addJugador(Jugador j){
        jugadores.add(j);
    }

    public void removeJugador(Jugador j){
        jugadores.remove(j);
    }

    public Jugador getJugador(int i){
        return jugadores.get(i);
    }

    public int size(){
        return jugadores.size();
    }

}
