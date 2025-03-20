import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        
        System.out.print("Insira a medida da base do triângulo: ");
        double b = read.nextDouble();
        System.out.print("Insira a altura do triângulo: ");
        double a = read.nextDouble();
        double A = b * a / 2;

        System.out.print("\nA área do triângulo de base " + b + " e altura " + a + " é igual a: " + A);

        read.close();
    }
}
