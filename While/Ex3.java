import java.util.Scanner;
public class Ex3{
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);

        System.out.print("Insira um número natural n: ");
        int n = read.nextInt(); int p = 2; int i = 1;

        System.out.println("Números pares de 1 a n:");
        while(p <= n){
            System.out.print(p + "; ");
            p+=2;
        };

        System.out.println("Números ímpares de 1 a n:");
        while(i <= n){
            System.out.print(i + "; ");
            i+=2;
        }
    }
}