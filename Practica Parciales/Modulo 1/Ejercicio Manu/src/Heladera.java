public class Heladera extends Electrodomestico{
    private int alimentos=20;
    private static Heladera instance=null;

    private Heladera(){

    }

    public static Heladera getInstance() {
        if (instance==null){
            instance=new Heladera();
        }
        return instance;
    }

    public void sePudrieron(){
        if (this.encendido== Bool.NO || this.poder== Bool.NO){
            System.out.println("Se pudrio todo");
        }
    }
}
