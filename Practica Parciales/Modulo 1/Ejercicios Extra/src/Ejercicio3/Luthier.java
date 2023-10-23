package Ejercicio3;

import java.util.Scanner;

public class Luthier {
    private static Luthier instance;

    private Luthier() {
    }

    public static Luthier getInstance() {
        if (instance == null) {
            instance = new Luthier();
        }
        return instance;
    }

    public void afinar(Instrumento i) {
        if (i != null) {
            if (i instanceof Cuerdas) {
                i.setAfinacion(Afinacion.DO);
            } else if (i instanceof Viento) {
                System.out.println("Desea que este instrumento de viento este afinado como SI o LA?");
                Scanner sc= new Scanner(System.in);
                String afinacion = sc.nextLine().toUpperCase();
                if (afinacion.equals("SI")) {
                    i.setAfinacion(Afinacion.SI);
                } else if (afinacion.equals("LA")) {
                    i.setAfinacion(Afinacion.LA);
                }
            } else if (i instanceof Percusion) {
                i.setAfinacion(Afinacion.RE);
            }
        }
    }
}

