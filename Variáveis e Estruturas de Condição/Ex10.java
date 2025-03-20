import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o salário mensal do funcionário: ");
        double salario = read.nextDouble();
        System.out.print("Insira (A) para aumento e (D) para desconto no salário: ");
        char tipoReajuste = read.next().charAt(0);
        System.out.print("Insira o percentual do reajuste: ");
        double reajuste = read.nextDouble();
        double novoSalario = salario;

        if(tipoReajuste == 'a' || tipoReajuste == 'A') {
            novoSalario = salario + (salario * (reajuste / 100));
        } else if(tipoReajuste == 'd' || tipoReajuste == 'D') {
            novoSalario = salario - (salario * (reajuste / 100));
        }

        System.out.print("\nNovo salário: $" + novoSalario);

        read.close();
    }
}