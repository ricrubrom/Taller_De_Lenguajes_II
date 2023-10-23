package Ejercicio3;

public class Cuerdas extends Instrumento{

    @Override
    public void tocar(){
        System.out.println("Tocando las cuerdas con afinacion "+getAfinacion());
    }
}
