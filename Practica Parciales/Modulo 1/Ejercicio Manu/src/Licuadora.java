import java.util.Scanner;

public class Licuadora extends Electrodomestico{
    private int vaso;
    private Velocidad velocidad;
    private final int frutas=2;

    public Licuadora(int vaso) {
        super();
        this.vaso=vaso;
        this.velocidad=Velocidad.CERO;
    }

    public void setVelocidad(Velocidad velocidad){
        this.velocidad=velocidad;
    }

    public Licuado licuar(String fruta1, String fruta2){
        if (this.poder!=Bool.SI || this.encendido!=Bool.SI){
            System.out.println("Debes encender el electrodomestico");
            return null;
        }
        Scanner sc= new Scanner(System.in);
        Bool azucar;
        Liquido liquido;


        System.out.println("Desea ponerle azucar?");
        String decision=sc.nextLine().toUpperCase();
        if (decision.equals("SI")){
            azucar = Bool.SI;
        }
        else {
            azucar = Bool.NO;
        }

        System.out.println("Desea con leche o con agua?");
        decision=sc.nextLine().toUpperCase();
        if(decision.equals("LECHE")){
            liquido = Liquido.LECHE;

        }
        else {
            liquido = Liquido.AGUA;
        }

        return new Licuado(fruta1,fruta2,azucar,liquido);
    }
}
