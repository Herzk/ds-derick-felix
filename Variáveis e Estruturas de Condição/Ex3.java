import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o seu nome: ");
        String name = read.nextLine();
        System.out.print("Insira o seu sálario fixo: ");
        double salarioFixo = read.nextDouble();
        System.out.print("Insira o seu total de vendas efetuadas no mês em dinheiro: ");
        double totalVendas = read.nextDouble();
        double salarioFinal = salarioFixo + (totalVendas * 0.15);

        System.out.print("\nNome do vendedor: " + name + "\nSalário fixo do vendedor: " + salarioFixo + "\nSalário final do vendedor: " + salarioFinal);

        read.close();
    }
}
