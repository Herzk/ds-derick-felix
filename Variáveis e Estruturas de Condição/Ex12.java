import java.util.Scanner;

public class Ex12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o número de carros vendidos: ");
        double numCarrosVend = read.nextDouble();
        System.out.print("Insira o valor total de vendas: ");
        double valorVendas = read.nextDouble();
        System.out.print("Insira o salário fixo: ");
        double salarioFixo = read.nextDouble();
        System.out.print("Insira o valor recebido por carro vendido: ");
        double valorPorCarroVend = read.nextDouble();
        double salarioFinal = salarioFixo + (valorVendas * 0.05) + (numCarrosVend * valorPorCarroVend);

        System.out.print("Salário final do vendendor: $" + salarioFinal);

        read.close();
    }
}