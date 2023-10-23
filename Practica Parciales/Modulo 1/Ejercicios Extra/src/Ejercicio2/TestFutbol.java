package Ejercicio2;

public class TestFutbol {
    public static void main(String[] args) {
        Equipo e1=new Equipo();
        Equipo e2=new Equipo();

        Jugador j1=new Jugador(Posicion.ARQUERO,Posicion.DEFENSOR);
        Jugador j2=new Jugador(Posicion.MEDIOCAMPISTA,Posicion.DELANTERO);
        Jugador j3=new Jugador(Posicion.DEFENSOR,Posicion.MEDIOCAMPISTA);
        Jugador j4=new Jugador(Posicion.DELANTERO,Posicion.DEFENSOR);
        Jugador j5=new Jugador(Posicion.MEDIOCAMPISTA,Posicion.ARQUERO);
        Jugador j6=new Jugador(Posicion.DEFENSOR,Posicion.MEDIOCAMPISTA);

        Jugador j7=new Jugador(Posicion.ARQUERO,Posicion.DEFENSOR);
        Jugador j8=new Jugador(Posicion.MEDIOCAMPISTA,Posicion.DELANTERO);
        Jugador j9=new Jugador(Posicion.DEFENSOR,Posicion.MEDIOCAMPISTA);
        Jugador j10=new Jugador(Posicion.DELANTERO,Posicion.DEFENSOR);
        Jugador j11=new Jugador(Posicion.MEDIOCAMPISTA,Posicion.ARQUERO);

        e1.addJugador(j1);
        e1.addJugador(j2);
        e1.addJugador(j3);
        e1.addJugador(j4);
        e1.addJugador(j5);
        e1.addJugador(j6);

        e2.addJugador(j7);
        e2.addJugador(j8);
        e2.addJugador(j9);
        e2.addJugador(j10);
        e2.addJugador(j11);

        if (e1.size() >= 5 && e2.size() >= 5) {
            int posiciones[] = new int[4];
            for (int i = 0; i < e1.size(); i++) {
                for (int j = 0; j < e1.getJugador(i).getPosiciones().length; j++) {
                    switch (e1.getJugador(i).getPosiciones()[j]) {
                        case ARQUERO:
                            posiciones[0]++;
                            break;
                        case DEFENSOR:
                            posiciones[1]++;
                            break;
                        case MEDIOCAMPISTA:
                            posiciones[2]++;
                            break;
                        case DELANTERO:
                            posiciones[3]++;
                            break;
                    }
                }
            }

            if (posiciones[0] < 1 | posiciones[1] < 2 | posiciones[2] < 1 | posiciones[3] < 1) {
                System.out.println("El equipo 1 no cumple con las condiciones, consigan mas jugadores");
            } else {
                System.out.println("El equipo 1 cumple con las condiciones");
                posiciones=new int[4];
                for (int i = 0; i < e2.size(); i++) {
                    for (int j = 0; j < e2.getJugador(i).getPosiciones().length; j++) {
                        switch (e2.getJugador(i).getPosiciones()[j]) {
                            case ARQUERO:
                                posiciones[0]++;
                                break;
                            case DEFENSOR:
                                posiciones[1]++;
                                break;
                            case MEDIOCAMPISTA:
                                posiciones[2]++;
                                break;
                            case DELANTERO:
                                posiciones[3]++;
                                break;
                        }
                    }
                }
                if (posiciones[0] < 1 | posiciones[1] < 2 | posiciones[2] < 1 | posiciones[3] < 1) {
                    System.out.println("El equipo 2 no cumple con las condiciones, consigan mas jugadores");
                } else {
                    System.out.println("El equipo 2 cumple con las condiciones");
                }
            }
        } else {
            System.out.println("Un equipo tiene menos de 5 jugadores");
        }
    }
}
