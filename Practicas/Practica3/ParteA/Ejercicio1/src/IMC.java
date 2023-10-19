public class IMC {
    private double weight;
    private double height;

    public IMC(){

    }

    public IMC(double weight, double height) {
        this.weight = weight;
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public double getHeight() {
        return height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateIMC (){
        return weight / (height * height);
    }


    /*
        ¿Cómo se llama el mecanismo que permite a una clase tener dos métodos con el
        mismo nombre pero que difieren en su firma?
        Respuesta: Sobrecarga de métodos
    */

    public double calculateIMC(long weight, long height){
        return (double) weight / (height * height);
    }
}
