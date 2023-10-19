import java.util.Random;

public final class GeneraRandom {
    private GeneraRandom(){

    }
    private final static int MAXIMO_VALOR=10;
    private final static Random random = new Random(System.currentTimeMillis());

    public static int obtenerRandom(){
        return random.nextInt(0,MAXIMO_VALOR);
    };

}
