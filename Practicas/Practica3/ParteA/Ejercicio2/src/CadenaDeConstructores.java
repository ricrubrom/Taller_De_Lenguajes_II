class CadenaDeConstructores {
    public static void main(String[] args) {
        Hijo h = new Hijo();
    }
}

/*
    Output:
        Constructor abuelo()
        Constructor padre(10)
        Constructor hijo()



    c) Donde se encuentran estas llamadas sucesivas que forman la cadena de constructores?
    En la clase Hijo, en la primera linea del constructor Hijo() se llama al constructor padre(10) y en la primera linea del constructor padre(int i) se llama al constructor abuelo().
*/