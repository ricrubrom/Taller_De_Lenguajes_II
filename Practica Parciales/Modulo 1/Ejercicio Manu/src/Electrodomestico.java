public class Electrodomestico {
    protected Bool poder;
    protected Bool encendido;

    public Electrodomestico() {
        this.poder = Bool.NO;
        this.encendido = Bool.NO;
    }

    public void cambiarPoder() {
        if (this.poder== Bool.NO){
            this.poder= Bool.SI;
            return;
        }
        this.poder = Bool.NO;
    }

    public void cambiarEncendido() {
        if (this.poder== Bool.SI && this.encendido== Bool.NO){
            this.encendido= Bool.SI;
            return;
        }
        this.encendido = Bool.NO;
    }

    public Bool getPoder() {
        return poder;
    }

    public Bool getEncendido() {
        return encendido;
    }
}
