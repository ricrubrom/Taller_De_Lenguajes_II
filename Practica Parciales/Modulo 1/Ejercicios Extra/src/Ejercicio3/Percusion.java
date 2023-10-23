package Ejercicio3;

public class Percusion extends Instrumento{
    @Override
    public void tocar(){
        System.out.println("Tocando instrumento de percusión con afinacion "+getAfinacion());
    }
}
