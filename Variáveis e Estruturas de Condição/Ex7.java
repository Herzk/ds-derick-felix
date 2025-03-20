import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um valor inteiro: ");
        int n = read.nextInt();
        int a = n - 1;

        System.out.print("\nO antecessor do valor inserido é: " + a);

        read.close();
    }
}
