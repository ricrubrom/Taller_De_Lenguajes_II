package Ejercicio1;

public class Planeta {
    private int lunas;
    private Tipo tipo;
    private double diametro;
    private long distanciaSol;

    public Planeta(int lunas, Tipo tipo, double diametro, long distanciaSol) {
        this.lunas = lunas;
        this.tipo = tipo;
        this.diametro = diametro;
        this.distanciaSol = distanciaSol;
    }

    public Planeta() {
        this.lunas = 0;
        this.tipo = Tipo.ROCOSO;
        this.diametro = 0;
        this.distanciaSol = 0;
    }

    public int getLunas() {
        return lunas;
    }

    public void setLunas(int lunas) {
        this.lunas = lunas;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public double getDiametro() {
        return diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public long getDistanciaSol() {
        return distanciaSol;
    }

    public void setDistanciaSol(long distanciaSol) {
        this.distanciaSol = distanciaSol;
    }
}
