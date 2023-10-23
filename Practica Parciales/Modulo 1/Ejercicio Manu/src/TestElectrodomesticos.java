public class TestElectrodomesticos {
    public static void main(String[] args) {
        Heladera heladera=Heladera.getInstance();
        Licuadora licuadora=new Licuadora(100);
        ReproductorDeMusica musica=new ReproductorDeMusica(5);

        heladera.cambiarPoder();
        heladera.sePudrieron();
        heladera.cambiarEncendido();
        heladera.sePudrieron();
        System.out.println();

        licuadora.licuar("Manzana","Banana");
        licuadora.cambiarPoder();
        licuadora.cambiarEncendido();
        System.out.println(licuadora.licuar("Manzana","Banana"));
        System.out.println();

        for (int i = 0; i < 3; i++) {
            musica.reproducirCancion();
        }
        System.out.println();
        musica.cambiarPoder();
        musica.cambiarEncendido();
        musica.reproducirCD();

    }
}
