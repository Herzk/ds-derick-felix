import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira sua idade em anos, meses e dias:\nAnos: ");
        int anos = read.nextInt();
        System.out.print("Meses: ");
        int meses = read.nextInt();
        System.out.print("Dias: ");
        int dias = read.nextInt();
        int idadeEmDias = (anos * 365) + (meses * 30) + dias;

        System.out.print("\nIdade em dias: " + idadeEmDias);

        read.close();
    }
}