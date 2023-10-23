package Ejercicio3;

public class TestOrquesta {
    public static void main(String[] args) {
        Orquesta orquesta=new Orquesta(2,3,2);
        orquesta.agregarInstrumento(new Cuerdas());
        orquesta.agregarInstrumento(new Cuerdas());
        orquesta.agregarInstrumento(new Viento());
        orquesta.agregarInstrumento(new Viento());
        orquesta.agregarInstrumento(new Viento());
        orquesta.agregarInstrumento(new Percusion());
        orquesta.agregarInstrumento(new Percusion());

        if (!orquesta.verificarOrquesta()) {
            throw new RuntimeException("La orquesta esta incompleta");
        }
        Instrumento instrumentos[]=orquesta.getInstrumentos();
        for (int i = 0; i < instrumentos.length; i++) {
            Luthier.getInstance().afinar(instrumentos[i]);
            System.out.println(instrumentos[i].getAfinacion());
        }

        System.out.println();
        for (int i = 0; i < instrumentos.length; i++) {
            instrumentos[i].tocar();
        }

    }
}
