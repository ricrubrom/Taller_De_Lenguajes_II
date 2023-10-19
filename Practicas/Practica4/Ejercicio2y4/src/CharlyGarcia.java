public class CharlyGarcia {
    private static CharlyGarcia instance;
    private CharlyGarcia() {
    }

    public void cantar(){
        System.out.println("Soy un animal");
    }

    public static CharlyGarcia getInstance() {
        if (instance == null) {
            instance = new CharlyGarcia();
        }
        return instance;
    }
}
