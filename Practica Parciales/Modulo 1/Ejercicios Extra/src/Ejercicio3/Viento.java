package Ejercicio3;

public class Viento extends Instrumento{
    @Override
    public void tocar(){
        System.out.println("Tocando el viento con afinacion "+getAfinacion());
    }
}
