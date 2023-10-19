package unlp.info.reinoanimal;

public class Gato extends Animal{
    @Override
    protected void saludo(){
        System.out.println("Miau!");
    }
}

//tiene error por los especificadores de acceso, es mas restrictivo que el padre
