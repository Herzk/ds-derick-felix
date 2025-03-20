import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o consumo do carro em Km/L: ");
        double cons = read.nextDouble();
        System.out.print("Insira a distância a ser percorrida em Km: ");
        double dist = read.nextDouble();
        System.out.print("Insira o preço unitário do litro de combustível: ");
        double precoComb = read.nextDouble();
        double custo = dist / cons * precoComb;

        System.out.print("\nO custo estimado com combustível na viagem é de: $" + custo);

        read.close();
    }
}