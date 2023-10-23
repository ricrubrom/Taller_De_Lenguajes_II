public class ReproductorDeMusica extends Electrodomestico{
    private int cancionActual;
    private int canciones;

    public ReproductorDeMusica(int canciones) {
        this.cancionActual = 1;
        this.canciones = canciones;
    }
    public void reproducirCancion(){
        if (this.encendido== Bool.NO || this.poder== Bool.NO){
            System.out.println("No se puede reproducir");
            return;
        }
        if (cancionActual<=canciones) {
            System.out.println("Cancion " + cancionActual++);
        }
        else{
            System.out.println("Ya se termino el disco");
        }
    }

    public void reproducirCD(){
        if (this.encendido== Bool.NO || this.poder== Bool.NO){
            System.out.println("No se puede reproducir");
            return;
        }
        cancionActual=1;
        for (int i = 0; i <canciones; i++) {
            reproducirCancion();
        }
    }
}
