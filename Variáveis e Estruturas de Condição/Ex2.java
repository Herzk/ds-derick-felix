import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira a distância total percorrida pelo automóvel em quilômetro: ");
        float distPerc = read.nextFloat();
        System.out.print("Insira o total de combustível gasto em litros: ");
        float combGasto = read.nextFloat();
        float consMedio = distPerc / combGasto;

        System.out.print("\nConsumo médio do automóvel: " + consMedio + " quilômetro(s) por litro");

        read.close();
    }
}
