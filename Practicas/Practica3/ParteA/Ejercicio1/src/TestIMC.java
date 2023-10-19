import java.util.Scanner;

public class TestIMC {
    public static void main(String[] args) {
        IMC imc = new IMC();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height: ");
        double height = scanner.nextDouble();
        imc.setWeight(weight);
        imc.setHeight(height);
        double value = imc.calculateIMC();
        if (value<18.5){
            System.out.printf("%.2f , you are underweight", value);
        } else if (value>25.0) {
            System.out.printf("%.2f , you are overweight", value);
        }
        else {
            System.out.printf("%.2f , you are healthy", value);
        }
    }
}