package Ejercicio2;

public class Jugador {
    private Posicion[] posiciones;

    public Jugador(){
        posiciones=new Posicion[2];
    }

    public Jugador(Posicion p1, Posicion p2) {
        posiciones=new Posicion[2];
        this.posiciones[0]=p1;
        this.posiciones[1]=p2;
    }

    public Posicion[] getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posicion[] posiciones) {
        this.posiciones = posiciones;
    }

    public void setPosicion(Posicion p){
        for(int i=0;i<posiciones.length;i++){
            if(posiciones[i]==null){
                posiciones[i]=p;
                break;
            }
        }
    }
}
