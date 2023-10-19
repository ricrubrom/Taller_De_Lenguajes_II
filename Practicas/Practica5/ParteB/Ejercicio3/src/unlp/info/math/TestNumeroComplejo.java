package unlp.info.math;

import java.util.Scanner;

public class TestNumeroComplejo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Inserte parte real del primer numero: ");
            double re = in.nextDouble();
            System.out.println("Inserte parte imaginaria del primer numero: ");
            double im = in.nextDouble();
            Complex c1 = new Complex(re, im);
            System.out.println("Inserte parte real del segundo numero: ");
            re = in.nextDouble();
            System.out.println("Inserte parte imaginaria del segundo numero: ");
            im = in.nextDouble();
            Complex c2 = new Complex(re, im);

            System.out.println("Suma= " + c1.add(c2) + "\nResta= " + c2.sub(c1));
        }
    }
}
