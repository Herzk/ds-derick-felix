import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o primeiro número: ");
        int n1 = read.nextInt();
        System.out.print("Insira o segundo número: ");
        int n2 = read.nextInt();

        int soma = n1 + n2;
        int sub = n1 - n2;
        int mult = n1 * n2;
        int div = n1 / n2;

        System.out.println("\nSoma: " + soma);
        System.out.println("\nSubtração: " + sub);
        System.out.println("\nMultiplicação: " + mult);
        System.out.println("\nDivisão: " + div);

        read.close();
    }
}