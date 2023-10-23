package Ejercicio3;

public class Orquesta {
    private int cantCuerdas;
    private int cantVientos;
    private int cantPercusion;
    private Instrumento[] instrumentos;

    public Orquesta(int cantCuerdas, int cantVientos, int cantPercusion){
        this.cantCuerdas = cantCuerdas;
        this.cantVientos = cantVientos;
        this.cantPercusion = cantPercusion;
        this.instrumentos = new Instrumento[this.cantCuerdas+this.cantVientos+this.cantPercusion];
    }

    public Instrumento[] getInstrumentos() {
        return instrumentos;
    }

    public void agregarInstrumento(Instrumento instrumento){
        for(int i=0; i<this.instrumentos.length; i++){
            if(this.instrumentos[i] == null){
                this.instrumentos[i] = instrumento;
                break;
            }
        }
    }

    public void tocarInstrumentos(){
        for(int i=0; i<this.instrumentos.length; i++){
            if(this.instrumentos[i] != null){
                this.instrumentos[i].tocar();
            }
        }
    }

    public boolean verificarOrquesta(){
        int cantCuerdas = 0;
        int cantVientos = 0;
        int cantPercusion = 0;
        for(int i=0; i<this.instrumentos.length; i++){
            if(this.instrumentos[i] != null){
                if(this.instrumentos[i] instanceof Cuerdas){
                    cantCuerdas++;
                }else if(this.instrumentos[i] instanceof Viento){
                    cantVientos++;
                }else if(this.instrumentos[i] instanceof Percusion){
                    cantPercusion++;
                }
            }
        }
        return cantCuerdas == this.cantCuerdas && cantVientos == this.cantVientos && cantPercusion == this.cantPercusion;
    }

}
