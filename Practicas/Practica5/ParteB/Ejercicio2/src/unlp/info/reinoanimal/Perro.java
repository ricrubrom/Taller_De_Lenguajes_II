package unlp.info.reinoanimal;

public class Perro extends Animal{
    @Override
    protected void saludo(){
        System.out.println("Guau!");
    }
}

//tiene error por los especificadores de acceso, es mas restrictivo que el padre