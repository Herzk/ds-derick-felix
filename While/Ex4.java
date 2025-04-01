import java.util.Scanner;
public class Ex4{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o número de alunos na sua sala: ");
        int nAlunos = read.nextInt(); int i = 1; double somaNotas = 0;

        while(i <= nAlunos){
            System.out.print("Insira a nota do aluno " + i + ": ");
            somaNotas = somaNotas + read.nextDouble();
            i++;
        }

        double media = somaNotas / nAlunos;

        System.out.print("A média aritmética da nota dos alunos é: " + media);
    }
}