import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o nome: ");
        String nome = read.nextLine();
        System.out.print("Insira a altura: ");
        double altura = read.nextDouble();
        System.out.print("Insira o sexo, considerando (F) para feminino e (M) para masculino: ");
        char sexo = read.next().charAt(0);
        double pesoIdeal = 0;

        if(sexo == 'f' || sexo == 'F') {
            pesoIdeal = (62.1 * altura) - 44.7;
        } else if(sexo == 'm' || sexo == 'M') {
            pesoIdeal = (72.7 * altura) - 58;
        }

        System.out.print("\nPeso ideal de " + nome + ": " + pesoIdeal);

        read.close();
    }
}