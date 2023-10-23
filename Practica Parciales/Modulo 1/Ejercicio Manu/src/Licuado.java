public final class Licuado {
    private String fruta1;
    private String fruta2;
    private Bool azucar;
    private Liquido liquido;

    public Licuado(String fruta1, String fruta2, Bool azucar, Liquido liquido) {
        this.fruta1 = fruta1;
        this.fruta2 = fruta2;
        this.azucar = azucar;
        this.liquido = liquido;
    }

    @Override
    public String toString() {
        return "Licuado{" +
                "fruta1='" + fruta1 + '\'' +
                ", fruta2='" + fruta2 + '\'' +
                ", azucar=" + azucar +
                ", liquido=" + liquido +
                '}';
    }
}
