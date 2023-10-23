package Ejercicio3;

public abstract class Instrumento{
    private Afinacion afinacion;
    public abstract void tocar();
    public Afinacion getAfinacion() {
        return afinacion;
    }

    public void setAfinacion(Afinacion afinacion) {
        this.afinacion = afinacion;
    }
}
