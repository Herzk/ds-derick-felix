import java.util.Scanner;
public class Ex4 {
    public static void main(String[] arg){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira a porcentagem do IPI: ");
        double IPI = (read.nextDouble()/100);
        System.out.print("\nPeça 1\nCódigo: ");
        int codigo1 = read.nextInt();
        System.out.print("Valor Unitário: ");
        double valor1 = read.nextInt();
        System.out.print("Quantidade: ");
        double quantidade1 = read.nextInt();
        System.out.print("\nPeça 2\nCódigo: ");
        int codigo2 = read.nextInt();
        System.out.print("Valor Unitário: ");
        double valor2 = read.nextInt();
        System.out.print("Quantidade: ");
        double quantidade2 = read.nextInt();
        double valorTotal = (valor1*quantidade1 + valor2*quantidade2)*(IPI + 1);
        System.out.print("\nValor Total: R$"+valorTotal+"\nCódigos dos produtos: "+codigo1+"; "+codigo2);

        read.close();
    }
}
