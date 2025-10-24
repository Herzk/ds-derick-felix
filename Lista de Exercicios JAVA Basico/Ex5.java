import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o valor do salário mínimo: R$");
        double salarioMinimo = read.nextDouble();
        System.out.print("Insira o valor do seu salário: R$");
        double salario = read.nextDouble();
        double numDeSalariosMinimos = salario/salarioMinimo;
        System.out.print("\nNúmero de salários mínimos ganhos: "+numDeSalariosMinimos);

        read.close();
    }
}
