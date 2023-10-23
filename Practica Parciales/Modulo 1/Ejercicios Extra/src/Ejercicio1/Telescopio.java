package Ejercicio1;

public class Telescopio extends Planeta {
    public long distancia(Planeta p){
        return p.getDistanciaSol();
    }

    public Tipo tipo(Planeta p){
        return p.getTipo();
    }
}
