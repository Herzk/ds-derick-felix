import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o custo de fábrica do carro: ");
        double custoFabrica = read.nextDouble();
        double custoFinal = custoFabrica + (custoFabrica * 0.28) + (custoFabrica * 0.45);

        System.out.print("O custo final do carro para o consumidor é de $" + custoFinal);

        read.close();
    }
}