import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira o total de eleitores do município: ");
        double totalEleitores = read.nextDouble();
        System.out.print("Insira o total de votos brancos do município: ");
        double votosBrancos = read.nextDouble();
        System.out.print("Insira o total de votos nulos do município: ");
        double votosNulos = read.nextDouble();
        System.out.print("Insira o total de votos válidos do município: ");
        double votosValidos = read.nextDouble();
        double percentualBrancos = votosBrancos / totalEleitores * 100;
        double percentualNulos = votosNulos / totalEleitores * 100;
        double percentualValidos = votosValidos / totalEleitores * 100;

        System.out.print("\nPercentual de votos brancos em relação ao total de eleitores: " + percentualBrancos + "%");
        System.out.print("\nPercentual de votos nulos em relação ao total de eleitores: " + percentualNulos + "%");
        System.out.print("\nPercentual de votos validos em relação ao total de eleitores: " + percentualValidos + "%");
        
        read.close();
    }
}