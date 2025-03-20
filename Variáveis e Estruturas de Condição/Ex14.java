import java.util.Scanner;

public class Ex14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o tipo de combustível, considerando (A) para álcool e (G) gasolina: ");
        char tipoComb = read.next().charAt(0);
        System.out.print("Insira a quantidade de combustível em L: ");
        double quantComb = read.nextDouble();
        double valorFinal = 0;

        if(tipoComb == 'a' || tipoComb == 'A') {
            if(quantComb > 20) {
                valorFinal = quantComb * (2.9 - (2.9 * 0.05));
            } else {
                valorFinal = quantComb * (2.9 - (2.9 * 0.03));
            }
        } else if(tipoComb == 'g' || tipoComb == 'G') {
            if(quantComb > 20) {
                valorFinal = quantComb * (3.3 - (3.3 * 0.06));
            } else {
                valorFinal = quantComb * (3.3 - (3.3 * 0.04));
            }
        }

        System.out.print("\nValor total a ser pago: $" + valorFinal);

        read.close();
    }
}